<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<nav class="navbar navbar-default">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand">Customer Details</a>
			</div>
			<ul class="nav navbar-nav">

				<li><a href="save">Save Customer</a></li>
				<li><a href="update">Update Customer</a></li>
				<li><a href="delete">Delete Customer</a></li>
				<li><a href="search">Search Customer</a></li>
			</ul>
		</div>
	</nav>

<h1>Data Saved Successfully...</h1>
	<table border="1">
		<tr>
			<th>Customer id</th>
			<th>Customer Name</th>
			<th>Customer Type</th>
			<th>Street</th>
			<th>City</th>
			<th>Phone No</th>
			<th>Country</th>
			<th>State</th>
		
		</tr>
		<tr>

			<td>${customer.cid }</td>
			<td>${customer.name }</td>
			<td>${customer.type }</td>
			<td>${customer.street }</td>
			<td>${customer.city }</td>
			<td>${customer.phone }</td>
			<td>${customer.country }</td>
			<td>${customer.state }</td>
			
		</tr>
	</table>
	<a href="update">Update More</a>
</body>
</html>