package com.tws.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tws.model.Student_PutWork;
import com.tws.model.Teacher;
import com.tws.service.Student_PutWorkToStudentService;
import com.tws.service.WorkService;

public class WorkResearchManageTwoServlet extends HttpServlet {
protected void doGet(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
HttpSession session=req.getSession();
Teacher teacher=(Teacher)session.getAttribute("teacher");
int teacherId=teacher.getId();
String coursename=req.getParameter("coursename");
String worktitle=req.getParameter("worktitle");
String workstyle=req.getParameter("workstyle");
String classname=req.getParameter("classname");
System.out.println(coursename);
System.out.println(worktitle);	
System.out.println(workstyle);
System.out.println(classname);
//---------------------------------------------------------------------
WorkService ws=new WorkService();
int workId=ws.getIdFromWork(worktitle, teacherId, coursename, workstyle);
System.out.println(workId);
//------------------------根据作业id查找学生信息
List<Student_PutWork> spwList=new Student_PutWorkToStudentService().getStudentFromId(workId);
req.setAttribute("spwList", spwList);
req.setAttribute("worktitle", worktitle);
req.setAttribute("workId",workId);
System.out.println(spwList.size());
req.getRequestDispatcher("workresearchmanage2.jsp").forward(req, resp);
}
}
