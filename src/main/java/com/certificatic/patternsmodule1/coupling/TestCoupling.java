/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.certificatic.patternsmodule1.coupling;

/**
 *
 * @author alfonso.valdez
 */
public class TestCoupling{
    
    public static void main(String[] args) {
        Thread t1 = new Thread(()-> System.out.println("Hola Mundo"));
        t1.start();
    }
}

class GameLoop implements Runnable{

    @Override
    public void run() {
        System.out.println("Execute Runnable "+Thread.currentThread().toString());
    }
    
}
