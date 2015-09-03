/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sos.ump.scolarite.services;

import com.sos.ump.scolarite.model.Student;
import com.sos.ump.scolarite.model.apogee.Individu;
import com.sos.ump.scolarite.model.apogee.InsAdmEtp;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

/**
 *
 * @author mabsalhi.sos
 */
@Stateless
public class StudentFacade extends AbstractFacade<Student> {
    @PersistenceContext(unitName = "scolpu")
    private EntityManager em;
    
    @PersistenceContext(unitName = "apoPU")
    private EntityManager apoem;
    
   

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public StudentFacade() {
        super(Student.class);
    }

    public Individu findApoStudent(String cne, String cin) {
        Individu individu;
        Individu test;
        try {
            individu = apoem.createNamedQuery("Individu.findByCodNneInd", Individu.class).setParameter("codNneInd", cne).getSingleResult();
            test = apoem.createNamedQuery("Individu.findByCinInd", Individu.class).setParameter("cinInd", cin).getSingleResult();
            if (Objects.equals(individu.getCodEtu(), test.getCodEtu())) {
            return individu;    
            }else{
                return null;
            }
            
        } catch (NoResultException ex) {
            return null;
        }
        
    }
    
    public List<InsAdmEtp> findInscAdministrative(Integer codeApo){
        Individu individu;
        List<InsAdmEtp> inscriptions;
        long code = 0;
        System.out.println("Debut de la procedure de recherche");
        /*
        * Recherche du code individu par numéro apogee
        */
        
        try {
            individu = apoem.createNamedQuery("Individu.findByCodEtu", Individu.class).setParameter("codEtu", codeApo).getSingleResult();
            code = individu.getCodInd();
            System.out.println("le code de l'etudiant est : " + code);
        } catch (NoResultException ex) {
        }
        
        try {
            inscriptions = apoem.createNamedQuery("InsAdmEtp.findByCodInd", InsAdmEtp.class).setParameter("codInd", code).getResultList();
            System.out.println("recherche frucueuse !!!");
            System.out.println("Recherche d'inscriptions terminer : " + inscriptions.get(0));
            return inscriptions;
        } catch (NoResultException ex) {
            return null;
        }
        
    }

    
    
}
