package controller;

import java.sql.SQLException;

import dao.MobileDao;

public class CreateTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		MobileDao m=new MobileDao();
		m.createTable();

	}

}
