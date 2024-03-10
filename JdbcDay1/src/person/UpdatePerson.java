package person;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdatePerson {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		//load and register the driver 
      Class.forName("com.mysql.cj.jdbc.Driver");
      //establish the connection
      Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/persondb","root","yash123@");
      //create the statement
      Statement statement=connection.createStatement();
      //execute the queries
     // statement.execute("update person set personname='navinreddy',personage=30,personaddress='us',personphoneno=9999988888 where personid=2 ");
      statement.execute("update person set personname='navinreddy',personage=30,personaddress='hyd',personphoneno=9999988888 where personid=2 ");
      //close the connection
      connection.close();
      System.out.println("updation done");
      
	}

}
