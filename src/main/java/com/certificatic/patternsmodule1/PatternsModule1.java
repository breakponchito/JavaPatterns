/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.certificatic.patternsmodule1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alfonso.valdez
 */
public class PatternsModule1 extends A {

    public static void main(String[] args) {
        PatternsModule1 p1 = new PatternsModule1();
        p1.add(new PatternsModule1());
        List<String> l = new ArrayList<String>();
    }

    @Override
    void add(Object o) {
        System.out.println("enter to add override");
    }

    void add(B o) {
        System.out.println("enter to add overloading");
    }

}

abstract class A {

    private int number = 0;
    private Object o = null;

    abstract void add(Object o);

    void add() {
        System.out.println("Hello");
    }
}

class B {

}
