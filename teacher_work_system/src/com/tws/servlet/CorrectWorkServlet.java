package com.tws.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tws.service.Student_PutWorkToStudentService;

public class CorrectWorkServlet extends HttpServlet {
protected void doGet(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
int studentId=Integer.parseInt(req.getParameter("studentId"));
int workId=Integer.parseInt(req.getParameter("workId"));
String worktitle=req.getParameter("worktitle");
req.setAttribute("worktitle", worktitle);
//------------------------------获取学生答题情况
Student_PutWorkToStudentService sp=new Student_PutWorkToStudentService();
String answer=sp.getAnswerFromSPW(studentId, workId);
req.setAttribute("answer", answer);
req.setAttribute("studentId", studentId);
req.setAttribute("workId", workId);
req.getRequestDispatcher("correctworkmanage.jsp").forward(req, resp);
}
}
