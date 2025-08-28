/*Create a program to print odd and even numbers between 1 to the number entered by the user.
Hint => 
Get an integer input from the user, assign to a variable number and check for Natural Number
Using a for loop, iterate from 1 to the number
In each iteration of the loop, print the number is odd or even number
 */
package level2;
import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        int number;
        System.out.println("Enter a number: ");
        number = input.nextInt();

        if (number % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }

        input.close(); 
    }
}

