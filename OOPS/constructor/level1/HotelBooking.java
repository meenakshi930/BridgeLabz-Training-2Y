package level1;
class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    // Default constructor
    HotelBooking() {
        this.guestName = "Unknown";
        this.roomType = "Standard";
        this.nights = 1;
    }

    // Parameterized constructor
    HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor
    HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    void display() {
        System.out.println("Guest: " + guestName + ", Room: " + roomType + ", Nights: " + nights);
    }
    public static void main(String[] args) {
        HotelBooking h1 = new HotelBooking();
        HotelBooking h2 = new HotelBooking("John Doe", "Deluxe", 3);
        HotelBooking h3 = new HotelBooking(h2); // copy constructor

        h1.display();
        h2.display();
        h3.display();
    }
}