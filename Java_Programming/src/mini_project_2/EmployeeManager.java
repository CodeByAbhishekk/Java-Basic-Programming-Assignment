package mini_project_2;

import java.util.*;

public class EmployeeManager {

    private ArrayList<Employee> employees;

    public EmployeeManager() {
        employees = FileUtility.load();
    }

    // 1. Add Employee
    public void addEmployee(Employee emp) {
        for (Employee e : employees) {
            if (e.getId() == emp.getId()) {
                throw new RuntimeException("Employee ID must be unique");
            }
        }
        if (emp.getSalary() <= 0) {
            throw new RuntimeException("Salary must be positive");
        }
        if (emp.getDepartment().isEmpty()) {
            throw new RuntimeException("Department cannot be empty");
        }

        employees.add(emp);
        FileUtility.save(employees);
        System.out.println("Employee Added Successfully");
    }

    // 2. Display All Employees
    public void displayAll() {
        if (employees.isEmpty()) {
            System.out.println("No Employees Found");
            return;
        }
        for (Employee e : employees) {
            System.out.println(e);
        }
    }

    // 3. Search by ID
    public void searchById(int id) {
        for (Employee e : employees) {
            if (e.getId() == id) {
                System.out.println(e);
                return;
            }
        }
        System.out.println("Employee Not Found");
    }

    // 4. Update Salary
    public void updateSalary(int id, double salary) {
        if (salary <= 0)
            throw new RuntimeException("Salary must be positive");

        for (Employee e : employees) {
            if (e.getId() == id) {
                e.setSalary(salary);
                FileUtility.save(employees);
                System.out.println("Salary Updated");
                return;
            }
        }
        System.out.println("Employee Not Found");
    }

    // 5. Delete Employee
    public void deleteEmployee(int id) {
        Iterator<Employee> it = employees.iterator();
        while (it.hasNext()) {
            if (it.next().getId() == id) {
                it.remove();
                FileUtility.save(employees);
                System.out.println("Employee Deleted");
                return;
            }
        }
        System.out.println("Employee Not Found");
    }

    // 6. Display Sorted Employees
    public void displaySorted() {
        employees.sort(Comparator.comparing(Employee::getSalary));
        displayAll();
    }

    // 7. Display Departments
    public void displayDepartments() {
        Set<String> depts = new HashSet<>();
        for (Employee e : employees) {
            depts.add(e.getDepartment());
        }
        System.out.println("Departments:");
        for (String d : depts) {
            System.out.println(d);
        }
    }
}
