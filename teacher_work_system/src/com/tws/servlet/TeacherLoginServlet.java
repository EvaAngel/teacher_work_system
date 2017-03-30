package com.tws.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tws.dao.TeacherDao;
import com.tws.model.Teacher;
import com.tws.service.TeacherService;

public class TeacherLoginServlet extends HttpServlet {
protected void doGet(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
	System.out.println("成功进入servlet");
	String username=req.getParameter("username");
	String password=req.getParameter("password");
	Teacher teacher=new Teacher();
	teacher.setUsername(username);
	teacher.setPassword(password);
	TeacherService ts=new TeacherService();
	if(ts.isTeacherLogin(teacher))
	{
		HttpSession session=req.getSession();
		TeacherDao td=new TeacherDao();
		Teacher teacher2=td.getTeacher(username);
		System.out.println(teacher2.getName());
		session.setAttribute("teacher", teacher2);
		req.getRequestDispatcher("teachermanager.jsp").forward(req, resp);
		
	}
	else
	{
		req.getRequestDispatcher("teacherlogin.jsp").forward(req, resp);
	}
	
}
}
