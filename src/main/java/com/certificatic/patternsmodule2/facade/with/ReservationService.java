/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.certificatic.patternsmodule2.facade.with;

import com.certificatic.patternsmodule2.facade.without.Guest;
import com.certificatic.patternsmodule2.facade.without.HotelSearchService;
import com.certificatic.patternsmodule2.facade.without.Reservation;
import com.certificatic.patternsmodule2.facade.without.Room;

/**
 *
 * @author alfonso.valdez
 */
public class ReservationService {

    public void cancel() {
        Reservation r = new Reservation();
        r.cancel();
        Room room = new Room();
        room.setAvailable();
    }

    public void confirm() {
        Reservation r = new Reservation();
        r.create();
    }

    public void modify() {
        Guest g = new Guest();
        g.updateProfile();
    }

    public void reserveRoom() {
        HotelSearchService search = new HotelSearchService();
        search.findRooms();
    }
}
