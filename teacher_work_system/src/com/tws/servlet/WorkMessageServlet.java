package com.tws.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tws.model.Teacher;
import com.tws.service.CourseService;

public class WorkMessageServlet extends HttpServlet {
	
protected void doGet(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
//��Ϊѡ���⣬ת��ѡ����ҳ�棬��Ϊ��������߼���⣬ת������ҳ�档
  //�����Ȳ������ˣ�ת����ͬ��ҳ����ȥ������˵�ɡ�
	HttpSession session=req.getSession();
	Teacher teacher=(Teacher)session.getAttribute("teacher");
	int teacherid=teacher.getId();
	String coursename=req.getParameter("coursename");
	String[] workstyle=req.getParameterValues("workstyle");
	String comestyle=req.getParameter("comestyle");
	req.setAttribute("workname", workstyle);
	CourseService cs=new CourseService();
	cs.putTeacherIdToCourse(teacherid, coursename);
	cs.putPointToCourse(comestyle, coursename);
	req.getRequestDispatcher("workmessagemanage.jsp").forward(req, resp);



}

}
