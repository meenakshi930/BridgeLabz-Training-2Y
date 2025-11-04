package college.department;

public class Department {
    private String deptName;
    private String headOfDept;
    private int totalStudents;

    public Department(String deptName, String headOfDept, int totalStudents) {
        this.deptName = deptName;
        this.headOfDept = headOfDept;
        this.totalStudents = totalStudents;
    }

    @Override
    public String toString() {
        return "Department Name: " + deptName +
               "\nHead of Department: " + headOfDept +
               "\nTotal Students: " + totalStudents;
    }
}
