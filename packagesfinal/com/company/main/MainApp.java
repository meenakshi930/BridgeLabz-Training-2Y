package com.company.main;

// Using on-demand import for both packages
import com.company.hr.*;
import com.company.payroll.*;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("=== Employee Management System ===\n");

        // 1️⃣ Create an Employee object
        Employee emp = new Employee(101, "Meenakshi Gupta", "Design", 50000);

        // 2️⃣ Display Employee details
        emp.displayEmployeeDetails();

        // 3️⃣ Create Payroll object and calculate bonus
        Payroll payroll = new Payroll();
        double totalSalary = payroll.calculateBonus(emp);

        // 4️⃣ Display updated salary
        System.out.println("\nAfter Bonus:");
        System.out.println("Total Salary (with 10% Bonus): ₹" + totalSalary);
    }
}
