package student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateStudent {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		 Class.forName("com.mysql.cj.jdbc.Driver");
	     Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","yash123@");
	      PreparedStatement preparedStatement=connection.prepareStatement("update student set studentname=?,studentage=? where studentid=?");
	     //setString(placeholderposition,value);
	      preparedStatement.setString(1, "yash");
	      preparedStatement.setInt(2,22);
	      preparedStatement.setInt(3, 2);
	      preparedStatement.execute();
	     //where as it will return the boolean value
	     connection.close();
	     System.out.println("succesfully updated ");
	}

}
