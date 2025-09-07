package level3;
public class NumberChecker5 {
    public static String classifyNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) if (n % i == 0) sum += i;
        if (sum == n) return "Perfect";
        else if (sum > n) return "Abundant";
        else return "Deficient";
    }

    public static void main(String[] args) {
        int num = 28;
        System.out.println(num + " is " + classifyNumber(num));
    }
}

