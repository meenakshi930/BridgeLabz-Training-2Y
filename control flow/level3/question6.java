package level3;

import java.util.Scanner;

public class question6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Get input number
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        // Step 2: Initialize count variable
        int count = 0;

        // Special case: if number is 0, it has 1 digit
        if (number == 0) {
            count = 1;
        } else {
            // Step 3: Use loop until number becomes 0
            while (number != 0) {
                // Step 4: Remove last digit
                number = number / 10;

                // Step 5: Increase count
                count++;
            }
        }

        // Step 6: Display result
        System.out.println("Number of digits: " + count);

        sc.close();
    }
}
