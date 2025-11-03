package level2;

class MovieTicket {
    String movieName;
    int seatNumber;
    double price;
    boolean booked;

    // Constructor
    MovieTicket(String movieName) {
        this.movieName = movieName;
        this.booked = false;
    }

    // Method to book a ticket
    void bookTicket(int seatNumber, double price) {
        if (!booked) {
            this.seatNumber = seatNumber;
            this.price = price;
            this.booked = true;
            System.out.println("Ticket booked successfully!");
        } else {
            System.out.println("Seat already booked!");
        }
    }

    // Method to display ticket details
    void displayDetails() {
        if (booked) {
            System.out.println("Movie: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price: " + price);
        } else {
            System.out.println("No ticket booked yet.");
        }
    }
}

public class MovieBooking {
    public static void main(String[] args) {
        MovieTicket ticket1 = new MovieTicket("Inception");
        ticket1.bookTicket(12, 300.0);
        ticket1.displayDetails();
    }
}
