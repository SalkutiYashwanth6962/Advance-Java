package person;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertPerson {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
	    //load and register the driver 
		Class.forName("com.mysql.cj.jdbc.Driver");
		//establish the connection with the mysql db
		Connection connection=  DriverManager.getConnection("jdbc:mysql://localhost:3306/persondb","root","yash123@");
		//create the statement
		Statement statement= connection.createStatement();
		//execute the statement
		statement.execute("insert into person values(2,'yashwanthreddy',25,'hyd',6303436963)");
	
		//close the connection
		connection.close();
		System.out.println("inserted");
		

	}

}
