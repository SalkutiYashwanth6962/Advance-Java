package person;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeletePerson {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/persondb","root","yash123@");
      Statement statement= connection.createStatement();
      statement.execute("Delete from person where personid=1");
      connection.close();
      System.out.println("deletion done");
	}

}
