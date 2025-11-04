package com.school.main;

// On-demand imports as required by question
import com.school.data.*;
import com.school.util.*;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("=== 🎓 Student Performance Analyzer ===\n");

        // 1️⃣ Create Student object
        Student student = new Student("Meenakshi Gupta", 85, 92, 78);

        // 2️⃣ Create Analyzer object
        Analyzer analyzer = new Analyzer();

        // 3️⃣ Calculate average and grade
        double average = analyzer.calculateAverage(student);
        String grade = analyzer.findGrade(average);

        // 4️⃣ Display results
        System.out.println(student);  // Uses toString()
        System.out.println("\nAverage Marks: " + average);
        System.out.println("Grade: " + grade);
    }
}
