package staticMethod;
import static java.lang.Math.*;  // Import all static members of Math class

public class StaticImport {
    public static void main(String[] args) {
        double number1 = 25.0;
        double number2 = 9.0;
        double negative = -15.7;

        // Using static methods directly (no Math. prefix)
        double result1 = sqrt(number1);       // Square root
        double result2 = pow(2, 3);           // Power (2^3)
        double result3 = max(number1, number2); // Maximum
        double result4 = min(number1, number2); // Minimum
        double result5 = abs(negative);         // Absolute value

        // Displaying results
        System.out.println("Square root of " + number1 + " = " + result1);
        System.out.println("2 raised to power 3 = " + result2);
        System.out.println("Maximum of " + number1 + " and " + number2 + " = " + result3);
        System.out.println("Minimum of " + number1 + " and " + number2 + " = " + result4);
        System.out.println("Absolute value of " + negative + " = " + result5);
    }
}
