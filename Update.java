package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {

	static String a="select * from mytab";
	static String sql="update mytab set name='mani' where id=3";
	
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mytables", "root", "T#9758@qlph");
		
		 Statement stmt=conn.createStatement();
		
		ResultSet res1=stmt.executeQuery(a);
		
		while(res1.next()) {
			System.out.println(res1.getInt(1));
			System.out.println(res1.getString(2));
			System.out.println("-------");
		}
		boolean res=stmt.execute(sql);
		boolean b=stmt.execute(a);
		
		System.out.println(res);
		System.out.println(b);
		
		conn.close();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
