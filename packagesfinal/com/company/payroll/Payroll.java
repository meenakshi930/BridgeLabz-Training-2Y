package com.company.payroll;

import com.company.hr.Employee; // Single import of Employee class

public class Payroll {

    // Method to calculate 10% bonus
    public double calculateBonus(Employee e) {
        double bonus = e.getSalary() * 0.10;
        double totalSalary = e.getSalary() + bonus;
        return totalSalary;
    }
}
