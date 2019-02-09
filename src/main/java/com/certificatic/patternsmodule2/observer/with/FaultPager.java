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
public class FaultPager implements FaultListener{

    @Override
    public void faultEvent(Fault fault, String msg) {
        //doing paging
        System.out.println("doing paging with message->"+msg);
    }
    
}
