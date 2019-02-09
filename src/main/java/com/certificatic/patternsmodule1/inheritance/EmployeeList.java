/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.certificatic.patternsmodule1.inheritance;

/**
 *
 * @author alfonso.valdez
 */
public class EmployeeList {

    private Object elementData;
    private int size;

    public boolean add(Object o) {
        elementData = o;
        return true;
    }

    public void clear() {

    }

    public Object get(int index) {
        return new Object();
    }

    public void remove(int index) {

    }

    public int size() {
        return 10;
    }
}

class Department extends EmployeeList {

    private String departmentName;
    private int size;

    /*public boolean add(Object o){
        return true;
    }*/
    public boolean add(Employee e) {
        return true;
    }

    public Employee get(int index) {
        return new Employee();
    }
}

class Employee {

}
