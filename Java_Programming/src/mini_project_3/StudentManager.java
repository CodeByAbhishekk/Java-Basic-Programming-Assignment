package mini_project_3;

import java.util.*;

public class StudentManager {

    private ArrayList<Student> students = new ArrayList<>();

    // 1. Add Student
    public void addStudent(Student s) {

        for (Student st : students) {
            if (st.getEno() == s.getEno()) {
                throw new RuntimeException("Student Eno must be unique");
            }
        }

        if (s.getPercentage() <= 0) {
            throw new RuntimeException("Percentage must be positive");
        }

        if (s.getBranch().isEmpty()) {
            throw new RuntimeException("Branch cannot be empty");
        }

        students.add(s);
        System.out.println("Student Added Successfully");
    }

    // 2. Display All Students
    public void displayAll() {
        if (students.isEmpty()) {
            System.out.println("No Students Found");
            return;
        }
        for (Student s : students) {
            System.out.println(s);
        }
    }

    // 3. Search Student by Eno
    public void searchByEno(int eno) {
        for (Student s : students) {
            if (s.getEno() == eno) {
                System.out.println(s);
                return;
            }
        }
        System.out.println("Student Not Found");
    }

    // 4. Update Student Branch
    public void updateBranch(int eno, String newBranch) {
        if (newBranch.isEmpty()) {
            throw new RuntimeException("Branch cannot be empty");
        }

        for (Student s : students) {
            if (s.getEno() == eno) {
                s.setBranch(newBranch);
                System.out.println("Branch Updated Successfully");
                return;
            }
        }
        System.out.println("Student Not Found");
    }

    // 5. Delete Student by Eno
    public void deleteStudent(int eno) {
        Iterator<Student> it = students.iterator();
        while (it.hasNext()) {
            if (it.next().getEno() == eno) {
                it.remove();
                System.out.println("Student Deleted Successfully");
                return;
            }
        }
        System.out.println("Student Not Found");
    }

    // 6. Display Sorted Students
    public void displaySorted() {
        if (students.isEmpty()) {
            System.out.println("No Students to Sort");
            return;
        }

        students.sort(Comparator.comparingDouble(Student::getPercentage).reversed());
        displayAll();
    }
}
