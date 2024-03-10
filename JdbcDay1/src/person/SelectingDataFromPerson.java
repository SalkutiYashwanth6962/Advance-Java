package person;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectingDataFromPerson {
  public static void main(String[] args) throws ClassNotFoundException, SQLException {
	  Class.forName("com.mysql.cj.jdbc.Driver");
      //establish the connection
      Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/persondb","root","yash123@");
      //create the statement
      Statement statement=connection.createStatement();
      //execute the queries
    
      ResultSet resultset=statement.executeQuery("Select * from person");
      while(resultset.next()) {
    	 // int id=resultset.getInt("PersonId");
    	  
    	  System.out.println(resultset.getInt(1));
    	  System.out.println(resultset.getString(2));
    	  System.out.println(resultset.getInt(3));
    	  System.out.println(resultset.getString(4));
    	  System.out.println(resultset.getLong(5));
      }
      
      //close the connection
      connection.close();
      System.out.println("fetching  done Successfully");
}
}
