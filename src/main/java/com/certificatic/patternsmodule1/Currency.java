/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.certificatic.patternsmodule1;

/**
 *
 * @author alfonso.valdez
 */
public interface Currency {

    void exchangeRate();
    
}

class Shekel implements Currency {

    @Override
    public void exchangeRate() {
        System.out.println("From Shekel");
    }

}

class Pound implements Currency {

    @Override
    public void exchangeRate() {
        System.out.println("From Pound");
    }

}

class Krugerrand implements Currency {

    @Override
    public void exchangeRate() {
        System.out.println("From Krugerrand");
    }

}
