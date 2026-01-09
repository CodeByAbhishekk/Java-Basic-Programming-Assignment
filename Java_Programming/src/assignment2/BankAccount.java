package assignment2;

public class BankAccount implements BankingOperations, CustomerOperations {

	private int accountNumber;
    private String customerName;
    private double balance;

    public BankAccount(int accountNumber, String customerName, double balance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = balance;
    }

    @Override
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be greater than zero.");
            return;
        }
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    @Override
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be greater than zero.");
            return;
        }
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance.");
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void displayCustomerDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    @Override
    public void updateCustomerName(String name) {
        this.customerName = name;
        System.out.println("Customer name updated.");
    }
}
