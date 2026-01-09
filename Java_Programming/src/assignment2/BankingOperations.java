package assignment2;

public interface BankingOperations {

	void deposit(double amount);
    void withdraw(double amount) throws InsufficientBalanceException;
    double getBalance();
}
