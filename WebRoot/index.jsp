
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
String basePath_1 = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;

%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>

    <!-- <title>注册页</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

	<link rel="stylesheet" type="text/css" href="styles.css">

	<scipt type="text/javascript" src="/static/javascript/jquery-3.3.1/jquery-3.3.1.min.js"></scipt>

  </head>

  <body style="text-align: center;" > -->
  <!doctype html>
<html lang="zh">
<head>
    <base href="<%=basePath%>">
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>宇宙无敌数据管理公司</title>
<link rel="stylesheet" type="text/css" href="<%=basePath%>/style/css/styles.css">
</head>
<body>
<div class="htmleaf-container">
	<div class="wrapper">
		<div class="container">
			<h1>Welcome</h1>

			<form class="form" action = "regist/addUsers.do"  id = "form" method = "POST">
				<input type="text" placeholder="Username" id = "userName" name ="userName">
				<input type="password" placeholder="Password" id="password" name = "password">
				<button type="button" id="login-button" style="width:20%">登录</button><button style = "width:20%" type="submit" id="login-button">注册</button>
			</form>
		</div>

		<ul class="bg-bubbles">
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
		</ul>
	</div>
</div>
<div style="text-align:center;margin:50px 0; font:normal 14px/24px 'MicroSoft YaHei';color:#000000">
<h1>演示系统</h1>
</div>
</body>
</html>
<script src="<%=basePath%>/javascript/jquery-3.3.1/jquery-3.3.1.min.js" type="text/javascript"></script>
<!--  <script src="<%=basePath%>/javascript/js/jquery-2.1.1.min.js" type="text/javascript"></script>-->
<script type ="text/javascript">

	$('#login-button').click(function(event) {
		if ($("#userName").val() == "" || $("#userName").val() == null) {
			alert("请先输入用户名");
			return;
		}
		if ($("#password").val() == "" || $("#password").val() == null) {
			alert("密码不能为空");
			return;
		}
		$("#form").attr("action", "login/loginIn.do");
		$("#form").submit();
		$("#form").attr("action", "regist/addUsers.do");
	});
</script>
<!-- <script>
$('#login-button').click(function (event) {
	event.preventDefault();
	$('form').fadeOut(500);
	$('.wrapper').addClass('form-success');
});
</script>
 -->
   <!--  <form action="regist/addUsers.do" method="post">
    	<table>
    		<tr>
    			<th colspan="2" align="center">注册</th>
    		</tr>
    		<tr>
    			<td>用户名</td><td><input id="userName" name="userName" value="" onclick="aa()"/> </td>
    		</tr>
    		<tr>
    			<td>密码</td><td><input id="password" name="password" value=""/></td>
    		</tr>
    		<tr>
    			<td colspan="2" align="center"><button type="submit" value="确认注册">确认注册</button> </td>
    		</tr>
    	</table>
    </form> -->
