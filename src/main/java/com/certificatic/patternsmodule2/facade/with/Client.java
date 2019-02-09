/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.certificatic.patternsmodule2.facade.with;

/**
 *
 * @author alfonso.valdez
 */
public class Client {
    
    public void makeReservation(){
        //code to make reservation
        ReservationService reservationService = new ReservationService();
        reservationService.reserveRoom();
        reservationService.modify();
        reservationService.confirm();
        reservationService.cancel();
    }
}
