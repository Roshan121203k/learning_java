import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCInsertData {
    public static void main(String[] args) {
        try {
            // Load driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/company",
                "root",
                "Roshan@2003"
            );

            // Prepare query
            String query = "INSERT INTO employee(name, salary) VALUES (?, ?)";
            PreparedStatement pst = con.prepareStatement(query);

            // Set values
            pst.setString(1, "John");
            pst.setDouble(2, 5000);

            // Execute
            int rows = pst.executeUpdate();
            System.out.println("Rows " + rows + " inserted");
            
            
            Statement stmt = con.createStatement();
            
            ResultSet rs = stmt.executeQuery("select * from company");
            
            while(rs.next()) {
            	System.out.println(rs.getString("name"));
            }
            
            String query2 = "update employee set salary = ? where id = ?";
            
            PreparedStatement otot = con.prepareStatement(query2);
            otot.setDouble(1, 6000);
            otot.setInt(2, 1);
            
            int ghg = otot.executeUpdate();
            
            System.out.println(ghg + " rows updated");
            // Close connection
            con.close();
            
            
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}