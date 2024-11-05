/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ınheritanceexamples;

/**
 *
 * @author ASUS
 */
public class Employee {
    float salary;

    public Employee(float salary) {
        this.salary = salary;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        System.out.println("Salary is changed.");
        this.salary = salary;
    }
    
}
