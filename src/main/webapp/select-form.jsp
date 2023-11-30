<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@  taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        <div class="container col-md-5" style="margin-top: 5%;">
            <div class="card">
                <div class="card-body">
                    <h3 class="card-title">
                        Book Ticket
                    </h3>

                    <form action="buses" method="post">
                        <fieldset class="form-group">
                            <input type="text" name="start-place" class="form-control" placeholder="Start Place">
                        </fieldset>

                        <fieldset class="form-group">
                            <input type="text" name="end-place" class="form-control" placeholder="End Place">
                        </fieldset>

                        <fieldset class="form-group">
                            <input type="date" name="journey-date" class="form-control" placeholder="Journey Place">
                        </fieldset>

                        <button type="submit" class="btn btn-warning">Submit</button>
                    </form>
                </div>
            </div>
        </div>
</body>
</html>