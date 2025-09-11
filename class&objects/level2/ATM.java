package level2;

class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;

    // Constructor
    BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Deposit money
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    // Withdraw money
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    // Display balance
    void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }
}

public class ATM {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Meenakshi", 12345, 5000.0);
        acc1.deposit(2000);
        acc1.withdraw(3000);
        acc1.displayBalance();
    }
}
