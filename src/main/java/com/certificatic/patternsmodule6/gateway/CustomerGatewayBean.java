/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.certificatic.patternsmodule6.gateway;

import javax.ejb.Local;
import javax.ejb.Remove;
import javax.ejb.Stateful;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

/**
 *
 * @author alfonso.valdez
 */
@Stateful
@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
@Local(CustomerGateway.class)
public class CustomerGatewayBean implements CustomerGateway {

    @PersistenceContext(unitName = "myJPA", type = PersistenceContextType.EXTENDED)
    EntityManager em;

    private Guest guest;

    @Override
    public Guest find(long id) {
        this.guest = this.em.find(Guest.class, id);
        return this.guest;
    }

    public Guest getGuest() {
        return guest;
    }

    public void remove(long id) {
        Guest ref = this.em.getReference(Guest.class, id);
        this.em.remove(ref);
    }

    @TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
    public void save() {

    }

    @Remove
    public void closeGateway() {

    }
}
