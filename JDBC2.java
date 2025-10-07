package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC2 {
public static void main(String[] args)  {
String url="jdbc:oracle:thin:@localhost:1521/orcl";
String userName="scott";
String passWord="tiger";
//String query="Create table Emp1(empname varchar(20),empid number primary key,city varchar(20))";
String query="drop table emp1";
Connection con=null;
Statement stn=null;
try {
 con=DriverManager.getConnection(url,userName,passWord);
 stn=con.createStatement();
 boolean rs=stn.execute(query);
 if(rs)
	 System.out.println("successfully created employee table");

}catch(SQLException e) {
	System.out.println(e.getMessage());
}finally {
	try {
		stn.close();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	try {
		con.close();
	} catch (SQLException e) {
		e.printStackTrace();
	}
}
}
}