package com.tws.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.tws.orm.ConnectMySql;

public class Course_WorkstyleDao {
public void putCourseidAndWorkstyleidToCourseWorkstyle(String coursename,String[] workstyle)
{
	for(String s:workstyle){
	PreparedStatement prestat=null;
	String str="update course_workstyle set courseid=(select id from course where coursename=?) and workstyleid=(select id from workstyle where 作业类型=?)";
	prestat=ConnectMySql.connectSql(str);
	try {
		prestat.setString(1, coursename);
		prestat.setString(2, s);
		prestat.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	}
}
