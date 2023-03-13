package homework2;

public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("1232312423", "Sabit", 0.07);
        account.deposit(1000);
        account.addInterest();
        account.withdraw(109);
        account.addInterest();
        account.deposit(1000);
        double balance = account.getBalance();
        System.out.println(balance);

        BankAccount account2 = new BankAccount("1237474774", "John", 0.08);
        account2.deposit(1900);
        System.out.println(account2.getBalance());


    }
}
