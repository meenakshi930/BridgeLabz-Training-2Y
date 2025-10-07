// Interface: MedicalRecord
interface MedicalRecord {
    void addRecord(String diagnosis);
    void viewRecords();
}

// Abstract class: Patient
abstract class Patient implements MedicalRecord {
    private String patientId;
    private String name;
    private int age;
    private StringBuilder medicalHistory = new StringBuilder();

    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // Encapsulated Getters
    public String getPatientId() { return patientId; }
    public String getName() { return name; }
    public int getAge() { return age; }

    protected String getMedicalHistory() {
        return medicalHistory.toString();
    }

    // Abstract method
    public abstract double calculateBill();

    // Concrete method
    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Medical History: " + (medicalHistory.length() == 0 ? "None" : medicalHistory));
        System.out.println("Total Bill: ₹" + calculateBill());
    }

    // Interface methods
    @Override
    public void addRecord(String diagnosis) {
        if (diagnosis != null && !diagnosis.isEmpty()) {
            medicalHistory.append(diagnosis).append("; ");
        }
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Records for " + name + ": " + (medicalHistory.length() == 0 ? "None" : medicalHistory));
    }
}

// Subclass: InPatient
class InPatient extends Patient {
    private int daysAdmitted;
    private double dailyRate;

    public InPatient(String patientId, String name, int age, int daysAdmitted, double dailyRate) {
        super(patientId, name, age);
        this.daysAdmitted = daysAdmitted;
        this.dailyRate = dailyRate;
    }

    @Override
    public double calculateBill() {
        return daysAdmitted * dailyRate;
    }
}

// Subclass: OutPatient
class OutPatient extends Patient {
    private double consultationFee;

    public OutPatient(String patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }
}

// Main class
public class HospitalSystem {
    public static void main(String[] args) {
        Patient[] patients = {
            new InPatient("P101", "Amit Sharma", 45, 4, 2500),
            new OutPatient("P202", "Sneha Verma", 30, 800)
        };

        patients[0].addRecord("Diabetes");
        patients[0].addRecord("High Blood Pressure");
        patients[1].addRecord("Seasonal Allergy");

        for (Patient p : patients) {
            System.out.println("---------------");
            p.getPatientDetails();
            p.viewRecords();
        }
    }
}