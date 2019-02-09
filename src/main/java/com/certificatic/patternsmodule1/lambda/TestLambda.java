/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.certificatic.patternsmodule1.lambda;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

/**
 *
 * @author alfonso.valdez
 */
public class TestLambda {
    public static void main(String[] args) {
        //Supplier
        Supplier<String> i = ()->"Hola me llamo Alfonso Valdez";
        System.out.println(i.get());
        
        Supplier<Hello> j = () -> new Hello();
        System.out.println(j.get().getYear());
        
        //Consumer
        Map<String, Integer> ages = new HashMap<>();
        ages.put("Alfonso",34);
        ages.put("Enrique",40);
        ages.put("Luis",30);
        ages.forEach((name,age)-> System.out.println(name+" is "+age+" years old"));
    }
}

class Hello{
    private int year = 2019;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
}
