// Interface: GPS
interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

// Abstract class: Vehicle
abstract class Vehicle implements GPS {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;
    private String currentLocation;

    public Vehicle(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
        this.currentLocation = currentLocation;
    }

    // Encapsulated Getters
    public String getVehicleId() { return vehicleId; }
    public String getDriverName() { return driverName; }
    public double getRatePerKm() { return ratePerKm; }

    protected void setRatePerKm(double ratePerKm) {
        this.ratePerKm = ratePerKm;
    }

    // Abstract method
    public abstract double calculateFare(double distance);

    // Concrete method
    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Rate per Km: ₹" + ratePerKm);
        System.out.println("Current Location: " + currentLocation);
    }

    // GPS interface methods
    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }
}

// Subclass: Car
class Car extends Vehicle {
    private double baseFare = 50;

    public Car(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        super(vehicleId, driverName, ratePerKm, currentLocation);
    }

    @Override
    public double calculateFare(double distance) {
        return baseFare + (getRatePerKm() * distance);
    }
}

// Subclass: Bike
class Bike extends Vehicle {
    public Bike(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        super(vehicleId, driverName, ratePerKm, currentLocation);
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }
}

// Subclass: Auto
class Auto extends Vehicle {
    private double minimumFare = 30;

    public Auto(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        super(vehicleId, driverName, ratePerKm, currentLocation);
    }

    @Override
    public double calculateFare(double distance) {
        double fare = getRatePerKm() * distance;
        return fare < minimumFare ? minimumFare : fare;
    }
}

// Main class
public class RideHailingApp  {
    public static void main(String[] args) {
        Vehicle[] rides = {
            new Car("CAR-101", "Amit Sharma", 12.5, "Sector 21"),
            new Bike("BIKE-202", "Sneha Verma", 8.0, "MG Road"),
            new Auto("AUTO-303", "Rahul Singh", 10.0, "Station Road")
        };

        double distance = 5.0; // in kilometers

        for (Vehicle v : rides) {
            System.out.println("---------------");
            v.getVehicleDetails();
            System.out.println("Fare for " + distance + " km: ₹" + v.calculateFare(distance));
            v.updateLocation("Customer Pickup Point");
            System.out.println("Updated Location: " + v.getCurrentLocation());
        }
    }
}