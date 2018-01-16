<%@ page language="java" import="java.util.*" import="com.tws.model.Teacher" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'teacher_to_work.jsp' starting page</title>
    
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
    <form action="WorkMessageServlet">
   <table width="700px">
    <tr height="50px">
    <td width="200px" align="center">修改个人信息</td>
    <td align="center">录入所授课程:&nbsp;
    <select name="coursename">
    <option selected>&nbsp;&nbsp;&nbsp;请选择课程</option>
    <option value="语文">语文</option>
    <option value="数学">数学</option>
    <option value="英语">英语</option>
    <option value="物理">物理</option>
    <option value="化学">化学</option>
    <option value="生物">生物</option>
    <option value="音乐">音乐</option>
    <option value="美术">美术</option>
    <option value="信息技术">信息技术</option>
    </select>
    </td>
    </tr>
    <tr height="50px">
    <td align="center"><a href="teacher_to_work.jsp">作业基本信息管理</a></td>
    <td align="center">录入作业类型:&nbsp;
    </td>
    </tr>
    <tr height="50px">
    <td align="center"><a href="WorkTitleMessageServlet">作业题目管理</a></td>
    <td align="center">
    <label><input name="workstyle" value="选择题" type="checkbox"/>选择题</label>
    <label><input name="workstyle" value="填空题" type="checkbox"/>填空题</label>
    <label><input name="workstyle" value="简答题" type="checkbox"/>简答题</label>
    <label><input name="workstyle" value="辨析题" type="checkbox"/>辨析题</label>   
    </td>
    </tr>
    <tr height="50px">
    <td align="center"><a href="WorkResearchManagerServlet">作业查询功能</a></td>
    <td align="center">
               录入成绩评分方式:&nbsp;
    <select name="comestyle">
    <option selected>&nbsp;&nbsp;&nbsp;请选择课程评价方式</option>
    <option value="百分制">百分制</option>
    <option value="等级制">等级制</option>
    </select>
    </td>
    </tr>
    <tr height="50px">
    <td align="center">批改作业</td>
    <td align="center"></td>
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
    <input type="submit" value="保存">
    </td>
    </tr>
    </table>    
    </form>
    </fieldset>
    <br><br>
  <h6>Copyright 山东建筑大学   版权所有，请勿抄袭</h6>
    
    
    
    
  </body>
</html>
