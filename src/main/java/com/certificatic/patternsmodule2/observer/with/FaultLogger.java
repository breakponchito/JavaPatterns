/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.certificatic.patternsmodule2.observer.with;

import com.certificatic.patternsmodule2.observer.without.Fault;

/**
 *
 * @author alfonso.valdez
 */
public class FaultLogger implements FaultListener{

    @Override
    public void faultEvent(Fault fault, String msg) {
        //log the message
        System.out.println("Doing loging with message->"+msg);
    }
    
    
    
}
