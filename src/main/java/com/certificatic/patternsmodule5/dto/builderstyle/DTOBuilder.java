/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.certificatic.patternsmodule5.dto.builderstyle;

import java.io.Serializable;

/**
 *
 * @author alfonso.valdez
 */
public class DTOBuilder implements Serializable{
    private String name;
    private String addr;
    private String city;
    DTOBuilder(){
    }
    DTOBuilder(String name, String addr, String city){
     this.name = name;
     this.addr = addr;
     this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
    
}
