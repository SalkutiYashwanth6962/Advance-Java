package controller;

import java.sql.SQLException;

import dao.BikeDao;

public class InsertBike {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
     BikeDao bikeDao=new BikeDao();
     bikeDao.insertBike();
	}

}
