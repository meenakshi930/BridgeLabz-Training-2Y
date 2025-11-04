import college.student.Student;    // Import Student class
import college.faculty.Faculty;    // Import Faculty class

public class Main {
    public static void main(String[] args) {
        // Create objects
        Student student = new Student("Meenakshi", 101);
        Faculty faculty = new Faculty("Dr. Sharma", "Computer Science");

        // Display details
        student.displayStudentDetails();
        faculty.displayFacultyDetails();
    }
}
