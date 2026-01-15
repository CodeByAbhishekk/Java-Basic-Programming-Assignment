package mini_project_3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        if (!LoginService.login()) {
            return;
        }

        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        while (true) {
            System.out.println("\n--- STUDENT MANAGEMENT SYSTEM ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student by Eno");
            System.out.println("4. Update Student Branch");
            System.out.println("5. Delete Student by Eno");
            System.out.println("6. Display Sorted Students");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");

            try {
                int choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        System.out.print("Eno: ");
                        int eno = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Name: ");
                        String name = sc.nextLine();

                        System.out.print("Branch: ");
                        String branch = sc.nextLine();

                        System.out.print("Semester: ");
                        int sem = sc.nextInt();

                        System.out.print("Percentage: ");
                        double per = sc.nextDouble();

                        manager.addStudent(new Student(eno, name, branch, sem, per));
                        break;

                    case 2:
                        manager.displayAll();
                        break;

                    case 3:
                        System.out.print("Enter Eno: ");
                        manager.searchByEno(sc.nextInt());
                        break;

                    case 4:
                        System.out.print("Enter Eno: ");
                        int ueno = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter New Branch: ");
                        manager.updateBranch(ueno, sc.nextLine());
                        break;

                    case 5:
                        System.out.print("Enter Eno: ");
                        manager.deleteStudent(sc.nextInt());
                        break;

                    case 6:
                        manager.displaySorted();
                        break;

                    case 7:
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
