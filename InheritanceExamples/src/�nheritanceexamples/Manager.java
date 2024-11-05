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
public class Manager extends Programmer{
    
    int project_bonus, project_no;
    
    public Manager(float salary, int bonus, int project_bonus, int project_no) {
        super(salary, bonus);
        this.project_bonus = project_bonus;
        this.project_no = project_no;
    }

    public int getProject_bonus() {
        return project_bonus * project_no;
    }

    public void setProject_bonus(int project_bonus) {
        this.project_bonus = project_bonus;
    }

    public int getProject_no() {
        return project_no;
    }

    public void setProject_no(int project_no) {
        this.project_no = project_no;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
    
    
}
