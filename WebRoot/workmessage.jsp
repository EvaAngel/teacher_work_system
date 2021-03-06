<%@ page language="java" import="java.util.*" import="com.tws.model.Teacher" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'workmessage.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="css/index.css">
  </head>
  
  <body>
   <h1>通用作业提交系统</h1>
   <hr/>
   <br>
    <fieldset style="width:500">
    <%Teacher teacher=(Teacher)session.getAttribute("teacher"); %>
    <legend><%=teacher.getName()%>，欢迎您</legend>
    <form action="WorkToWorkSqlServlet">
     <table width="700px">
    <tr height="50px">
    <td width="200px" align="center">修改个人信息</td>
    <td align="center">请输入<%=request.getParameter("workname") %>的题目</td>
    </tr>
    <tr height="50px">
    <td align="center"><a href="teacher_to_work.jsp">作业基本信息管理</a></td>
    <td align="center"><textarea cols="50" rows="2" name="workname"></textarea></td>
    </tr>
    <tr height="50px">
    <td align="center"><a href="WorkTitleMessageServlet">作业题目管理</a></td>
    <td></td>
    </tr>
    <tr height="50px">
    <td align="center"><a href="WorkResearchManagerServlet">作业查询功能</a></td>
    <td align="center">请输入作业要求：</td>
    </tr>
    <tr height="50px">
    <td align="center">批改作业</td>
    <td align="center"><textarea cols="50" rows="2" name="workrequire"></textarea></td>
    </tr>
    <tr height="50px">
    <td align="center">重新提交</td>
    <td align="center"></td>
    </tr>
    <tr height="50px">
    <td align="center">留言功能</td>
    <td align="center"></td>
    </tr>
    <tr height="50px">
    <td align="center">成绩统计及导出</td>
    <td align="center">
    <input type="submit" value="提交">
    </td>
    </tr>
    </table>
    
    </form>
    </fieldset>
  </body>
</html>
