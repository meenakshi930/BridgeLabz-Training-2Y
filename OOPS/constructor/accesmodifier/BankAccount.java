package accesmodifier;
class BankAccount {
    public int accountNumber;        // public
    protected String accountHolder;  // protected
    private double balance;          // private

    // Constructor
    BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Public methods for private balance
    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    public void display() {
        System.out.println("Account No: " + accountNumber + ", Holder: " + accountHolder + ", Balance: " + balance);
    }
}

// Subclass demonstrating access to public and protected members
class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(int accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    void displaySavingsDetails() {
        // Can access accountNumber (public) and accountHolder (protected)
        System.out.println("Savings Account - No: " + accountNumber + ", Holder: " + accountHolder + ", Interest: " + interestRate + "%");
    }

    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(12345, "Meenakshi Gupta", 50000, 5.5);
        sa.display();
        sa.displaySavingsDetails();

        sa.deposit(10000);
        sa.withdraw(20000);
        System.out.println("Updated Balance: " + sa.getBalance());
    }
}

