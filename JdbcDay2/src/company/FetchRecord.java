package company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchRecord {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		 Class.forName("com.mysql.cj.jdbc.Driver");
	      Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/companydb","root","yash123@");
	      Statement statement= connection.createStatement();
	      ResultSet resultSet=  statement.executeQuery("select * from company");
	      while(resultSet.next()) {
	    	  System.out.println(resultSet.getInt(1));
	    	  System.out.println(resultSet.getString(2));
	    	  System.out.println(resultSet.getString(3));
	    	  System.out.println(resultSet.getLong(4));
	    	  System.out.println(resultSet.getString(5));
	      }
	      connection.close();
	      
	      System.out.println(" fetched");
	}

}
