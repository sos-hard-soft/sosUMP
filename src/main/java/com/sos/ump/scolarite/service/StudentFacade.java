/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sos.ump.scolarite.service;

import com.sos.ump.scolarite.model.Student;
import com.sos.ump.scolarite.model.apogee.Individu;
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
    
    
    public Individu findByCne(String cne) {
        Individu individu;
        try {
            individu = em.createNamedQuery("Individu.findByCodNneInd", Individu.class).setParameter("cne", cne).getSingleResult();
            return individu;
        } catch (NoResultException ex) {
            return null;
        }
        
    }
    
}
