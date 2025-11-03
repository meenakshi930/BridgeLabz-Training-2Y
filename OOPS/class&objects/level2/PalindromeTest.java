package level2;

class PalindromeChecker {
    String text;

    // Constructor
    PalindromeChecker(String text) {
        this.text = text;
    }

    // Method to check palindrome
    boolean isPalindrome() {
        String cleaned = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }

    // Method to display result
    void displayResult() {
        if (isPalindrome()) {
            System.out.println(text + " is a Palindrome.");
        } else {
            System.out.println(text + " is NOT a Palindrome.");
        }
    }
}

public class PalindromeTest {
    public static void main(String[] args) {
        PalindromeChecker p1 = new PalindromeChecker("madam");
        p1.displayResult();
    }
}
