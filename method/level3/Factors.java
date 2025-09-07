package level3;

public class Factors {
    public static void findFactors(int n) {
        int evenSum = 0, oddSum = 0;
        System.out.print("Factors: ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                if (i % 2 == 0) evenSum += i;
                else oddSum += i;
            }
        }
        System.out.println("\nEven Factors Sum = " + evenSum);
        System.out.println("Odd Factors Sum = " + oddSum);
    }

    public static void main(String[] args) {
        int num = 20;
        findFactors(num);
    }
}

