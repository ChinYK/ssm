<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>员工注册页</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body style="text-align: center;" >
    <form action="/regist/addUsers.do" method="post">
    	<table>
    		<tr><th colspan="2" align="center">学生注册</th></tr>
    		<tr><td>用户名</td><td><input name="userName" value=""/> </td></tr>
    		<tr><td>密码</td><td><input name="password" value=""/></td></tr>
    		<tr><td colspan="2" align="center"><button type="submit" value="确认注册">确认注册</button> </td></tr>
    	</table>
    </form>
  </body>
</html>
