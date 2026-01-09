package assignment_2_EmployeeRecords;

import java.util.*;
import java.util.regex.Pattern;

public class EmployeeManager implements EmployeeOperations {

    // Collections
    private HashMap<Integer, Employee> hashMap = new HashMap<>();
    private Hashtable<Integer, Employee> hashTable = new Hashtable<>();
    private TreeMap<Integer, Employee> treeMap = new TreeMap<>();

    private Scanner sc = new Scanner(System.in);

    // REGEX
    private static final String NAME_REGEX = "^[A-Za-z ]{3,20}$";
    private static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

    @Override
    public void addEmployee() {
        try {
            System.out.print("Enter Employee ID: ");
            int id = sc.nextInt();
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

            Employee emp = new Employee(id, name, email);

            hashMap.put(id, emp);
            hashTable.put(id, emp);
            treeMap.put(id, emp);

            System.out.println("Employee Added Successfully!");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            sc.nextLine();
        }
    }

    @Override
    public void displayEmployees() {
        if (hashMap.isEmpty()) {
            System.out.println("No Employee Records Found.");
            return;
        }

        System.out.println("\n--- Employees (TreeMap Sorted Order) ---");
        for (Employee e : treeMap.values()) {
            System.out.println(e);
        }
    }

    @Override
    public void searchEmployee(int empId) {
        Employee emp = hashMap.get(empId);
        if (emp != null) {
            System.out.println("Employee Found: " + emp);
        } else {
            System.out.println("Employee Not Found.");
        }
    }

    @Override
    public void removeEmployee(int empId) {
        if (hashMap.remove(empId) != null) {
            hashTable.remove(empId);
            treeMap.remove(empId);
            System.out.println("Employee Removed Successfully.");
        } else {
            System.out.println("Employee Not Found.");
        }
    }

    // Demonstrate null key & null value
    public void demonstrateNullSupport() {
        System.out.println("\n--- Null Key / Value Demonstration ---");

        hashMap.put(null, null);
        System.out.println("HashMap allows null key & null value");

        try {
            hashTable.put(null, null);
        } catch (Exception e) {
            System.out.println("Hashtable does NOT allow null key or value");
        }

        treeMap.put(999, null);
        System.out.println("TreeMap allows null value but NOT null key");
    }
}
