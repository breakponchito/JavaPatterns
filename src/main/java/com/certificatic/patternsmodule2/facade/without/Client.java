/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.certificatic.patternsmodule2.facade.without;

/**
 *
 * @author alfonso.valdez
 */
public class Client {
    
    public void makeReservation(){
        //code to make reservation
        HotelSearchService search = new HotelSearchService();
        Room[] rooms = search.findRooms();
        //more code
        Guest theGuest = new Guest();
        //more code
    }
}
