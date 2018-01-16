package com.tws.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.print.attribute.standard.PresentationDirection;

import com.tws.model.Student_PutWork;
import com.tws.orm.ConnectMySql;

public class Student_PutWorkToStudentDao {
public List<Student_PutWork> getStudentFromId(int workId){	
List<Student_PutWork> swList=new ArrayList<Student_PutWork>();
PreparedStatement prestat=null;
String str="select sp.�ύ״̬,sp.�ύʱ��,s.ѧ��,s.����,s.��¼����,s.�༶,s.id  from student_putwork sp,student s where sp.student_id=s.id and sp.work_id=?";
prestat=ConnectMySql.connectSql(str);
try {
	prestat.setInt(1, workId);
	ResultSet rs=prestat.executeQuery();
	while(rs.next())
	{
		Student_PutWork spw=new Student_PutWork();
		spw.setXuehao(rs.getString("s.ѧ��"));
		spw.setName(rs.getString("s.����"));
		spw.setPassword(rs.getString("s.��¼����"));
		spw.setClassname(rs.getString("s.�༶"));
		spw.setTakestate(rs.getString("sp.�ύ״̬"));
		spw.setTaketime(rs.getString("sp.�ύʱ��"));
		spw.setId(rs.getInt("s.id"));
		swList.add(spw);
	}
} catch (SQLException e) {
	   e.printStackTrace();
}
return swList;
}

public String getAnswerFromSPW(int studentid,int workid)
{
	PreparedStatement prestat=null;
	String answer=null;
	String str="select ѧ������ from student_putwork where student_id=? and work_id=?";
	prestat=ConnectMySql.connectSql(str);
	try {
		prestat.setInt(1, studentid);
		prestat.setInt(2, workid);
		ResultSet rs=prestat.executeQuery();
		while(rs.next())
		{
			 answer=rs.getString("ѧ������");
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return answer;
	}
//-----------------------------------------------------------------------
public void putSAndGradeToSP(int studentId,int workId,String suggestion,int grade)
{
	PreparedStatement prestat=null;
	String str="update student_putwork set �������=?,��ҵ�ɼ�=? where student_id=? and work_id=?";
	prestat=ConnectMySql.connectSql(str);
	try
	{
	prestat.setString(1, suggestion);
	prestat.setInt(2, grade);
	prestat.setInt(3, studentId);
	prestat.setInt(4, workId);
	prestat.executeUpdate();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	}
//--------------------------------------------------------------------------
public void putTakeToSP(String istake,int studentId,int workId)
{
	PreparedStatement prestat=null;
	String str="update student_putwork set �ύ״̬=? where student_id=? and work_id=?";
	prestat=ConnectMySql.connectSql(str);
	try
	{
	prestat.setString(1,istake);
	prestat.setInt(2, studentId);
	prestat.setInt(3, workId);
	prestat.executeUpdate();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	}



}