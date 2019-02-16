/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.certificatic.patternsmodule3.defaultmethods;

/**
 *
 * @author alfonso.valdez
 */
public interface TestInterface {
    public void square(int a);
    
    default void show(){
        System.out.println("Default method show");
    }
}
