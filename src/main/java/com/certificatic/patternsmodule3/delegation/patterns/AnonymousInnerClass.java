/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.certificatic.patternsmodule3.delegation.patterns;

/**
 *
 * @author alfonso.valdez
 */
public class AnonymousInnerClass {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable(){
            @Override
            public void run() {
                try{
                   while(true){
                        Thread.sleep(1000);
                        System.out.println(".");
                    } 
                }catch(InterruptedException ex){
                    System.out.println(ex.getMessage());
                }                
            }            
        });
        
        t1.start();
    }
 
}
