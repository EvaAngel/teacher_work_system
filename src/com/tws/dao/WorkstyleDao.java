package com.tws.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.tws.orm.ConnectMySql;

public class WorkstyleDao {
public int getWorkstyleIdFromWrokstyle(String workstyle)
{
	int id=0;
	PreparedStatement prestat=null;
	String str="select id from workstyle where 作业类型=?";
	prestat=ConnectMySql.connectSql(str);
	try {
		prestat.setString(1, workstyle);
		ResultSet rs=prestat.executeQuery();
		while(rs.next())
		{
			id=rs.getInt("id");
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return id;
	}
}
