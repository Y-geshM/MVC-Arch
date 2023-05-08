<%@ include file="/WEB-INF/view/Menu.jsp" %>
<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List Of Reg</title>
</head>
<body bgcolor="pink">
	<table  align="center">
	<tr>
	<th>Name</th>
	<th>City</th>
	<th>Email</th>
	<th>Mobile</th>
	<th>Delete</th>
	<th>Update</th>
	</tr>
	
	<%
	ResultSet List = (ResultSet)request.getAttribute("AReg");
	while(List.next()){
	%>
	<tr>
		<td><%= List.getString(1) %></td>
		<td><%= List.getString(2) %></td>
		<td><%= List.getString(3) %></td>
		<td><%= List.getString(4) %></td>
		<td><a href="delete?email=<%=List.getString(3)%>">Delete</a></td>
		<td><a href="update?email=<%=List.getString(3)%>&mobile=<%=List.getString(4)%>&city=<%=List.getString(2)%>&name=<%=List.getString(1)%>">Update</a></td>
	</tr>
	<% } %>
</table>
</body>
</html>