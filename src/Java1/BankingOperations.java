package Java1;

import java.util.Scanner;

public class BankingOperations {

	// Interface for banking operations
	interface BankingOperation {
		void deposit(double amount);

		void withdraw(double amount) throws InsufficientBalanceException;

		double getBalance();
	}

	// Interface for customer-related operations
	interface CustomerOperations {
		void displayCustomerDetails();
	}

	// Custom exception for insufficient balance
	class InsufficientBalanceException extends Exception {
		public InsufficientBalanceException(String message) {
			super(message);
		}
	}

	// BankAccount class implementing multiple interfaces
	class BankAccount implements BankingOperation, CustomerOperations {

		private int accountNumber;
		private String customerName;
		private double balance;

		// Constructor
		public BankAccount(int accountNumber, String customerName, double balance) {
			this.accountNumber = accountNumber;
			this.customerName = customerName;
			this.balance = balance;
		}

		// Deposit method
		@Override
		public void deposit(double amount) {
			if (amount <= 0) {
				throw new IllegalArgumentException("Deposit amount must be positive.");
			}
			balance += amount;
			System.out.println("Deposit successful.");
		}

		// Withdraw method
		@Override
		public void withdraw(double amount) throws InsufficientBalanceException {
			if (amount <= 0) {
				throw new IllegalArgumentException("Withdrawal amount must be positive.");
			}
			if (amount > balance) {
				throw new InsufficientBalanceException("Insufficient balance!");
			}
			balance -= amount;
			System.out.println("Withdrawal successful.");
		}

		// Balance enquiry
		@Override
		public double getBalance() {
			return balance;
		}

		// Display customer details
		@Override
		public void displayCustomerDetails() {
			System.out.println("\n--- Customer Details ---");
			System.out.println("Account Number : " + accountNumber);
			System.out.println("Customer Name  : " + customerName);
			System.out.println("Balance        : " + balance);
		}
	}

	public class BankInterfaceDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        try {
            // Create account
            System.out.print("Enter Account Number: ");
            int accNo = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Customer Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Initial Balance: ");
            double balance = sc.nextDouble();

            BankAccount account = new BankAccount(accNo, name, balance);

            int choice;
            do {
                System.out.println("\n--- Bank Menu ---");
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Balance Enquiry");
                System.out.println("4. Display Customer Details");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");

                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter deposit amount: ");
                        account.deposit(sc.nextDouble());
                        break;

                    case 2:
                        System.out.print("Enter withdrawal amount: ");
                        account.withdraw(sc.nextDouble());
                        break;

                    case 3:
                        System.out.println("Current Balance: " + account.getBalance());
                        break;

                    case 4:
                        account.displayCustomerDetails();
                        break;

                    case 5:
                        System.out.println("Thank you for using the Bank System.");
                        break;

                    default:
                        System.out.println("Invalid choice!");
                }

            } while (choice != 5);

        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error occurred.");
        } finally {
            sc.close();
        }
    }
	}
}