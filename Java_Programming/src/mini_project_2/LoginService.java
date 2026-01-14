package mini_project_2;

import java.util.Scanner;

public class LoginService {

    private static final String USERNAME = "admin";
    private static final String PASSWORD = "admin123";

    public static boolean login() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Username: ");
        String user = sc.nextLine();

        System.out.print("Enter Password: ");
        String pass = sc.nextLine();

        if (user.equals(USERNAME) && pass.equals(PASSWORD)) {
            System.out.println("Login Successful\n");
            return true;
        } else {
            System.out.println("Invalid Credentials");
            return false;
        }
    }
}
