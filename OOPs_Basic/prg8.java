public class BankAccount {

    String accountHolder = "Surabhi";
    double balance = 10000;

    void display() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {

        BankAccount acc = new BankAccount();
        acc.display();
    }
}
