package college.main;

// Importing from multiple packages
import college.studentMini.*;
import college.facultyMini.*;
import college.department.*;

// Static import for Math.round()
import static java.lang.Math.round;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("=== 🎓 College Management System ===\n");

        // 1️⃣ Create student object
        Student student = new Student("Meenakshi Gupta", 101, 88.5, 92.0, 79.5);

        // 2️⃣ Create faculty object
        Faculty faculty = new Faculty("Dr. Sharma", "Computer Science", 12);

        // 3️⃣ Create department object
        Department department = new Department("Computer Science", "Dr. Sharma", 250);

        // 4️⃣ Display all information
        System.out.println("--- 🧑‍🎓 Student Details ---");
        System.out.println(student);
        System.out.println("Average Marks: " + round(student.getAverageMarks()) + "\n");

        System.out.println("--- 👩‍🏫 Faculty Details ---");
        System.out.println(faculty + "\n");

        System.out.println("--- 🏛 Department Details ---");
        System.out.println(department + "\n");

        System.out.println("✅ Complete College Report Generated Successfully!");
    }
}
