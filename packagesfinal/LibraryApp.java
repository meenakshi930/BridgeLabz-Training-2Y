import library.books.Book;
import library.members.Member;
import library.transactions.Transaction;

public class LibraryApp {
    public static void main(String[] args) {
        System.out.println("=== 📚 Library Management System ===\n");
        Book book = new Book("Clean Code", "Robert C. Martin");
        book.displayBookDetails();

        Member member = new Member("Meenakshi Gupta", 1001);
        member.displayMemberDetails();

        Transaction transaction = new Transaction();
        transaction.issueBook(book, member);

        System.out.println("\nUpdated Book Info:");
        book.displayBookDetails();

        transaction.returnBook(book, member);
    }
}
