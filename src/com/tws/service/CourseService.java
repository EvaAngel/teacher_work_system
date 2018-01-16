package com.tws.service;

import java.util.List;

import com.tws.dao.CourseDao;

public class CourseService {

//----------------------------------------------------------------
public void putTeacherIdToCourse(int teacherid,String coursename)
{
	CourseDao cd=new CourseDao();
	cd.putTeacheridToCourse(teacherid, coursename);
	}
//---------------------------------------------------------------
public void putPointToCourse(String pointStyle,String coursename)
{
	CourseDao cd=new CourseDao();
	cd.putPointToCourse(pointStyle, coursename);
	
}
//----------------------------------------------------------------
public List<String> researchCoursenameFromTeacherId(int teacherId)
{
	List<String> coursename=new CourseDao().researchCoursenameFromTeacherId(teacherId);
	return coursename;
}

//---------------------------------------------------------------
public int getCourseIdFromCoursename(String coursename)
{
	CourseDao cd=new CourseDao();
	return cd.getCourseIdFromCoursename(coursename);
	
}

}
