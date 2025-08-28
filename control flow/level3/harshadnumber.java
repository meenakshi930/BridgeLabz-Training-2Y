package level3;

import java.util.Scanner;

public class harshadnumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Get input number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Step 2: Initialize sum of digits
        int sum = 0;
        int originalNumber = number;

        // Step 3: Use loop to calculate sum of digits
        while (originalNumber != 0) {
            int digit = originalNumber % 10; // get last digit
            sum += digit;                    // add to sum
            originalNumber = originalNumber / 10; // remove last digit
        }

        // Step 4: Check divisibility
        if (number % sum == 0) {
            System.out.println(number + " is a Harshad Number.");
        } else {
            System.out.println(number + " is NOT a Harshad Number.");
        }

        sc.close();
    }
}
