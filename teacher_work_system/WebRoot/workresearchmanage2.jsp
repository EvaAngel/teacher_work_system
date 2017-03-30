<%@ page language="java" import="java.util.*" import="com.tws.model.Student_PutWork" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'workresearchmanage2.jsp' starting page</title>
    
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
<table id="table2">
<tr>
<td>班级</td>
<td>学号</td>
<td>姓名</td>
<td>提交作业情况</td>
<td>作业提交时间</td>
<td>&nbsp;&nbsp;查看</td>
</tr>
<%
String worktitle=(String)request.getAttribute("worktitle");
int workId=(Integer)request.getAttribute("workId");
List<Student_PutWork> spwList=(List<Student_PutWork>)request.getAttribute("spwList"); 
for(Student_PutWork spw:spwList){
%>
<tr>
<td><%= spw.getClassname() %></td>
<td><%=spw.getXuehao() %></td>
<td><%=spw.getName()%></td>
<td><%=spw.getTakestate() %></td>
<td><%=spw.getTaketime() %></td>
<td><a href="CorrectWorkServlet?worktitle=<%=worktitle %>&workId=<%=workId%>&studentId=<%=spw.getId()%>">&nbsp;&nbsp;查看</a></td>
</tr>
<% }%>
</table>
</div>
</div>
<div id="footer"></div>
</div>
</body>
</html>
