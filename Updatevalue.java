package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Updatevalue {

	static String sql= "update mytab set name ='kiran' where id=5";
	public static void main(String[] args) {
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		Connection	connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mytables", "root", "T#9758@qlph");
			
		Statement statement=connection.createStatement();
		
		boolean res=statement.execute(sql); 
		
		connection.close();
		
		System.out.println(sql);
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
