/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sos.ump.scolarite.services;

import com.sos.ump.scolarite.model.Files;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author mabsalhi.sos
 */
@Stateless
public class FilesFacade extends AbstractFacade<Files> {
    @PersistenceContext(unitName = "scolpu")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public FilesFacade() {
        super(Files.class);
    }
    
}
