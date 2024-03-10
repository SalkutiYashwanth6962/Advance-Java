package controller;

import java.sql.SQLException;
import java.util.Scanner;

import dao.MobileDao;
import dto.Mobile;

public class UpdateMobile {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id value");
		int id=sc.nextInt();
		System.out.println("enter the brand");
		String brand=sc.next();
		System.out.println("enter the price");
		double price=sc.nextDouble();
		System.out.println("enter the ram");
		int ram=sc.nextInt();
		System.out.println("enter the color");
		String color=sc.next();
		System.out.println("enter the storage");
		int storage=sc.nextInt();
		Mobile m=new Mobile();
		m.setId(id);
		m.setBrand(brand);
		m.setPrice(price);
		m.setRam(ram);
		m.setColor(color);
		m.setStorage(storage);
		
		MobileDao m1=new MobileDao();
		m1.updateMobile(m);
		

	}

}
