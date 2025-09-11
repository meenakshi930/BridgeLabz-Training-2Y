package level1;
class Employee {
    String name;
    int id;
    double salary;

    // Constructor
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display employee details
    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: " + salary);
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Meenakshi", 101, 55000.0);
        emp1.displayDetails();
    }
}
