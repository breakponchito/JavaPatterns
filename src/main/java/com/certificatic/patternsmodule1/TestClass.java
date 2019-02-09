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
public class TestClass {
    public static void main(String[] args) {
        Currency c1 = new Shekel();
        Currency c2 = new Pound();
        Currency c3 = new Krugerrand();
        c1.exchangeRate();
        c2.exchangeRate();
        c3.exchangeRate();
    }
}
