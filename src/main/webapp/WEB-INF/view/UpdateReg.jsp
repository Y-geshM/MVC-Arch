<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Reg</title>
</head>
<body bgcolor="pink">
	<form action="update" method="post">
	<pre>
	NAME <input type="text" name="name" value="<%=request.getAttribute("name")%>"/>
	
	CITY <input type="text" name="city" value="<%=request.getAttribute("city")%>"/>
	
	EMAIL <input type="text" name="email" value="<%=request.getAttribute("email")%>"/>
	
	MOBILE <input type="text" name="mobile" value="<%=request.getAttribute("mobile")%>"/>
	
	<input type="submit" value="update"/>
	</pre>
	</form>
</body>
</html>