package com.tws.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tws.model.Teacher;
import com.tws.model.Work;
import com.tws.service.CourseService;
import com.tws.service.WorkService;
import com.tws.service.WorkstyleService;

public class WorkTitleMessageTwoServlet extends HttpServlet {
//将所有的作业信息存入work表中
protected void doGet(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
	HttpSession session=req.getSession();
	Teacher teacher=(Teacher)session.getAttribute("teacher");
	int teacher_id =teacher.getId();
	String worktitle=req.getParameter("worktitle");
	String workrequire=req.getParameter("workrequire");
	String workmaterial=req.getParameter("workmaterial");
	String coursename=req.getParameter("coursename");
	String workstyle=req.getParameter("workstyle");
	//通过coursename获取id&&通过workstyle获取id
	CourseService cs=new CourseService();
	int course_id=cs.getCourseIdFromCoursename(coursename);
	WorkstyleService wss=new WorkstyleService();
	int workstyle_id=wss.getWorkstyleIdFromWorkstyle(workstyle);
	System.out.println(course_id);
	System.out.println(workstyle_id);
	Work work=new Work();
	work.setWorktitle(worktitle);
	work.setWorkrequire(workrequire);
	work.setWorkmaterial(workmaterial);
	work.setTeacher_id(teacher_id);
	work.setCourse_id(course_id);
	work.setWorkstyle_id(workstyle_id);
	WorkService ws=new WorkService();
	ws.putWorkMessage(work);
}
}
