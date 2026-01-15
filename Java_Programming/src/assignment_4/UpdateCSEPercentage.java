package assignment_4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateCSEPercentage {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/jdbcdb";
        String username = "root";
        String password = "password";   // change if needed

        Connection con = null;

        try {
            // Load JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            con = DriverManager.getConnection(url, username, password);
            System.out.println("Connection Successful");

            // SQL query to increase 5% for CSE students
            String updateQuery =
                    "UPDATE Students SET percentage = percentage + (percentage * 0.05) WHERE branch = ?";

            PreparedStatement ps = con.prepareStatement(updateQuery);
            ps.setString(1, "CSE");

            int rowsUpdated = ps.executeUpdate();

            if (rowsUpdated > 0) {
                System.out.println("Percentage increased by 5% for CSE students");
            } else {
                System.out.println("No CSE students found");
            }

        } catch (Exception e) {
            System.out.println("Error occurred while updating percentage");
            e.printStackTrace();
        } finally {
            try {
                if (con != null)
                    con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
