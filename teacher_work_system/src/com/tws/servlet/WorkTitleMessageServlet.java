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

public class WorkTitleMessageServlet extends HttpServlet {
protected void doGet(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
System.out.println("��Ŀ����ҳ���½�ɹ�");
//��ȡ�˽�ʦ���ڿγ̺���������
HttpSession session=req.getSession();
Teacher teacher=(Teacher)session.getAttribute("teacher");
CourseService cs=new CourseService();
List<String> coursename=cs.researchCoursenameFromTeacherId(teacher.getId());
req.setAttribute("coursename", coursename);
req.getRequestDispatcher("work_title_manage2.jsp").forward(req, resp);

}
}
