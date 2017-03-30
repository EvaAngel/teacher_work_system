package com.tws.service;

import java.util.Iterator;
import java.util.List;

import com.tws.dao.TeacherDao;
import com.tws.model.Teacher;

public class TeacherService {
//------------------------------------
public boolean isTeacherLogin(Teacher teacher)
{
	TeacherDao td=new TeacherDao();
	List<Teacher> teacherlist=td.getTeacherList();
	for(Iterator iter=teacherlist.iterator();iter.hasNext();)
	{
	Teacher tea=(Teacher)iter.next();
	if(teacher.getUsername().equals(tea.getUsername())&&teacher.getPassword().equals(tea.getPassword()))
	{
     return true;	
	}
    }
	return false;
}
//----------------------------------------------


}
