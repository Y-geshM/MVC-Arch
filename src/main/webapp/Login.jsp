<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>		
<head>
<meta charset="UTF-8">
<title>login using MVC</title>
</head>
<body bgcolor="pink">

	<form action="verifylogin" method="post" align="center">
	<pre>
	EMAIL <input type="text" name="email"/>
	
	PASSWORD <input type="password" name="password"/>
	
	<input type="submit" value="login"/>
	</pre>
	</form>
</body>
</html>