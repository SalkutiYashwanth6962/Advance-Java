package company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertingData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the company id");
		int cid=scanner.nextInt();
		System.out.println("Enter the company name");
		String cname=scanner.next();
		System.out.println("Enter the company address");
		String caddress=scanner.next();
		System.out.println("enter the phone no");
		long cphone=scanner.nextLong();
		System.out.println("enter the company email");
		String cemail=scanner.next();
		
		 Class.forName("com.mysql.cj.jdbc.Driver");
	      Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/companydb","root","yash123@");
	      Statement statement= connection.createStatement();
	      statement.execute("insert into company values("+cid+",'"+cname+"','"+caddress+"',"+cphone+",'"+cemail+"')");
	      connection.close();
	      
	      System.out.println(" inserted");
	}

}
