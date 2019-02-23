/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.certificatic.patternsmodule6.servicefacade;

import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

/**
 *
 * @author alfonso.valdez
 */
@Stateless
@Local(ReservationServiceLocal.class)
@Remote(ReservationServiceRemote.class)
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class ReservationService implements ReservationServiceLocal, ReservationServiceRemote{
    
    @Inject
    Guest myGuest;
    
    @Inject
    Reservation myReservation;

    @Override
    public void addGuest() {
        myGuest.create();
    }

    @Override
    public void updateGuest() {
        myGuest.update();
    }

    @Override
    public void addReservation() {
        myReservation.make();
    }

    @Override
    public void removeReservation() {
       myReservation.cancel();
    }
    
    
    
}
