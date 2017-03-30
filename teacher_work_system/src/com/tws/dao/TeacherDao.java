package com.tws.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.tws.model.Teacher;
import com.tws.orm.ConnectMySql;

public class TeacherDao {
//-------------------------------------
public List<Teacher> getTeacherList()
{
	PreparedStatement prestat=ConnectMySql.connectSql("");
	List<Teacher> teacherlist=new ArrayList<Teacher>();
	try {
		ResultSet rs=prestat.executeQuery("select * from teacher");
		while(rs.next())
		{
			Teacher teacher=new Teacher();
			int id=rs.getInt("id");
			String username=rs.getString("username");
			String password=rs.getString("password");
			String name=rs.getString("name");
			String sex=rs.getString("sex");
			int age=rs.getInt("age");
			String tele=rs.getString("tele");
			String address=rs.getString("address");
			String email=rs.getString("email");
			teacher.setId(id);
			teacher.setUsername(username);
			teacher.setPassword(password);
			teacher.setName(name);
			teacher.setSex(sex);
			teacher.setAge(age);
			teacher.setTele(tele);
			teacher.setAddress(address);
			teacher.setEmail(email);
			teacherlist.add(teacher);
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return teacherlist;
	}

//-------------------------------------------------------------

public Teacher getTeacher(String username)
{
	Teacher teacher=new Teacher();
	String sql="select * from teacher where username=?";
	
	PreparedStatement prestat=ConnectMySql.connectSql(sql);
	try {
		prestat.setString(1, username);
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	try {
		ResultSet rs=prestat.executeQuery();
		while(rs.next())
		{
			int id=rs.getInt("id");
			String user=rs.getString("username");
			String password=rs.getString("password");
			String name=rs.getString("name");
			String sex=rs.getString("sex");
			int age=rs.getInt("age");
			String tele=rs.getString("tele");
			String address=rs.getString("address");
			String email=rs.getString("email");
			teacher.setId(id);
			teacher.setUsername(user);
			teacher.setPassword(password);
			teacher.setName(name);
			teacher.setSex(sex);
			teacher.setAge(age);
			teacher.setTele(tele);
			teacher.setAddress(address);
			teacher.setEmail(email);
		}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
	return teacher;
}

}
