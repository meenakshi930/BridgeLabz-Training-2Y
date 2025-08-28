package level3;
import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking year input
        System.out.print("Enter a year(>= 1582): ");
        int year = sc.nextInt();

        // Check Gregorian calendar start
        if (year < 1582) {
            System.out.println("The program only works for year >= 1582 (Gregorian calendar).");
        } else {
            // -------- Approach 1: Using multiple if-else --------
            if (year % 400 == 0) {
                System.out.println(year + " is a Leap Year .");
            } else if (year % 100 == 0) {
                System.out.println(year + " is NOT a Leap Year.");
            } else if (year % 4 == 0) {
                System.out.println(year + " is a Leap Year .");
            } else {
                System.out.println(year + " is NOT a Leap Year .");
            }

            // -------- Approach 2: Using single if with logical operators --------
        
        }

        sc.close();
    }
}

