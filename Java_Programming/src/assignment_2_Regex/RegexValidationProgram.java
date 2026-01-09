package assignment_2_Regex;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexValidationProgram {

    // Regex patterns
    private static final String MOBILE_REGEX = "^[6-9][0-9]{9}$";
    private static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
    private static final String USERNAME_REGEX = "^[A-Za-z0-9_]{5,15}$";
    private static final String PASSWORD_REGEX =
            "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[@#$%!]).{8,}$";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice = 0;

        try {
            while (true) {
                System.out.println("\n--- REGEX VALIDATION MENU ---");
                System.out.println("1. Validate Mobile Number");
                System.out.println("2. Validate Email ID");
                System.out.println("3. Validate Username");
                System.out.println("4. Validate Password");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");

                choice = sc.nextInt();
                sc.nextLine(); // consume newline

                switch (choice) {

                    case 1:
                        System.out.print("Enter Mobile Number: ");
                        String mobile = sc.nextLine();
                        validateInput(mobile, MOBILE_REGEX, "Mobile Number");
                        break;

                    case 2:
                        System.out.print("Enter Email ID: ");
                        String email = sc.nextLine();
                        validateInput(email, EMAIL_REGEX, "Email ID");
                        break;

                    case 3:
                        System.out.print("Enter Username: ");
                        String username = sc.nextLine();
                        validateInput(username, USERNAME_REGEX, "Username");
                        break;

                    case 4:
                        System.out.print("Enter Password: ");
                        String password = sc.nextLine();
                        validateInput(password, PASSWORD_REGEX, "Password");
                        break;

                    case 5:
                        System.out.println("Thank you! Program exited.");
                        sc.close();
                        System.exit(0);

                    default:
                        System.out.println("Invalid choice! Please select 1–5.");
                }
            }
        } catch (Exception e) {
            System.out.println("Error: Invalid input type.");
        }
    }

    // Method to validate input using REGEX
    private static void validateInput(String input, String regex, String type) {

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        if (matcher.matches()) {
            System.out.println("Valid " + type + " ✅");
            System.out.println("Welcome!");
        } else {
            System.out.println("Invalid " + type + " ❌");
        }
    }
}

