package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Printtable2 {

	public static void main(String[] args) {
		
      try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mytables", "root", "T#9758@qlph");
		
	PreparedStatement ps=connection.prepareStatement("select * from mytab");
	
	ResultSet rs=ps.executeQuery();
     
	while(rs.next()) {
		int id=rs.getInt("id");
		String name=rs.getString("name");
		
		System.out.println( id + ":" + name);
		System.out.println("--------");
	}
	connection.close();
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      
      

	}

}
