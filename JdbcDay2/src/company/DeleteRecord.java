package company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteRecord {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		 Class.forName("com.mysql.cj.jdbc.Driver");
	      Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/companydb","root","yash123@");
	      Statement statement= connection.createStatement();
	      statement.execute("delete from company where companyid=4");
	      connection.close();
	      
	      System.out.println(" deleted");
	}

}
