package library.books;

public class Book {
	 private String title;
	    private String author;
	    private boolean isIssued;
public Book(String title, String author) {
	        this.title = title;
	        this.author = author;
	        this.isIssued = false;
}
public void displayBookDetails() {
	System.out.println("Book Title: " + title);
	System.out.println("Author: " + author);
	System.out.println("Issued: " + (isIssued ? "Yes" : "No"));
}
public boolean isIssued() {
    return isIssued;
}

public void setIssued(boolean issued) {
    this.isIssued = issued;
}

public String getTitle() {
    return title;
	
}
}
