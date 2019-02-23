/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.certificatic.patternsmodule6.service;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

/**
 *
 * @author alfonso.valdez
 */
@Stateless
@Local(ShippingService.class)
@TransactionAttribute(TransactionAttributeType.MANDATORY)
public class ShippingBean implements ShippingService{

    @Override
    public void ship() {
        
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    
}
