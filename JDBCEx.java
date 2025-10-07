package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCEx {
public static void main(String[] args) {
	//Driver → Implements how to connect and communicate with a specific database.
    //DriverManager → Chooses and manages the right driver for your Connection.
	
	try{
	//loading and registering
	Class.forName("oracle.jdbc.driver.OracleDriver");      
	//forName method used for Loading of Classes and Interfaces and it is static method present inside class
	System.out.println("Driver registered");
	//Establish Connection
	String url="jdbc:oracle:thin:@localhost:1521/orcl";
	String userName="scott";
	String passWord="tiger";
	Connection conn=DriverManager.getConnection(url,userName,passWord);
	System.out.println("Connection established");
	
	//Create statement
	Statement st=conn.createStatement();
	System.out.println("Statement created");
	String sql="select ename, sal from emp";
	ResultSet rs=st.executeQuery(sql);
	System.out.println("Fetching the records");
	while(rs.next()){
		System.out.println(rs.getString("ename")+" "+rs.getString("sal"));
	}
	}
    catch(ClassNotFoundException ce)
	{
		System.out.println(ce.getMessage());
		ce.printStackTrace();
	}
	catch(SQLException se) {
		System.out.println(se.getMessage());
	}
}
}
