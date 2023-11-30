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
	<%@ include file="app-header.jsp"%>
	<div class="container col-md-8" style="margin-top: 5%">


		<div class="row">
			<div class="col-md-6">
				<table class="table table-dark">
					<tbody>
						<tr>
							<th scope="row">Bus No:</th>
							<td>${bus.busNo}</td>
						</tr>
						<tr>
							<th scope="row">Start Place:</th>
							<td>${bus.startPlace}</td>
						</tr>
						<tr>
							<th scope="row">End Place:</th>
							<td>${bus.endPlace}</td>
						</tr>
						<tr>
							<th scope="row">Bus Route:</th>
							<td>${bus.busRoute}</td>
						</tr>
						
						<tr>
							<th scope="row">Bus Type:</th>
							<td>${bus.busType}</td>
						</tr>
						<tr>
							<th scope="row">Start Time:</th>
							<td>${bus.serviceStartTime}</td>
						</tr>
					</tbody>
				</table>
			</div>
			<div class="col-md-6">
				<div class="card">
					<div class="card-body">
						<h3 class="card-title">Book Ticket</h3>

						<form action="book" method="post">
							<input type="hidden" name="bus-no" value="${bus.busNo}" placeholder="Bus Number">
							<fieldset class="form-group">
								<input type="text" name="passenger-name" class="form-control"
									placeholder="Passenger Name">
							</fieldset>

							<fieldset class="form-group">
								<input type="text" name="passenger-age" class="form-control"
									placeholder="Passenger Age">
							</fieldset>

							<fieldset class="form-group">
								<input type="text" name="passenger-gender" class="form-control"
									placeholder="Passenger Gender">
							</fieldset>

							<button type="submit" class="btn btn-warning">Submit</button>
						</form>
					</div>
				</div>
			</div>
		</div>


	</div>
</body>
</html>