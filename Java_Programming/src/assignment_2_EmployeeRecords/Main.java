package assignment_2_EmployeeRecords;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        EmployeeManager manager = new EmployeeManager();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- EMPLOYEE RECORD MANAGEMENT ---");
            System.out.println("1. Add Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Search Employee by ID");
            System.out.println("4. Remove Employee by ID");
            System.out.println("5. Demonstrate Null Support");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            try {
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        manager.addEmployee();
                        break;

                    case 2:
                        manager.displayEmployees();
                        break;

                    case 3:
                        System.out.print("Enter Employee ID: ");
                        manager.searchEmployee(sc.nextInt());
                        break;

                    case 4:
                        System.out.print("Enter Employee ID: ");
                        manager.removeEmployee(sc.nextInt());
                        break;

                    case 5:
                        manager.demonstrateNullSupport();
                        break;

                    case 6:
                        System.out.println("Program Exited.");
                        sc.close();
                        System.exit(0);

                    default:
                        System.out.println("Invalid Choice!");
                }
            } catch (Exception e) {
                System.out.println("Invalid Input!");
                sc.nextLine();
            }
        }
    }
}
