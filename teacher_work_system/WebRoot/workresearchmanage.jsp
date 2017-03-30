<%@page import="javax.sound.midi.SysexMessage"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'workresearchmanage.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="css/index1.css">

  </head>
<body id="editor">
<div id="wrapper">
<div id="header">
<div id="logo"></div>
<br />
<div id="option">&nbsp;</div>
</div>
<div id="content">
<div id="left">
<div id="lefttitle"></div>
<div id="leftcontent">
<ul>
<li><a href="teacher_to_work.jsp">作业基本信息管理</a></li>
<li><a href="WorkTitleMessageServlet">作业题目管理</a></li>
<li><a href="WorkResearchManagerServlet">作业查询功能</a></li>
<li><a href="">批改作业</a></li>
<li><a href="">重新提交</a></li>
<li><a href="">留言功能</a></li>
<li><a href="">成绩统计及导出</a></li>
</ul>
</div>
</div>
<div id="right">
<form action="WorkResearchManageTwoServlet">
<table id="table1">
<tr>
<td>课&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;程：
<select name="coursename">
<%
List<String> courseList=(List<String>)request.getAttribute("courseList");
List<String> workTitleList=(List<String>)request.getAttribute("workTitleList");
for(String s:courseList){
%>
<option value="<%=s %>"><%=s %></option>
<% }%>
</select>
</td>
<td>作业类型：
<select name="workstyle">
<option>选择题</option>
<option>填空题</option>
<option>辨析题</option>
<option>简答题</option>
</select>
</td>
</tr>
<tr>
<td>作业题目：
<select name="worktitle">
<%for(String s:workTitleList){ %>
<option><%=s %></option>
<% }%>
</select>
</td>
<td>班&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;级：
<select name="classname">
<option>高一1班</option>
<option>高一2班</option>
<option>高一3班</option>
<option>高一4班</option>
<option>高一5班</option>
<option>高一6班</option>
<option>高一7班</option>
<option>高一8班</option>
<option>高一9班</option>
<option>高一10班</option>
</select>
</td>
</tr>
<tr>
<td></td>
<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="查询"></td>
</tr>
</table>
</form>
</div>
</div>
<div id="footer"></div>
</div>
</body>
</html>
