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
public class HotelSearchService {
    
    private Room[] rooms = {new Room(), new Room(), new Room()};
    
    public Room[] findRooms(){
        //searching rooms
        return rooms;
    }
}
