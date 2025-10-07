// Interface: Insurable
interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

// Abstract class: Vehicle
abstract class Vehicle implements Insurable {
    private String vehicleNumber;
    private String type;
    private double rentalRate;
    private String insurancePolicyNumber;

    public Vehicle(String vehicleNumber, String type, double rentalRate, String insurancePolicyNumber) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    // Encapsulated Getters and Setters
    public String getVehicleNumber() { return vehicleNumber; }
    public String getType() { return type; }
    public double getRentalRate() { return rentalRate; }
    public void setRentalRate(double rentalRate) { this.rentalRate = rentalRate; }

    protected String getInsurancePolicyNumber() {
        return insurancePolicyNumber;
    }

    // Abstract method
    public abstract double calculateRentalCost(int days);

    // Concrete method
    public void displayDetails(int days) {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Type: " + type);
        System.out.println("Rental Rate: ₹" + rentalRate + "/day");
        System.out.println("Rental Cost for " + days + " days: ₹" + calculateRentalCost(days));
        System.out.println(getInsuranceDetails());
        System.out.println("Insurance Cost: ₹" + calculateInsurance());
    }
}

// Subclass: Car
class Car extends Vehicle {
    private boolean luxury;

    public Car(String vehicleNumber, double rentalRate, boolean luxury, String insurancePolicyNumber) {
        super(vehicleNumber, "Car", rentalRate, insurancePolicyNumber);
        this.luxury = luxury;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days + (luxury ? 500 : 0);
    }

    @Override
    public double calculateInsurance() {
        return luxury ? 1500 : 1000;
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance Policy: " + getInsurancePolicyNumber();
    }
}

// Subclass: Bike
class Bike extends Vehicle {
    private boolean helmetIncluded;

    public Bike(String vehicleNumber, double rentalRate, boolean helmetIncluded, String insurancePolicyNumber) {
        super(vehicleNumber, "Bike", rentalRate, insurancePolicyNumber);
        this.helmetIncluded = helmetIncluded;
    }

    @Override
    public double calculateRentalCost(int days) {
        // Add ₹100 if helmet is included
        return getRentalRate() * days + (helmetIncluded ? 100 : 0);
    }

    @Override
    public double calculateInsurance() {
        return 300;
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance Policy: " + getInsurancePolicyNumber() +
               (helmetIncluded ? " (Helmet Included)" : " (Helmet Not Included)");
    }
}

// Subclass: Truck
class Truck extends Vehicle {
    private double loadCapacity;

    public Truck(String vehicleNumber, double rentalRate, double loadCapacity, String insurancePolicyNumber) {
        super(vehicleNumber, "Truck", rentalRate, insurancePolicyNumber);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days + (loadCapacity > 10 ? 1000 : 500);
    }

    @Override
    public double calculateInsurance() {
        return 2000;
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance Policy: " + getInsurancePolicyNumber() +
               " (Load Capacity: " + loadCapacity + " tons)";
    }
}

// Main class
public class VehicleRentalSystem {
    public static void main(String[] args) {
        Vehicle[] fleet = {
            new Car("CAR-101", 1500, true, "CAR-POLICY-001"),
            new Bike("BIKE-202", 500, true, "BIKE-POLICY-002"),
            new Truck("TRUCK-303", 2500, 12.5, "TRUCK-POLICY-003")
        };

        int rentalDays = 5;

        for (Vehicle v : fleet) {
            System.out.println("---------------");
            v.displayDetails(rentalDays);
        }
    }
}
