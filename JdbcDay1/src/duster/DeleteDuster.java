package duster;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteDuster {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/dusterdb", "root", "yash123@");
		Statement statement= connection.createStatement();
		statement.execute("delete from duster where id=1");
		connection.close();
		System.out.println("Successfully deleted the data");
	}

}
