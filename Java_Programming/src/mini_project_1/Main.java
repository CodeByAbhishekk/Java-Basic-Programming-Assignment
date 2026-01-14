package mini_project_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankAccount account = FileUtility.loadAccount();
        BankService service = new BankService();

        if (account == null) {
            System.out.println("Create Account");
            System.out.print("Enter Account Number: ");
            int accNo = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Initial Balance: ");
            double bal = sc.nextDouble();

            System.out.println("1. Savings Account");
            System.out.println("2. Current Account");
            int choice = sc.nextInt();

            if (choice == 1)
                account = new SavingsAccount(accNo, name, bal);
            else
                account = new CurrentAccount(accNo, name, bal);

            FileUtility.saveAccount(account);
        }

        while (true) {
            System.out.println("\n--- BANK MENU ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Balance Enquiry");
            System.out.println("4. Account Details");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter amount: ");
                    account.deposit(sc.nextDouble());
                    FileUtility.saveAccount(account);
                    break;

                case 2:
                    System.out.print("Enter amount: ");
                    account.withdraw(sc.nextDouble());
                    FileUtility.saveAccount(account);
                    break;

                case 3:
                    service.showBalance(account, "Current Balance: ");
                    break;

                case 4:
                    account.displayAccountDetails();
                    break;

                case 5:
                    System.out.println("Thank You!");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
