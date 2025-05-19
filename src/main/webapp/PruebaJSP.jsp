<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Prueba JSP</title>
</head>
<body>

<h1>Prueba JSP</h1>

<%
	int reps = Integer.parseInt(request.getParameter("repeticiones"));
%>
<% for (int i = 0; i < reps; i++) { %>
<h3>Texto de prueba</h3>
<% } %>
	
</body>
</html>