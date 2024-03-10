package student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteStudent {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		 Class.forName("com.mysql.cj.jdbc.Driver");
	     Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","yash123@");
	     PreparedStatement preparedstatement= connection.prepareStatement("delete from student where studentid=?");
	     preparedstatement.setInt(1, 1);
	     preparedstatement.execute();
	     //where as it will return the boolean value
	     connection.close();
	     System.out.println("succesfully deleted ");
	     
	}

}
