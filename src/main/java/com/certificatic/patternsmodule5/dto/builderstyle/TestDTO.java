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
public class TestDTO {
    
    public static void main(String[] args) {
        Builder b = new Builder().
                name("MyName").
                address("MyAddress").
                city("MyCity");
        
        System.out.println("Name:"+b.getName());
    }
}
