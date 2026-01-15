package assignment_4;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcConnectFirst {

    public static void main(String[] args) {

        // MySQL database details
        String url = "jdbc:mysql://localhost:3306/jdbcdb";
        String username = "root";
        String password = "password"; // change if your MySQL password is different

        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            Connection con = DriverManager.getConnection(url, username, password);

            if (con != null) {
                System.out.println("Connection Successful");
            }

            con.close();

        } catch (Exception e) {
            System.out.println("Unable to connect");
            e.printStackTrace();
        }
    }
}
