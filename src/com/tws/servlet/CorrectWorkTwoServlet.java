package com.tws.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tws.service.Student_PutWorkToStudentService;

public class CorrectWorkTwoServlet extends HttpServlet {
protected void doGet(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
	
String worktitle=req.getParameter("worktitle");
String answer=req.getParameter("answer");
String suggestion=req.getParameter("suggestion");
int workgrade=Integer.parseInt(req.getParameter("workgrade"));
int studentId=Integer.parseInt(req.getParameter("studentId"));
int workId=Integer.parseInt(req.getParameter("workId"));
String istake=req.getParameter("istake");
Student_PutWorkToStudentService sp=new Student_PutWorkToStudentService();
sp.putSAndGradeToSP(studentId, workId, suggestion, workgrade);
sp.putTakeToSP(istake,studentId,workId);
req.getRequestDispatcher("correctworkmanage2.jsp").forward(req, resp);
}
}
