package com.tws.orm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConnectMySql {
static Connection conn;
static PreparedStatement prestat;
public static PreparedStatement connectSql(String sql)
{
	try {
		DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/teacher_work?autoReconnect=true&useSSL=false&useUnicode=true&characterEncoding=utf8","root","717823");
		prestat=conn.prepareStatement(sql);
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return prestat;
}


public static void closeSql()
{
	try {
		prestat.close();
		conn.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}


}
