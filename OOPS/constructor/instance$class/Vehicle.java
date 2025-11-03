package instance$class;

class Vehicle {
    String ownerName;     // instance variable
    String vehicleType;   // instance variable
    static double registrationFee = 5000.0; // class variable

    // Constructor
    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method
    void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName + ", Vehicle Type: " + vehicleType +
                           ", Registration Fee: " + registrationFee);
    }

    // Class method
    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Meenakshi", "Car");
        Vehicle v2 = new Vehicle("Arjun", "Bike");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        Vehicle.updateRegistrationFee(6000.0); // update for all vehicles

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}
