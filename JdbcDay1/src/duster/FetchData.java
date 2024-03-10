package duster;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/dusterdb", "root", "yash123@");
		Statement statement= connection.createStatement();
		ResultSet resultSet= statement.executeQuery("select * from duster" );
		while(resultSet.next()) {
			System.out.println(resultSet.getInt(1));
			System.out.println(resultSet.getString(2));
			System.out.println(resultSet.getString(3));
			System.out.println(resultSet.getDouble(4));
			System.out.println(resultSet.getDouble(5));
			
		}
		connection.close();
		System.out.println("Successfully fetched the data");

	}

}
