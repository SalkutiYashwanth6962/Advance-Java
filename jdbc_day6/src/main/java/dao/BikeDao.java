package dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BikeDao {
 public void insertBike() throws ClassNotFoundException, SQLException {
	 Class.forName("com.mysql.cj.jdbc.Driver");
	 Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/bikedb","root","yash123@");
	 CallableStatement callableStatement= connection.prepareCall("call bikedb.insertBike(?,?,?,?,?,?)");
	 callableStatement.setInt(1, 10);
	 callableStatement.setString(2,"apache");
	 callableStatement.setString(3, "tvs");
	 callableStatement.setDouble(4, 185);
	 callableStatement.setDouble(5, 150000);
	 callableStatement.setString(6, "red");
	 callableStatement.execute();
	 connection.close();
	 System.out.println("successfuly inserted");
 }
 public void deleteBike() throws ClassNotFoundException, SQLException {
	 Class.forName("com.mysql.cj.jdbc.Driver");
	 Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/bikedb","root","yash123@");
	 CallableStatement callableStatement= connection.prepareCall("call bikedb.deleteBike(?)");
	 callableStatement.setInt(1, 10);
	 callableStatement.execute();
	 connection.close();
	 System.out.println("successfuly deleted");
 }
 public void updateBike() throws ClassNotFoundException, SQLException {
	 Class.forName("com.mysql.cj.jdbc.Driver");
	 Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/bikedb","root","yash123@");
	 CallableStatement callableStatement= connection.prepareCall("call bikedb.updateBike(?)");
	 callableStatement.setInt(1, 10);
	 callableStatement.execute();
	 connection.close();
	 System.out.println("successfuly updated");
 }
 
}
