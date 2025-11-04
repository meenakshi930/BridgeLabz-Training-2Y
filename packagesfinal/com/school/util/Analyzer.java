package com.school.util;

import com.school.data.Student; // Import specific class for reference

public class Analyzer {

    // Method to calculate average
    public double calculateAverage(Student s) {
        double average = (s.getMarks1() + s.getMarks2() + s.getMarks3()) / 3.0;
        return average;
    }

    // Method to find grade based on average
    public String findGrade(double average) {
        if (average >= 90) return "A+";
        else if (average >= 80) return "A";
        else if (average >= 70) return "B";
        else if (average >= 60) return "C";
        else if (average >= 50) return "D";
        else return "F";
    }
}
