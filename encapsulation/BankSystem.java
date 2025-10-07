// Interface: Loanable
interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}

// Abstract class: BankAccount
abstract class BankAccount implements Loanable {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Encapsulated Getters and Setters
    public String getAccountNumber() { return accountNumber; }
    public String getHolderName() { return holderName; }
    public double getBalance() { return balance; }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited ₹" + amount + " to " + accountNumber);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew ₹" + amount + " from " + accountNumber);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    // Abstract method
    public abstract double calculateInterest();

    // Concrete method
    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: ₹" + balance);
        System.out.println("Interest Earned: ₹" + calculateInterest());
    }
}

// Subclass: SavingsAccount
class SavingsAccount extends BankAccount {
    private double interestRate = 0.04; // 4% annual

    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("SavingsAccount: Loan application submitted for ₹" + amount);
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() >= 10000;
    }
}

// Subclass: CurrentAccount
class CurrentAccount extends BankAccount {
    private double interestRate = 0.02; // 2% annual

    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("CurrentAccount: Loan application submitted for ₹" + amount);
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() >= 5000;
    }
}

// Main class
public class BankSystem {
    public static void main(String[] args) {
        BankAccount[] accounts = {
            new SavingsAccount("SA-101", "Amit Sharma", 15000),
            new CurrentAccount("CA-202", "Sneha Verma", 7000)
        };

        for (BankAccount acc : accounts) {
            System.out.println("---------------");
            acc.displayDetails();
            acc.deposit(2000);
            acc.withdraw(1000);

            if (acc.calculateLoanEligibility()) {
                acc.applyForLoan(50000);
            } else {
                System.out.println("Loan not eligible for account: " + acc.getAccountNumber());
            }
        }
    }
}