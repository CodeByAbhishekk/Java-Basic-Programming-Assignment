package mini_project_2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        if (!LoginService.login()) return;

        Scanner sc = new Scanner(System.in);
        EmployeeManager manager = new EmployeeManager();

        while (true) {
            System.out.println("\n--- EMPLOYEE MANAGEMENT SYSTEM ---");
            System.out.println("1. Add Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Search Employee by ID");
            System.out.println("4. Update Employee Salary");
            System.out.println("5. Delete Employee");
            System.out.println("6. Display Sorted Employees");
            System.out.println("7. Display Departments");
            System.out.println("8. Exit");
            System.out.print("Enter choice: ");

            try {
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Name: ");
                        String name = sc.nextLine();
                        System.out.print("Department: ");
                        String dept = sc.nextLine();
                        System.out.print("Salary: ");
                        double sal = sc.nextDouble();

                        manager.addEmployee(new Employee(id, name, dept, sal));
                        break;

                    case 2:
                        manager.displayAll();
                        break;

                    case 3:
                        System.out.print("Enter ID: ");
                        manager.searchById(sc.nextInt());
                        break;

                    case 4:
                        System.out.print("ID: ");
                        int uid = sc.nextInt();
                        System.out.print("New Salary: ");
                        manager.updateSalary(uid, sc.nextDouble());
                        break;

                    case 5:
                        System.out.print("ID: ");
                        manager.deleteEmployee(sc.nextInt());
                        break;

                    case 6:
                        manager.displaySorted();
                        break;

                    case 7:
                        manager.displayDepartments();
                        break;

                    case 8:
                        System.out.println("Thank You!");
                        sc.close();
                        System.exit(0);

                    default:
                        System.out.println("Invalid Choice");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                sc.nextLine();
            }
        }
    }
}
