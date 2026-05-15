import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Utils {
	public static Connection getCon() throws SQLException {
	return DriverManager.getConnection("jdbc:mysql://localhost:3306/custbill","root","Roshan@2003");
		
		
	}
}
