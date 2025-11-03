// Interface: Department
interface Department {
    void assignDepartment(String deptName);
    String getDepartmentDetails();
}

// Abstract class: Employee
abstract class Employee implements Department {
    private int employeeId;
    private String name;
    private double baseSalary;
    private String department;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Encapsulated Getters and Setters
    public int getEmployeeId() { return employeeId; }
    public String getName() { return name; }
    public double getBaseSalary() { return baseSalary; }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    // Interface methods
    @Override
    public void assignDepartment(String deptName) {
        this.department = deptName;
    }

    @Override
    public String getDepartmentDetails() {
        return department;
    }

    // Abstract method
    public abstract double calculateSalary();

    // Concrete method
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: ₹" + baseSalary);
        System.out.println("Department: " + department);
        System.out.println("Final Salary: ₹" + calculateSalary());
    }
}

// Subclass: FullTimeEmployee
class FullTimeEmployee extends Employee {
    private double bonus;

    public FullTimeEmployee(int employeeId, String name, double baseSalary, double bonus) {
        super(employeeId, name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + bonus;
    }
}

// Subclass: PartTimeEmployee
class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(int employeeId, String name, double baseSalary, int hoursWorked, double hourlyRate) {
        super(employeeId, name, baseSalary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + (hoursWorked * hourlyRate);
    }
}

// Test class
public class EmployeeSystem {
    public static void main(String[] args) {
        Employee[] employees = {
            new FullTimeEmployee(101, "Amit Sharma", 50000, 10000),
            new PartTimeEmployee(102, "Sneha Verma", 20000, 40, 300)
        };

        employees[0].assignDepartment("Engineering");
        employees[1].assignDepartment("Support");

        for (Employee emp : employees) {
            System.out.println("---------------");
            emp.displayDetails();
        }
    }
}