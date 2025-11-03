package accesmodifier;

class Student {
    public int rollNumber;       // public
    protected String name;       // protected
    private double CGPA;         // private

    // Constructor
    Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Public methods to access and modify private CGPA
    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    public void display() {
        System.out.println("Roll: " + rollNumber + ", Name: " + name + ", CGPA: " + CGPA);
    }
}

// Subclass demonstrating access to protected member
class PostgraduateStudent extends Student {
    String specialization;

    PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }

    void displayPGDetails() {
        // Can access protected 'name' here
        System.out.println("PG Student: " + name + " (Roll: " + rollNumber + "), Specialization: " + specialization);
    }

    public static void main(String[] args) {
        PostgraduateStudent pg = new PostgraduateStudent(101, "Meenakshi", 9.1, "AI & ML");
        pg.display();
        pg.displayPGDetails();

        // Modify CGPA using setter
        pg.setCGPA(9.3);
        System.out.println("Updated CGPA: " + pg.getCGPA());
    }
}
