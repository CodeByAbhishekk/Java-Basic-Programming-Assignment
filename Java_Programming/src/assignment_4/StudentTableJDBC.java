package assignment_4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;

public class StudentTableJDBC {

    public static void main(String[] args) {

        // Database details
        String url = "jdbc:mysql://localhost:3306/jdbcdb";
        String username = "root";
        String password = "password"; // change if different

        Connection con = null;

        try {
            // 1. Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Establish connection
            con = DriverManager.getConnection(url, username, password);
            System.out.println("Connection Successful");

            // 3. Create table
            String createTable =
                    "CREATE TABLE IF NOT EXISTS Students (" +
                    "id INT PRIMARY KEY AUTO_INCREMENT," +
                    "name VARCHAR(50)," +
                    "age INT," +
                    "course VARCHAR(50))";

            Statement stmt = con.createStatement();
            stmt.executeUpdate(createTable);
            System.out.println("Table created successfully");

            // 4. Insert records
            String insertQuery =
                    "INSERT INTO Students (name, age, course) VALUES (?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(insertQuery);

            ps.setString(1, "Rahul");
            ps.setInt(2, 21);
            ps.setString(3, "Java");
            ps.executeUpdate();

            ps.setString(1, "Anita");
            ps.setInt(2, 22);
            ps.setString(3, "Python");
            ps.executeUpdate();

            ps.setString(1, "Suresh");
            ps.setInt(2, 20);
            ps.setString(3, "Database");
            ps.executeUpdate();

            System.out.println("Records inserted successfully");

        } catch (Exception e) {
            System.out.println("Error occurred");
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
