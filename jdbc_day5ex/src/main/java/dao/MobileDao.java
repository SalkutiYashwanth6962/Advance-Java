package dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import dto.Mobile;

public class MobileDao {

	public void createSchema() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","yash123@");
		Statement statement=connection.createStatement();
		statement.execute("create schema mobiledb");
		connection.close();
	 System.out.println("created shema");
		
	}
	public void createTable() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/mobiledb","root","yash123@");
		Statement statement=connection.createStatement();
		statement.execute("create table mobile(id int primary key,brand varchar(10),price double,ram int,color varchar(10),storage int)");
		connection.close();
	 System.out.println("created table");
	}
	public void insertMobile(Mobile m) throws ClassNotFoundException, SQLException {
		 
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/mobiledb","root","yash123@");

		PreparedStatement stmt = connection.prepareStatement(
		        "insert into mobile values(?,?,?,?,?,?)"
		      ); 
		      stmt.setInt(1, m.getId()); 
		      stmt.setString(2, m.getBrand());
		      stmt.setDouble(3, m.getPrice());
		      stmt.setInt(4, m.getRam());
		      stmt.setString(5,m.getColor());
		      stmt.setInt(6, m.getStorage());
		      
		      stmt.execute(); 
		      connection.close();
		      

	 System.out.println("inserted values");
	}
	public void updateMobile(Mobile m) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/mobiledb","root","yash123@");

		PreparedStatement stmt = connection.prepareStatement(
		        "update mobile set brand=?,price=? where id=?"
		      ); 
		      
		      stmt.setString(1, m.getBrand());
		      stmt.setDouble(2, m.getPrice());
		      stmt.setInt(3, m.getId()); 
		      
		      
		      stmt.execute(); 
		      connection.close();
		      

	 System.out.println("updated values");
		
	}

}
