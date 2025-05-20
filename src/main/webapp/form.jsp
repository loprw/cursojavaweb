<%@page import="enums.OperationsEnum"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Formulario calculadora</title>
	</head>
	<body>
	
		<form action="/CursoJavaWeb/calculadora" method="GET">
			<input type="number" name="numero1" placeholder="Escribe un nÃºmero" autofocus>
			<input type="number" name="numero2" placeholder="Escribe un nÃºmero">
			<select name="opcion">
				<option value="sum">Sumar</option>
				<option value="subtract">Restar</option>
				<option value="multiply">Multiplicar</option>
				<option value="divide">Dividir</option>
			</select>
			<br><br>
<%
	if (request.getAttribute("operation") != null) {
		OperationsEnum ops = (OperationsEnum) request.getAttribute("operation");
		
		%>
		<p>El resultado de la <%= ops.getNombre() %> es <%= request.getParameter("result") %></p>
		<br>

		<%
	}
%>
			<button type="submit">Calcular</button>
			<br><br>
			<!-- <input type="number" name="resultado" readonly> -->
		</form>
		
		<a href="calculadora">Ver todos los resultados.</a>

	</body>
</html>