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
public class TestClass implements TestInterface{
    
    public static void main(String[] args) {
        TestClass test = new TestClass();
        test.square(10);
        
        test.show();
        
        TestClassTwo testTwo = new TestClassTwo();
        testTwo.square(20);
        
        testTwo.show();
    }

    @Override
    public void square(int a) {
        System.out.println("Square from TestClass");
    }
    
    
}

interface TestInterfaceTwo extends TestInterface{
    default void show(){
        System.out.println("Show from TestInterfaceTwo");
    }
}

class TestClassTwo implements TestInterfaceTwo{

    @Override
    public void square(int a) {
        System.out.println("Square from TestClassTwo");
    }

    @Override
    public void show() {
        TestInterfaceTwo.super.show(); //To change body of generated methods, choose Tools | Templates.
    }  
}
