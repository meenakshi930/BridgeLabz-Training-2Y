import com.university.department.cse.Course; // Importing Course class from nested package

public class MainApp {
    public static void main(String[] args) {
        // Creating object of Course class
        Course cseCourse = new Course("Object-Oriented Programming", "CSE201", 4);
        
        // Display course details
        cseCourse.displayCourseDetails();
    }
}
