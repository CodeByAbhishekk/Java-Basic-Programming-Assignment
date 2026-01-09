package assignment_2_UniversityManagement;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        UniversityManager manager = new UniversityManager();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- UNIVERSITY STUDENT MANAGEMENT ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Remove Student by ID");
            System.out.println("5. Sort Students by Marks");
            System.out.println("6. Convert HashMap to TreeMap");
            System.out.println("7. Count Students Course-wise");
            System.out.println("8. Display All Courses");
            System.out.println("9. Exit");
            System.out.print("Enter choice: ");

            try {
                int choice = sc.nextInt();

                switch (choice) {
                    case 1: manager.addStudent(); break;
                    case 2: manager.displayStudents(); break;
                    case 3:
                        System.out.print("Enter ID: ");
                        manager.searchStudent(sc.nextInt());
                        break;
                    case 4:
                        System.out.print("Enter ID: ");
                        manager.removeStudent(sc.nextInt());
                        break;
                    case 5: manager.sortByMarks(); break;
                    case 6: manager.convertHashMapToTreeMap(); break;
                    case 7: manager.countStudentsCourseWise(); break;
                    case 8: manager.displayAllCourses(); break;
                    case 9:
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
