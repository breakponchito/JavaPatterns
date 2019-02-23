/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.certificatic.patternsmodule5.dto.builderstyle;

/**
 *
 * @author alfonso.valdez
 */
public class Builder extends DTOBuilder{
    
    public Builder name(String name){
        this.setName(name);
        return this;
    }
    
    public Builder address(String addr){
        this.setAddr(addr);
        return this;
    }
    
    public Builder city(String city){
        this.setCity(city);
        return this;
    }
}
