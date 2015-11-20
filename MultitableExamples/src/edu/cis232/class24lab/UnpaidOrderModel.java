package edu.cis232.class24lab;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class UnpaidOrderModel {
	final static String DB_URL = "jdbc:derby:CoffeeDB;create=true";
	
	public static ArrayList<String> getUnpaidCustomerNames(){

		ArrayList<String> names = new ArrayList<String>();
		
		try {
			Connection conn = DriverManager.getConnection(DB_URL);
			
			Statement stmt = conn.createStatement();
			
			ResultSet results = stmt.executeQuery("select distinct c.Name from UnpaidOrder u, Customer c where c.CustomerNumber = u.CustomerNumber");
			
			
			while(results.next()){
				names.add(results.getString("Name"));
			}
			
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return names;
	}
}
