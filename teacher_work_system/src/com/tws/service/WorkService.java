package com.tws.service;

import java.util.List;

import com.tws.dao.WorkDao;
import com.tws.model.Work;

public class WorkService {
public void putWorkMessage(Work work)
{
	WorkDao wd=new WorkDao();
	wd.putWorkMessage(work);
	}
//---------------------------------------
public List<String> getWorkTitleFromTeacherId(int teacherId)
{
	return new WorkDao().getWorkTitleFromTeacherId(teacherId);
	}
//-----------------------------------------------
public int getIdFromWork(String worktitle,int teacherId,String coursename,String workstyle)
{
	return new WorkDao().getIdFromWork(worktitle, teacherId, coursename, workstyle);
	}
}
