package com.tws.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tws.model.Teacher;
import com.tws.service.CourseService;
import com.tws.service.WorkService;

public class WorkResearchManagerServlet extends HttpServlet {
protected void doGet(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
HttpSession session=req.getSession();
Teacher teacher=(Teacher)session.getAttribute("teacher");
int teacherId=teacher.getId();
CourseService cs=new CourseService();
List<String>courseList=cs.researchCoursenameFromTeacherId(teacherId);
WorkService ws=new WorkService();
List<String> workTitleList=ws.getWorkTitleFromTeacherId(teacherId);
req.setAttribute("courseList",courseList);
req.setAttribute("workTitleList", workTitleList);
req.getRequestDispatcher("workresearchmanage.jsp").forward(req, resp);

}
}
