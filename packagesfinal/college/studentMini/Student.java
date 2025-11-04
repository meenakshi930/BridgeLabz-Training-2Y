package college.studentMini;

public class Student {
    private String name;
    private int rollNo;
    private double marks1;
    private double marks2;
    private double marks3;

    public Student(String name, int rollNo, double marks1, double marks2, double marks3) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public double getAverageMarks() {
        return (marks1 + marks2 + marks3) / 3;
    }

    @Override
    public String toString() {
        return "Student Name: " + name + "\nRoll No: " + rollNo +
               "\nMarks: " + marks1 + ", " + marks2 + ", " + marks3;
    }
}
