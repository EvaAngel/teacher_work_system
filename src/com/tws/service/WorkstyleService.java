package com.tws.service;

import com.tws.dao.WorkstyleDao;


public class WorkstyleService {
public int getWorkstyleIdFromWorkstyle(String workstyle)
{
	return new WorkstyleDao().getWorkstyleIdFromWrokstyle(workstyle);
	}
}
