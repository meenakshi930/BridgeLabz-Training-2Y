package level2;
import java.util.Scanner;

public class FactorsProgram {
    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) count++;
        }

        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) factors[index++] = i;
        }
        return factors;
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int val : arr) sum += val;
        return sum;
    }

    public static int product(int[] arr) {
        int prod = 1;
        for (int val : arr) prod *= val;
        return prod;
    }

    public static int sumOfSquares(int[] arr) {
        int sum = 0;
        for (int val : arr) sum += Math.pow(val, 2);
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] factors = findFactors(number);
        System.out.print("Factors: ");
        for (int f : factors) System.out.print(f + " ");
        System.out.println();

        System.out.println("Sum of factors: " + sum(factors));
        System.out.println("Sum of squares of factors: " + sumOfSquares(factors));
        System.out.println("Product of factors: " + product(factors));
        sc.close();
    }
}
