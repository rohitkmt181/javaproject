import java.sql.*;

// Step 6: Java Program
public class Main {
    
    // Main Method
    public static void main(String[] args) {
        try {
            // Step 7: Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 8: Make Connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/database_name", "username", "password");

            // Step 9: Create PreparedStatement
            PreparedStatement pstmt = con.prepareStatement("INSERT INTO table_name (column_name) VALUES (?)");

            // Step 10: Set Values
            pstmt.setString(1, "Test Value");

            // Step 11: Execute
            pstmt.executeUpdate();

            // Step 12: Print
            System.out.println("Data inserted successfully using PreparedStatement.");

            // Step 13: Create Statement
            Statement stmt = con.createStatement();

            // Step 14: Execute Query
            ResultSet rs = stmt.executeQuery("SELECT * FROM table_name");

            // Step 15: Read ResultSet
            while (rs.next()) {
                
                // Step 16: Get Values
                String value = rs.getString(1);

                // Step 17: Output
                System.out.println("Fetched Data: " + value);
            }

            // Step 18: Close Connection
            con.close();

        } catch (Exception e) {
            // Common Errors and Fixes
            System.out.println(e);
        }
    }
}
