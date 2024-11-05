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
public class InheritanceExamples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee e = new Employee(15000);
        System.out.println("Employee salary: " + e.getSalary());
        e.setSalary(10000);
        System.out.println("Employee salary: " + e.getSalary());
        
        Programmer p = new Programmer(15000, 4000);
        Programmer p2 = new Programmer(17000, 5000);
        System.out.println("Programmer salary: " + p.getSalary());
        System.out.println("Programmer bonus: " + p.getBonus());
        float total = p.getSalary()+p.getBonus();
        System.out.println("Programmer total: " + total);
        
        System.out.println("Programmer salary: " + p2.getSalary());
        System.out.println("Programmer bonus: " + p2.getBonus());
        
        Manager m = new Manager(20000, 5000, 5000, 2);
        System.out.println("Manager salary: " + m.getSalary());
        System.out.println("Manager bonus: " + m.getBonus());
        System.out.println("Manager project bonus: " + m.getProject_bonus());
        
        SystemProgrammer sp = new SystemProgrammer(15000, 7500);
        System.out.println("System programmer salary: " + sp.getSalary());
        System.out.println("System programmer bonus: " + sp.getBonus());
        
        float total2;
        total2 = e.getSalary() + p.getSalary() +
                p2.getSalary() + m.getSalary() + sp.getSalary();
        System.out.println("Company total salary: " + total2);
    }
    
}
