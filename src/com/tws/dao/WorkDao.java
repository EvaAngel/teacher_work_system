package com.tws.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.tws.model.Work;
import com.tws.orm.ConnectMySql;

public class WorkDao {
//------------------------------------------
//写入作业信息
public void putWorkMessage(Work work)
{
	String worktitle=work.getWorktitle();
	String workrequire=work.getWorkrequire();
	String workmaterial=work.getWorkmaterial();
	int teacher_id=work.getTeacher_id();
	int course_id=work.getCourse_id();
	int workstyle_id=work.getWorkstyle_id();
	PreparedStatement prestat=null;
	String str="INSERT INTO work1 (作业题目,作业要求,参看资料,teacher_id,course_id,workstyle_id) values(?,?,?,?,?,?);";
	prestat=ConnectMySql.connectSql(str);
	try {
		prestat.setString(1, worktitle);
		prestat.setString(2, workrequire);
		prestat.setString(3, workmaterial);
		prestat.setInt(4, teacher_id);
		prestat.setInt(5, course_id);
		prestat.setInt(6, workstyle_id);
		prestat.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
//--------------------------------------------------------------------------------------------------------
public List<String> getWorkTitleFromTeacherId(int teacherId)
{
	List<String> workTitleList=new ArrayList<String>();
	PreparedStatement prestat=null;
	String str="select 作业题目 from work1 where teacher_id=?";
	prestat=ConnectMySql.connectSql(str);
	try {
		prestat.setInt(1, teacherId);
		ResultSet rs=prestat.executeQuery();
		while(rs.next())
		{
			String worktitle=rs.getString("作业题目");
			workTitleList.add(worktitle);
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
	return workTitleList;
	}
//------------------------------------------------------------------------
public int getIdFromWork(String worktitle,int teacherId,String coursename,String workstyle)
{
	PreparedStatement prestat=null;
	int workId=0;
	String str="select id from work1 where 作业题目=? and teacher_id=? and course_id in (select id from course where coursename=?) and workstyle_id in (select id from workstyle where 作业类型=?)";
	prestat=ConnectMySql.connectSql(str);
	try {
		prestat.setString(1, worktitle);
		prestat.setInt(2,teacherId);
		prestat.setString(3, coursename);
		prestat.setString(4, workstyle);
		ResultSet rs=prestat.executeQuery();
		while(rs.next())
		{
			workId=rs.getInt("id");
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return workId;
	}
}
