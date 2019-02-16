/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.certificatic.patternsmodule3.interfacepattern;

/**
 *
 * @author alfonso.valdez
 */
public class InterfacePattern {
    public static void main(String[] args) {
        Thread t1 = new Thread(new EventHandler());
        t1.start();
        
        Thread t2 = new Thread(new ImageResolver());
        t2.start();
    }
}

class EventHandler implements Runnable{

    @Override
    public void run() {
        System.out.println("EventHanldler log");
    }
    
}

class ImageResolver implements Runnable{

    @Override
    public void run() {
        System.out.println("ImageResolver log");
    }
    
}

