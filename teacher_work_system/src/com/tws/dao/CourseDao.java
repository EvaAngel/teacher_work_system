package com.tws.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.tws.orm.ConnectMySql;

public class CourseDao {
public void putTeacheridToCourse(int teacherid,String coursename)
{
	System.out.println(coursename);
	System.out.println(teacherid);
	String str="update course set teacher_id= ? where coursename=?";  //这个地方又捣鼓了半天，用的是中文名所以错误，但是在mysql中就不会有错误，看来还是这两个不同的
	PreparedStatement prestat=null;
	prestat=ConnectMySql.connectSql(str);
	try {
		prestat.setInt(1,teacherid);
		System.out.println("成功1");
		prestat.setString(2,coursename);
		System.out.println("成功2");
		prestat.executeUpdate();
		System.out.println("成功3");
		ConnectMySql.closeSql();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
//----------------------------------------------------------------------------------------
public void putPointToCourse(String pointStyle,String coursename)
{
	String str="update course set 评分标准=? where coursename=?";
	PreparedStatement prestat=null;
	prestat=ConnectMySql.connectSql(str);
	try {
		prestat.setString(1, pointStyle);
		prestat.setString(2, coursename);
		prestat.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	ConnectMySql.closeSql();
	}
//---------------------------------------------------------------------------------------------------

public List<String> researchCoursenameFromTeacherId(int teacherId)
{
	PreparedStatement prestat=null;
	List<String> coursenameList=new ArrayList<String>();
	String str="select coursename from course where teacher_id=?";
	prestat=ConnectMySql.connectSql(str);
	try {
		prestat.setInt(1, teacherId);
		ResultSet rs=prestat.executeQuery();
		while(rs.next())
		{
		  	coursenameList.add(rs.getString("coursename"));
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return coursenameList;
	}

//------------------------------------------------------------------
//通过课程获取课程id
public int  getCourseIdFromCoursename(String coursename)
{
	int id=0;
	PreparedStatement prestat=null;
	String str="select id from course where coursename=?";
	prestat=ConnectMySql.connectSql(str);
	try {
		prestat.setString(1, coursename);
		ResultSet rs=prestat.executeQuery();
		while(rs.next())
		{
			id=rs.getInt("id");
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return id;
	}






}
