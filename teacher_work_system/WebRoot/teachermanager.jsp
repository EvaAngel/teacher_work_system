<%@ page language="java" import="java.util.*" import="com.tws.model.Teacher" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'teachermanager.jsp' starting page</title>
    
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
    <legend><%=teacher.getName() %>，欢迎您</legend>
    <form>
    <table width="450px" >
     <tr height="50px">
    <td>修改个人信息</td>
    <td>用户名：<%=teacher.getUsername() %></td>
    </tr>
    <tr height="50px">
    <td><a href="teacher_to_work.jsp">作业基本信息管理</a></td>
    <td>密码：<%=teacher.getPassword() %></td>
    </tr>
    <tr height="50px">
    <td><a href="WorkTitleMessageServlet">作业题目管理</a></td>
    <td>年龄：<%=teacher.getAge() %></td>
    </tr>
    <tr height="50px">
    <td><a href="WorkResearchManagerServlet">作业查询功能</a></td>
    <td>性别：<%=teacher.getSex() %></td>
    </tr>
    <tr height="50px">
    <td><a href="CorrectWorkServlet">批改作业</a></td>
    <td>家庭住址：<%=teacher.getAddress() %></td>
    </tr>
    <tr height="50px">
    <td>重新提交</td>
    <td>电子邮件：<%=teacher.getEmail() %></td>
    </tr>
    <tr height="50px">
    <td>留言功能</td>
    <td>电话号码：<%=teacher.getTele() %></td>
    </tr>
    <tr height="50px">
    <td>成绩统计及导出</td>
    <td>版权</td>
    </tr>
    </table>    
    </form>
    </fieldset>
    <br><br>
  <h6>Copyright 山东建筑大学   版权所有，请勿抄袭</h6>
  </body>
</html>
