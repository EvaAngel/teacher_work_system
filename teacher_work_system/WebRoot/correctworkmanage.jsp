<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'correctworkmanage.jsp' starting page</title>
    
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
<form action="CorrectWorkTwoServlet" id="form1">
<h4>作业题目：</h4>
<%String worktitle=(String)request.getAttribute("worktitle"); 
String answer=(String) request.getAttribute("answer");
int studentId=(Integer)request.getAttribute("studentId");
int workId=(Integer)request.getAttribute("workId");
%>
<textarea rows="2" cols="100" name="worktitle"><%=worktitle %></textarea>
<h4>学生作答：</h4>
<textarea rows="10" cols="100" name="answer"><%=answer %></textarea>
<h4>批改意见：</h4>
<textarea rows="10" cols="100" name="suggestion"></textarea>
<h4>评定成绩（十分制）</h4>
<input type="text" name="workgrade" />
<input type="hidden" name="studentId" value="<%=studentId %>">
<input type="hidden" name="workId" value="<%=workId %>">
<br>
提交作业情况：<select name="istake"><option>是</option><option>否</option></select>
<br>
<br>
<input type="submit" value="提交">
</form>
</div>
</div>
<div id="footer"></div>
</div>
</body>
</html>
