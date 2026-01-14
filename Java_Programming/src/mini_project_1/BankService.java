package mini_project_1;

public class BankService {

    // Method Overloading
    public void showBalance(BankAccount account) {
        System.out.println("Balance: " + account.getBalance());
    }

    public void showBalance(BankAccount account, String msg) {
        System.out.println(msg + account.getBalance());
    }
}
