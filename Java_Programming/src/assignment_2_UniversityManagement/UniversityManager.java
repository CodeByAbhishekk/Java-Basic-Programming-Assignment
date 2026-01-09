package assignment_2_UniversityManagement;

import java.util.*;
import java.util.regex.Pattern;

public class UniversityManager implements UniversityOperations {

    // Collections
    private List<Student> studentList = new ArrayList<>();
    private Vector<Student> studentVector = new Vector<>();
    private Stack<Student> studentStack = new Stack<>();

    private HashMap<Integer, Student> studentMap = new HashMap<>();
    private Hashtable<Integer, Student> studentTable = new Hashtable<>();
    private TreeMap<Integer, Student> studentTreeMap = new TreeMap<>();

    private Set<String> courseSet = new HashSet<>();

    private Scanner sc = new Scanner(System.in);

    // REGEX
    private static final String NAME_REGEX = "^[A-Za-z ]{3,20}$";
    private static final String COURSE_REGEX = "^[A-Za-z ]{3,20}$";

    @Override
    public void addStudent() {
        try {
            System.out.print("Enter Student ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            if (studentMap.containsKey(id)) {
                throw new IllegalArgumentException("Duplicate Student ID not allowed");
            }

            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            if (!Pattern.matches(NAME_REGEX, name)) {
                throw new IllegalArgumentException("Invalid Name");
            }

            System.out.print("Enter Course: ");
            String course = sc.nextLine();
            if (!Pattern.matches(COURSE_REGEX, course)) {
                throw new IllegalArgumentException("Invalid Course Name");
            }

            System.out.print("Enter Marks: ");
            int marks = sc.nextInt();

            Student s = new Student(id, name, course, marks);

            studentList.add(s);
            studentVector.add(s);
            studentStack.push(s);

            studentMap.put(id, s);
            studentTable.put(id, s);
            studentTreeMap.put(id, s);

            courseSet.add(course);

            System.out.println("Student Added Successfully!");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            sc.nextLine();
        }
    }

    @Override
    public void displayStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No Students Found.");
            return;
        }
        for (Student s : studentList) {
            System.out.println(s);
        }
    }

    @Override
    public void searchStudent(int id) {
        Student s = studentMap.get(id);
        if (s != null) {
            System.out.println("Student Found: " + s);
        } else {
            System.out.println("Student Not Found.");
        }
    }

    @Override
    public void removeStudent(int id) {
        Student s = studentMap.remove(id);
        if (s != null) {
            studentTable.remove(id);
            studentTreeMap.remove(id);
            studentList.remove(s);
            studentVector.remove(s);
            studentStack.remove(s);
            System.out.println("Student Removed Successfully.");
        } else {
            System.out.println("Student Not Found.");
        }
    }

    @Override
    public void sortByMarks() {
        studentList.sort(Comparator.comparingInt(Student::getMarks).reversed());
        System.out.println("Students Sorted by Marks:");
        displayStudents();
    }

    @Override
    public void convertHashMapToTreeMap() {
        TreeMap<Integer, Student> sortedMap = new TreeMap<>(studentMap);
        System.out.println("Converted HashMap to TreeMap:");
        for (Student s : sortedMap.values()) {
            System.out.println(s);
        }
    }

    @Override
    public void countStudentsCourseWise() {
        Map<String, Integer> countMap = new HashMap<>();

        for (Student s : studentList) {
            countMap.put(s.getCourse(),
                    countMap.getOrDefault(s.getCourse(), 0) + 1);
        }

        System.out.println("Course-wise Student Count:");
        for (String course : countMap.keySet()) {
            System.out.println(course + " : " + countMap.get(course));
        }
    }

    @Override
    public void displayAllCourses() {
        System.out.println("Unique Courses:");
        for (String c : courseSet) {
            System.out.println(c);
        }
    }
}
