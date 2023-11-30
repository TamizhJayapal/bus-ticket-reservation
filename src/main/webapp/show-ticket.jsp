<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Bus Ticket Reservation</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>

<body>
<%@ include file="app-header.jsp" %>
	<div class="jumbotron">
		<h1 class="display-4">Ticket Reservation</h1>
		<p class="lead">Your ticket is booked successfully</p>
		<p class="lead">
			<a class="btn btn-warning" href="<%= request.getContextPath() %>/" role="button">Close</a>
		</p>
	</div>
</body>
</html>