/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.certificatic.patternsmodule1.composition;

/**
 *
 * @author alfonso.valdez
 */
public class Department {

    private String departmentName;

    private int size;

    private EmployeeList employee;

    public boolean addEmployee(Employee e) {
        return true;
    }

    public Employee getEmployee(int index) {
        return new Employee();
    }
}

class EmployeeList {

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

class Employee {

}
