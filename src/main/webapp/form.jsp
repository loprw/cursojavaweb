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
				<option value="suma">Sumar</option>
				<option value="resta">Restar</option>
				<option value="multiplicacion">Multiplicar</option>
				<option value="division">Dividir</option>
			</select>
			<br><br>
			<%
	
	if (request.getParameter("resultado") != null && request.getParameter("op") != null) {
		String operation = request.getParameter("op");
		String result = request.getParameter("resultado");
		
			%>
	
			<h3>El resultado de la <%= operation %> es <%= result %>.</h3>	
		
	<%
	}
	%>
			<button type="submit">Calcular</button>
			<br><br>
			<!-- <input type="number" name="resultado" readonly> -->
		</form>

	</body>
</html>