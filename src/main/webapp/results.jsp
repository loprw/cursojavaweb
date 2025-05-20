

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="dto.CalculadoraDTO, java.util.List"%>
<!DOCTYPE html>
	<html>
		<head>
			<meta charset="UTF-8">
			<title>Tabla de operaciones realizadas</title>
		</head>
		<body>
			<table>
				<thead>
					<tr>
						<th>ID</th>
						<th>Numero 1</th>
						<th>Operacion</th>
						<th>Numero 2</th>
						<th>Resultado</th>
						<th>Fecha</th>
					</tr>
				</thead>
				<tbody>
					<%
					List<CalculadoraDTO> listado = (List<CalculadoraDTO>) request.getAttribute("dto");
					for (CalculadoraDTO dto: listado) {
						%>
						<tr>
							<td><%= dto.getId() %></td>
							<td><%= dto.getNum1() %></td>
							<td><%= dto.getOperation() %></td>
							<td><%= dto.getNum2() %></td>
							<td><%= dto.getResult() %></td>
							<td><%= dto.getDate() %></td>
						</tr>
						<%
					}
					%>
				</tbody>
			</table>
		</body>
	</html>