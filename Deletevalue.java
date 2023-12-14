package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class Deletevalue {

	static String sql="delete from mytab where id = 5";
	public static void main(String[] args) {
			
		try {
			DriverManager.registerDriver(new Driver());
		
     	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mytables","root","T#9758@qlph");
		
     	
	     Statement statement = connection.createStatement();
		
	      boolean res=statement.execute(sql);
	      
		
		connection.close();
		
		System.out.println(res);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

		

	}
}
			
		
