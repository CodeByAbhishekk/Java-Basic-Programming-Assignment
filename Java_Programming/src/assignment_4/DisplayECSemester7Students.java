package assignment_4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DisplayECSemester7Students {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/jdbcdb";
        String username = "root";
        String password = "password"; // change if needed

        Connection con = null;

        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            con = DriverManager.getConnection(url, username, password);
            System.out.println("Connection Successful");

            // SQL query to fetch records
            String selectQuery =
                    "SELECT id, name, branch, semester FROM Students " +
                    "WHERE semester = ? AND branch = ?";

            PreparedStatement ps = con.prepareStatement(selectQuery);
            ps.setInt(1, 7);
            ps.setString(2, "EC");

            ResultSet rs = ps.executeQuery();

            boolean found = false;
            System.out.println("\n--- EC Students (Semester 7) ---");

            while (rs.next()) {
                found = true;
                System.out.println(
                        "ID: " + rs.getInt("id") +
                        ", Name: " + rs.getString("name") +
                        ", Branch: " + rs.getString("branch") +
                        ", Semester: " + rs.getInt("semester")
                );
            }

            if (!found) {
                System.out.println("No matching records found");
            }

        } catch (Exception e) {
            System.out.println("Error occurred while fetching records");
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
