package Advanced_Java.JDBC;

import java.sql.*;

public class CRUDExample {
    // JDBC URL, username and password of MySQL server
    private static final String URL = "jdbc:mysql://localhost:3306/db_name";// enter your db name
    private static final String USER = "root";
    private static final String PASSWORD = "password";// replace with your password

    public static void main(String[] args) {
        try {
            // 1. Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Establish connection
            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("✅ Connected to database!");

            // 3. Create table if not exists
            Statement stmt = con.createStatement();
            String createTable = "CREATE TABLE IF NOT EXISTS students (" +
                    "id INT PRIMARY KEY AUTO_INCREMENT," +
                    "first_name VARCHAR(50)," +
                    "last_name VARCHAR(50)," +
                    "age INT)";
            stmt.executeUpdate(createTable);

            // 4. INSERT Operation
            String insertSQL = "INSERT INTO students (first_name, last_name, age) VALUES (?, ?, ?)";
            PreparedStatement psInsert = con.prepareStatement(insertSQL);
            psInsert.setString(1, "John");
            psInsert.setString(2, "Doe");
            psInsert.setInt(3, 20);
            psInsert.executeUpdate();
            System.out.println("✅ Record Inserted!");

            // 5. SELECT Operation
            String selectSQL = "SELECT * FROM students";
            ResultSet rs = stmt.executeQuery(selectSQL);
            System.out.println("\n📌 Students Table:");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " | " +
                        rs.getString("first_name") + " " +
                        rs.getString("last_name") + " | Age: " +
                        rs.getInt("age"));
            }

            // 6. UPDATE Operation
            String updateSQL = "UPDATE students SET age=? WHERE first_name=?";
            PreparedStatement psUpdate = con.prepareStatement(updateSQL);
            psUpdate.setInt(1, 22);
            psUpdate.setString(2, "John");
            psUpdate.executeUpdate();
            System.out.println("\n✅ Record Updated!");

            // 7. DELETE Operation
            String deleteSQL = "DELETE FROM students WHERE first_name=?";
            PreparedStatement psDelete = con.prepareStatement(deleteSQL);
            psDelete.setString(1, "John");
            psDelete.executeUpdate();
            System.out.println("✅ Record Deleted!");

            // Close connection
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
