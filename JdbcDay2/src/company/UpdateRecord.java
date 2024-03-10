package company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateRecord {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		 Class.forName("com.mysql.cj.jdbc.Driver");
	      Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/companydb","root","yash123@");
	      Statement statement= connection.createStatement();
	      statement.execute("update company set companyname='fix' where companyid=1");
	      connection.close();
	      
	      System.out.println(" updated");
	}

}
