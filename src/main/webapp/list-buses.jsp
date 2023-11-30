<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Bus Reservation</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
</head>
<body>
<%@ include file="app-header.jsp" %>
<div class="container col-md-8" style="margin-top: 5%;">
        <table class="table table-dark">
            <thead>
                <tr>
                    <th>Bus No</th>
                    <th>Type</th>
                    <th>Route</th>
                    <th>Start Place</th>
                    <th>End Place</th>
                    <th>Start Time</th>
                    <th>End  Time</th>
                    <th>Action</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="bus" items="${buses}">
                    <tr>
                        <td><c:out value="${bus.busNo}" /></td>
                        <td><c:out value="${bus.busType}" /></td>
                        <td><c:out value="${bus.busRoute}" /></td>
                        <td><c:out value="${bus.startPlace}" /></td>
                        <td><c:out value="${bus.endPlace}" /></td>
                        <td><c:out value="${bus.serviceStartTime}" /></td>
                        <td>TBD</td>
                        <td><a href="pass-info?bus_no=${bus.busNo}"><button class="btn btn-warning">Book</button></a></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>

    </div>
</body>
</html>