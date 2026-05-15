import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Tester {
	public static void main(String[] args) {
	 CustService obj = new CustService();
	 
	 try {
		obj.addCust();
		obj.addCust();
		obj.find(2);
		obj.find(10);
		obj.generate();
		obj.display();
		
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
			
	
		
	}
}
