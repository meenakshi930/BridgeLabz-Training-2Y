package level3;

import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input year
        System.out.print("Enter a year (>= 1582): ");
        int year = sc.nextInt();

        // Gregorian calendar check
        if (year >= 1582) {
            // Single if using logical operators
            if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is NOT a Leap Year.");
            }
        } else {
            System.out.println("The program only works for year >= 1582 (Gregorian calendar).");
        }

        sc.close();
    }
}

