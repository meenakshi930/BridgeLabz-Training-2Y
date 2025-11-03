package level1;

class LibraryBook {
    String title;
    String author;
    double price;
    boolean available;

    // Constructor
    LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true; // initially available
    }

    void borrowBook() {
        if (available) {
            available = false;
            System.out.println(title + " has been borrowed.");
        } else {
            System.out.println(title + " is not available.");
        }
    }
    void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price + ", Available: " + available);
    }
    public static void main(String[] args) {
        LibraryBook lb1 = new LibraryBook("Data Structures", "Mark Allen", 300);

        lb1.display();
        lb1.borrowBook();
        lb1.borrowBook();
    }
}
