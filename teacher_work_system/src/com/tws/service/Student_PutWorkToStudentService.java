package com.tws.service;

import java.util.List;

import com.tws.dao.Student_PutWorkToStudentDao;
import com.tws.model.Student_PutWork;

public class Student_PutWorkToStudentService {
	public List<Student_PutWork> getStudentFromId(int workId){
	return new Student_PutWorkToStudentDao().getStudentFromId(workId);
	}
	
	public String getAnswerFromSPW(int studentid,int workid)
	{
		return new Student_PutWorkToStudentDao().getAnswerFromSPW(studentid, workid);
	}
	public void putSAndGradeToSP(int studentId,int workId,String suggestion,int grade)
	{
		new Student_PutWorkToStudentDao().putSAndGradeToSP(studentId, workId, suggestion, grade);
	}
	public void putTakeToSP(String istake,int studentId,int workId)
	{
		if(istake.equals("·ñ"))
		{
			new Student_PutWorkToStudentDao().putTakeToSP(istake, studentId, workId);
		}
	}
	
	}

