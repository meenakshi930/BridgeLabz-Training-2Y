package accesmodifier;
class Book {
    public String ISBN;      // public
    protected String title;  // protected
    private String author;   // private

    // Constructor
    Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Public methods for private author
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void display() {
        System.out.println("ISBN: " + ISBN + ", Title: " + title + ", Author: " + author);
    }
}

// Subclass demonstrating access to public and protected members
class EBook extends Book {
    double fileSizeMB;

    EBook(String ISBN, String title, String author, double fileSizeMB) {
        super(ISBN, title, author);
        this.fileSizeMB = fileSizeMB;
    }

    void displayEBookDetails() {
        // Can access ISBN (public) and title (protected)
        System.out.println("EBook - ISBN: " + ISBN + ", Title: " + title + ", File Size: " + fileSizeMB + "MB");
    }

    public static void main(String[] args) {
        EBook eb = new EBook("978-1234567890", "Java OOP", "James Gosling", 5.5);
        eb.display();
        eb.displayEBookDetails();

        // Update private author using setter
        eb.setAuthor("Updated Author");
        System.out.println("Updated Author: " + eb.getAuthor());
    }
}
