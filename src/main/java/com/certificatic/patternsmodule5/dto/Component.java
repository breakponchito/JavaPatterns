/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.certificatic.patternsmodule5.dto;

/**
 *
 * @author alfonso.valdez
 */
public class Component {
    
    public TransferObject getTO(){
        TransferObject transferObject = new TransferObject();
        transferObject.setPropertyA("propertyA");
        transferObject.setPropertyB("propertyB");
        return transferObject;
    }
}
