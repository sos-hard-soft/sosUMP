/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sos.ump.scolarite.service;

import com.sos.ump.scolarite.model.Student;
import com.sos.ump.scolarite.model.apogee.Individu;
import java.util.Objects;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

/**
 *
 * @author mab.salhi
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
    
    
    public Individu findByCne(String cne, String cin) {
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
    
}
