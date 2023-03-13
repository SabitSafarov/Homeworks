package homework2;

public class BankAccount {

    String accountNumber;
    private double balance;
    String ownerName;
    double interestRate;

    public BankAccount(String accountNumber, String ownerName, double interestRate) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.interestRate = interestRate;
    }

    public double deposit(double amount) {
        return balance += amount;
    }

    public double withdraw(double amount) {
        return balance -= amount;
    }

    public double addInterest() {
        return balance = balance + balance * interestRate;
    }

    public double getBalance() {
        return balance;
    }
}
