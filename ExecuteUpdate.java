package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ExecuteUpdate {
public static void main(String[] args) throws SQLException {
	String url="jdbc:oracle:thin:@localhost:1521/orcl";
	String userName="scott";
	String passWord="tiger";
	String query="update employee set e_id=205 where e_name='DAR'";
	Connection con=DriverManager.getConnection(url, userName, passWord);
	Statement stn=con.createStatement();
	int value=stn.executeUpdate(query);
	System.out.println(value);
	
}
}
