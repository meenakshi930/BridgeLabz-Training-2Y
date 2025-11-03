package accesmodifier;

class Employee {
    public int employeeID;        // public
    protected String department;  // protected
    private double salary;        // private

    // Constructor
    Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to modify private salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void display() {
        System.out.println("EmployeeID: " + employeeID + ", Department: " + department + ", Salary: " + salary);
    }
}

// Subclass demonstrating access to public and protected members
class Manager extends Employee {
    String teamName;

    Manager(int employeeID, String department, double salary, String teamName) {
        super(employeeID, department, salary);
        this.teamName = teamName;
    }

    void displayManagerDetails() {
        // Can access employeeID (public) and department (protected)
        System.out.println("Manager - ID: " + employeeID + ", Dept: " + department + ", Team: " + teamName);
    }

    public static void main(String[] args) {
        Manager m = new Manager(2001, "IT", 80000, "Dev Team");
        m.display();
        m.displayManagerDetails();

        m.setSalary(90000);
        System.out.println("Updated Salary: " + m.getSalary());
    }
}
