package level3;

import java.util.Scanner;

public class armstrong{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Get input number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Step 2: Initialize variables
        int sum = 0;
        int originalNumber = number;

        // Step 3: Loop until originalNumber becomes 0
        while (originalNumber != 0) {
            // Step 3a: Get last digit
            int digit = originalNumber % 10;

            // Step 3b: Cube the digit and add to sum
            sum += digit * digit * digit;

            // Step 3c: Remove the last digit
            originalNumber = originalNumber / 10;
        }

        // Step 4: Compare sum with original number
        if (sum == number) {
            System.out.println(number + " is an Armstrong Number.");
        } else {
            System.out.println(number + " is NOT an Armstrong Number.");
        }

        sc.close();
    }
}

