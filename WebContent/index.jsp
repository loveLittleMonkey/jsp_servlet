<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>测试jsp</title>
</head>
<body>
	测试jsp
	<form action="UserServlet" method="get">
		username:<input type="text" name="username">
		password:<input type="password" name = "password">
		<input type="submit" name ="submit" value="提交，查看控制台信息">
	</form>
	
	<br>
	${username}
	<br>
	${password}
	<br>
</body>
</html>