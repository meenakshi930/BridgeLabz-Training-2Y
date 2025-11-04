package college.facultyMini;

public class Faculty {
    private String name;
    private String subject;
    private int experience;

    public Faculty(String name, String subject, int experience) {
        this.name = name;
        this.subject = subject;
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Faculty Name: " + name +
               "\nSubject: " + subject +
               "\nExperience: " + experience + " years";
    }
}
