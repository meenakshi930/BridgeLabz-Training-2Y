package library.transactions;

import library.books.Book;
import library.members.Member;

public class Transaction {

    public void issueBook(Book book, Member member) {
        if (!book.isIssued()) {
            book.setIssued(true);
            System.out.println("\n✅ Book issued successfully!");
            System.out.println("Book: " + book.getTitle());
            System.out.println("Issued to: " + member.getName());
        } else {
            System.out.println("\n❌ Book already issued to someone else!");
        }
    }

    public void returnBook(Book book, Member member) {
        if (book.isIssued()) {
            book.setIssued(false);
            System.out.println("\n🔁 Book returned successfully!");
            System.out.println("Book: " + book.getTitle());
            System.out.println("Returned by: " + member.getName());
        } else {
            System.out.println("\n⚠️ This book was not issued yet.");
        }
    }
}
