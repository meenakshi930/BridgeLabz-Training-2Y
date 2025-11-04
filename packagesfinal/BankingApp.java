import com.bank.util.InterestCalculator;

public class BankingApp {
    public static void main(String[] args) {
        System.out.println("=== 💰 Banking System with Static Import ===\n");

        InterestCalculator calculator = new InterestCalculator();

        double principal = 10000;  // ₹10,000
        double rate = 5;           // 5% interest rate
        double time = 2;           // 2 years

        // Calculate interests
        double si = calculator.calculateSimpleInterest(principal, rate, time);
        double ci = calculator.calculateCompoundInterest(principal, rate, time);

        // Display results
        System.out.println("Principal: ₹" + principal);
        System.out.println("Rate: " + rate + "%");
        System.out.println("Time: " + time + " years");

        System.out.println("\nSimple Interest: ₹" + si);
        System.out.println("Compound Interest: ₹" + ci);
    }
}
