import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Jdbc {
	public static void main(String[] args) throws SQLException {
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","Roshan@2003");;
		
		PreparedStatement ptst = con.prepareStatement("select * from employee");
		
		ResultSet rt = ptst.executeQuery();
		
		while(rt.next()) {
			System.out.print(rt.getString(2));
			System.out.print(rt.getInt(1));
			System.out.println(rt.getDouble(3));
		}
		
//		rt.ha
	}
}
