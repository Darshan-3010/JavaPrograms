package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcSelect {
public static void main(String[] args) throws SQLException {
	String url="jdbc:oracle:thin:@localhost:1521/orcl";
	String userName="scott";
	String passWord="tiger";
	String query="select * from emp";
	Connection con=DriverManager.getConnection(url, userName, passWord);
	Statement stn=con.createStatement();
	boolean rs=stn.execute(query);
	System.out.println(rs);
	if(rs)
	{
		ResultSet resultset=stn.getResultSet();
		while(resultset.next())
		{
			System.out.println(resultset.getString(1)+" "+resultset.getString(2)+" "+resultset.getString(3));
		}
	}
	else {
		System.out.println("Data not found");
	}
	stn.close();
	con.close();
}
}
