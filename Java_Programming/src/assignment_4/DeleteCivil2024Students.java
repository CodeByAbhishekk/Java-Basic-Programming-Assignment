package assignment_4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteCivil2024Students {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/jdbcdb";
        String username = "root";
        String password = "password"; // change if your MySQL password is different

        Connection con = null;

        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            con = DriverManager.getConnection(url, username, password);
            System.out.println("Connection Successful");

            // SQL query to delete records
            String deleteQuery =
                    "DELETE FROM Students WHERE year_of_passing = ? AND branch = ?";

            PreparedStatement ps = con.prepareStatement(deleteQuery);
            ps.setInt(1, 2024);
            ps.setString(2, "Civil");

            int rowsDeleted = ps.executeUpdate();

            if (rowsDeleted > 0) {
                System.out.println(rowsDeleted + " record(s) deleted successfully");
            } else {
                System.out.println("No matching records found");
            }

        } catch (Exception e) {
            System.out.println("Error occurred while deleting records");
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
