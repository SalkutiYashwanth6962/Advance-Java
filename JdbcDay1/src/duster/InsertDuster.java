package duster;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDuster {
	
   public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/dusterdb", "root", "yash123@");
	Statement statement= connection.createStatement();
	statement.execute("Insert into duster values(1,'syr','blue',25,4.5)");
	statement.execute("Insert into duster values(3,'syr','blue',25,4.5)");
	connection.close();
	System.out.println("Successfully inseerted the data");
}
}
