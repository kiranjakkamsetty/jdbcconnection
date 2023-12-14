package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Printtable {

	static String sql="select * from mytab";
	
	public static void main(String[] args) {
		
 try {
	 
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mytables", "root", "T#9758@qlph");

	 try(Statement statement=connection.createStatement();
			 
	 ResultSet rs=statement.executeQuery(sql)){
		
		 while(rs.next()){		
		 int id =rs.getInt("id");
		 String name = rs.getString("name");
			 
		 System.out.println( id  + ":"  +name);
		 }	 
	 }
 } 
    catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	
}	
  }

}
