package assignment2;

public class Main {
	public static void main(String[] args) {

        BankAccount account = new BankAccount(1001, "Alice", 5000);

        account.displayCustomerDetails();

        account.deposit(2000);

        try {
            account.withdraw(8000);
        } catch (InsufficientBalanceException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        try {
            account.withdraw(3000);
        } catch (InsufficientBalanceException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        account.updateCustomerName("Alice Johnson");
        account.displayCustomerDetails();
    }


}
