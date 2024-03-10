package student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertStudent {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
     Class.forName("com.mysql.cj.jdbc.Driver");
     Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","yash123@");
     PreparedStatement preparedStatement= connection.prepareStatement("insert into student values(?,?,?,?,?,?)");
     preparedStatement.setInt(1, 1);
     preparedStatement.setString(2, "yashwanth");
     preparedStatement.setInt(3,23);
     preparedStatement.setString(4, "Hyd");
     preparedStatement.setLong(5,6303436962l);
     preparedStatement.setString(6, "male");
     preparedStatement.execute();
     connection.close();
     System.out.println("succesfully inserted ");
     
	}

}
