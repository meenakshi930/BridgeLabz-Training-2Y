package level3;

public class StrongNumber {
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) fact *= i;
        return fact;
    }
    public static boolean isStrong(int n) {
        int temp = n, sum = 0;
        while (temp > 0) {
            sum += factorial(temp % 10);
            temp /= 10;
        }
        return sum == n;
    }

    public static void main(String[] args) {
        int num = 145;
        System.out.println(num + " is Strong? " + isStrong(num));
    }
}
