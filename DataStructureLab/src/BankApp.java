// BankAccount class
class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    protected double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: $" + balance);
    }
}

// SavingsAccount subclass
class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolderName, double balance, double interestRate) {
        super(accountNumber, accountHolderName, balance);
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        double interest = balance * interestRate / 150;
        balance += interest;
        System.out.println("Interest applied: $" + interest);
    }
}

// Main class to test the implementation
public class BankApp {
    public static void main(String[] args) {
        // Creating a BankAccount instance
        BankAccount account = new BankAccount("43241", "Saeb", 1000.0);
        account.deposit(800);
        account.withdraw(500);
        account.displayAccountInfo();

        System.out.println("----------------------");

        // Creating a SavingsAccount instance
        SavingsAccount savings = new SavingsAccount("67890", "Nera", 2000.0, 5.0);
        savings.applyInterest();
        savings.displayAccountInfo();
    }
}
