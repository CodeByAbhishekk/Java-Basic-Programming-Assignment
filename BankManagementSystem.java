package Java1;

import java.util.*;

//Custom Exception for insufficient balance
class InsufficientBalanceException extends Exception {
 public InsufficientBalanceException(String message) {
     super(message);
 }
}

//Bank Account class
class BankAccount {
 private int accountNumber;
 private String accountHolderName;
 private double balance;

 // Constructor
 public BankAccount(int accountNumber, String accountHolderName, double balance) {
     this.accountNumber = accountNumber;
     this.accountHolderName = accountHolderName;
     this.balance = balance;
 }

 // Deposit method
 public void deposit(double amount) {
     if (amount <= 0) {
         throw new IllegalArgumentException("Deposit amount must be positive.");
     }
     balance += amount;
     System.out.println("Amount deposited successfully.");
 }

 // Withdraw method
 public void withdraw(double amount) throws InsufficientBalanceException {
     if (amount <= 0) {
         throw new IllegalArgumentException("Withdrawal amount must be positive.");
     }
     if (amount > balance) {
         throw new InsufficientBalanceException("Insufficient balance!");
     }
     balance -= amount;
     System.out.println("Amount withdrawn successfully.");
 }

 // Balance enquiry
 public double getBalance() {
     return balance;
 }

 // Display account details
 public void displayAccountDetails() {
     System.out.println("\n--- Account Details ---");
     System.out.println("Account Number : " + accountNumber);
     System.out.println("Account Holder : " + accountHolderName);
     System.out.println("Balance        : " + balance);
 }
}

public class BankManagementSystem {

	public static void main(String[] args) {
		// Main class
		
		        Scanner sc = new Scanner(System.in);

		        try {
		            // Create account
		            System.out.print("Enter Account Number: ");
		            int accNo = sc.nextInt();
		            sc.nextLine();

		            System.out.print("Enter Account Holder Name: ");
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
		                System.out.println("4. Display Account Details");
		                System.out.println("5. Exit");
		                System.out.print("Enter your choice: ");

		                choice = sc.nextInt();

		                switch (choice) {
		                    case 1:
		                        System.out.print("Enter deposit amount: ");
		                        double depositAmount = sc.nextDouble();
		                        account.deposit(depositAmount);
		                        break;

		                    case 2:
		                        System.out.print("Enter withdrawal amount: ");
		                        double withdrawAmount = sc.nextDouble();
		                        account.withdraw(withdrawAmount);
		                        break;

		                    case 3:
		                        System.out.println("Current Balance: " + account.getBalance());
		                        break;

		                    case 4:
		                        account.displayAccountDetails();
		                        break;

		                    case 5:
		                        System.out.println("Thank you for using Bank Management System.");
		                        break;

		                    default:
		                        System.out.println("Invalid choice!");
		                }
		            } while (choice != 5);

		        } catch (InsufficientBalanceException e) {
		            System.out.println("Error: " + e.getMessage());
		        } catch (IllegalArgumentException e) {
		            System.out.println("Invalid Input: " + e.getMessage());
		        } catch (Exception e) {
		            System.out.println("Unexpected error occurred!");
		        } finally {
		            sc.close();
		        }
		    }
		}

	