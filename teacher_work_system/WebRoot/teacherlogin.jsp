<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'teacherlogin.jsp' starting page</title>
    
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
    <legend>教师登陆</legend>
  <form action="TeacherLoginServlet">
  <table cellpadding="8px">
  <tr>
  <td>用户名：</td>
  <td><input type="text" name="username"></td>
  </tr>
  <tr>
  <td>密&nbsp;码：</td>
  <td><input type="password" name="password"></td>
  </tr>
  <tr>
  <td><input type="submit" value="登录"></td>
  <td><input type="button" value="注册"></td>
  </tr>
  </table>
  </form>
  </fieldset>
  <br><br>
  <h6>Copyright 山东建筑大学   版权所有，请勿抄袭</h6>
</body>
</html>
