import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CustService {
	
	public void addCust() throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter id,name,addrsss,mobile");
		Connection con = Utils.getCon();
		PreparedStatement ptmt = con.prepareStatement("insert into customer values (?,?,?,?)");
		ptmt.setInt(1, sc.nextInt());
		ptmt.setString(2, sc.next());
		ptmt.setString(3, sc.next());
		ptmt.setDouble(4, sc.nextDouble());
		
		if(ptmt.executeUpdate() > 0) {
			System.out.println("added");
		}else {
			throw new SQLException("some problem");
		}
		con.close();
	}
	
	
	public void display() throws SQLException {
		Connection con = Utils.getCon();
PreparedStatement ptst = con.prepareStatement("select * from customer");
		
		ResultSet rt = ptst.executeQuery();
		
		while(rt.next()) {
			System.out.print(rt.getString(2));
			System.out.print(rt.getInt(1));
			System.out.println(rt.getString(3));

			System.out.println(rt.getDouble(4));
		}
		con.close();
	}
	
	
	public void find(int id) throws SQLException {
		Connection con = Utils.getCon();
		
		PreparedStatement ptst = con.prepareStatement("select * from customer where id = ?");
		ptst.setInt(1,id);
		ResultSet rs = ptst.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			System.out.println(rs.getDouble(4));
		}
		con.close();
	}
	
	
	public void generate() throws SQLException, IOException {
		Connection con = Utils.getCon();
		PreparedStatement ptst = con.prepareStatement("select * from customer");
				
				ResultSet rt = ptst.executeQuery();
				Workbook wb = new XSSFWorkbook();
				
				org.apache.poi.ss.usermodel.Sheet sheet = wb.createSheet("Employees");
				
				Row header = sheet.createRow(0);
				header.createCell(0).setCellValue("ID");
				header.createCell(1).setCellValue("Name");
				header.createCell(2).setCellValue("Salary");
				int i = 1;
				while(rt.next()) {
					
					
					
					Row row1 = sheet.createRow(i);
					
					row1.createCell(0).setCellValue(rt.getInt(1));
					row1.createCell(1).setCellValue(rt.getString(2));
					row1.createCell(2).setCellValue(rt.getString(3));

					row1.createCell(3).setCellValue(rt.getDouble(4));
					
					
					i++;
				}
				FileOutputStream fos = new FileOutputStream("employee.xlsx");
				wb.write(fos);
				wb.close();
				fos.close();
				con.close();
	}
}
