package assignment_2_StudentRecords;

import java.util.*;
import java.util.regex.Pattern;

public class StudentManager implements StudentOperations {

    // Using List, ArrayList and Vector
    private List<Student> students = new ArrayList<>();
    private Vector<Student> backupVector = new Vector<>();

    private Scanner sc = new Scanner(System.in);

    // REGEX patterns
    private static final String NAME_REGEX = "^[A-Za-z ]{3,20}$";
    private static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

    @Override
    public void addStudent() {
        try {
            System.out.print("Enter Roll Number: ");
            int rollNo = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            if (!Pattern.matches(NAME_REGEX, name)) {
                throw new IllegalArgumentException("Invalid Name Format");
            }

            System.out.print("Enter Email: ");
            String email = sc.nextLine();
            if (!Pattern.matches(EMAIL_REGEX, email)) {
                throw new IllegalArgumentException("Invalid Email Format");
            }

            Student student = new Student(rollNo, name, email);
            students.add(student);
            backupVector.add(student);

            System.out.println("Student Added Successfully!");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            sc.nextLine();
        }
    }

    @Override
    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No Student Records Found.");
            return;
        }
        for (Student s : students) {
            System.out.println(s);
        }
    }

    @Override
    public void removeStudent(int rollNo) {
        Iterator<Student> it = students.iterator();
        boolean found = false;

        while (it.hasNext()) {
            if (it.next().getRollNo() == rollNo) {
                it.remove();
                found = true;
                System.out.println("Student Removed Successfully.");
                break;
            }
        }

        if (!found) {
            System.out.println("Student Not Found.");
        }
    }

    @Override
    public void searchStudent(int rollNo) {
        for (Student s : students) {
            if (s.getRollNo() == rollNo) {
                System.out.println("Student Found: " + s);
                return;
            }
        }
        System.out.println("Student Not Found.");
    }
}
