package level1;

class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double costPerDay = 1000.0; // fixed cost per day

    // Constructor
    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    double calculateTotalCost() {
        return rentalDays * costPerDay;
    }

    void display() {
        System.out.println("Customer: " + customerName + ", Car: " + carModel +
                ", Days: " + rentalDays + ", Total Cost: " + calculateTotalCost());
    }
     public static void main(String[] args) {
        CarRental cr1 = new CarRental("Meenakshi", "Hyundai i20", 5);
        cr1.display();
    }
}
