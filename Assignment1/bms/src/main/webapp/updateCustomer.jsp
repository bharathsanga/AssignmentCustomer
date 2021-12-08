<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>		
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script>
function populate(s1,s2){
	var s1 = document.getElementById(s1);
	var s2 = document.getElementById(s2);
	s2.innerHTML = "";
	
		
	if(s1.value == "India"){
		
		var optionArray =[
			<c:forEach items="${indiaList}" var="state" varStatus="status">  
		    '${ state. name}'
		    <c:if test="${!status.last}">    
		      ,    
		    </c:if>  
		    </c:forEach>  
		];
	} 
	else if(s1.value == "Australia"){
		var optionArray =[
			<c:forEach items="${australiaList}" var="state" varStatus="status">  
		    '${ state. name}'
		    <c:if test="${!status.last}">    
		      ,    
		    </c:if>  
		    </c:forEach>  
		];
		
	}
	
	for(var option in optionArray){
		var pair = optionArray[option];
		var newOption = document.createElement("option");
		newOption.value = pair;
		newOption.innerHTML = pair;
		s2.options.add(newOption);
	}
}
</script>
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

	<form action="update" method="post">
	<div>
	<label>Customer Id   </label>
	<input type="text" name="cid">
	</div><br>
		<div>
			<label>Customer Name </label> 
			<input type="text" name="name">
		</div><br>

		<div>
			<label for="type">Customer Type </label> <select name="type" id="type">
				<option value="business">Business</option>
				<option value="startup">Startup</option>
				<option value="employee">Employee</option>
				<option value="marketing">Marketing</option>
			</select>
		</div><br>
		<h3>Customer Address :</h3>
		<div>
			<label>Street        </label> <input type="text" name="street">
		</div><br>

		<div>
			<label>City          </label> <input type="text" name="city">
		</div><br>

		<div>
			<label for="country">Country       </label><select id="country" name="country" class="company"
						onchange="populate(this.id,'state')">
						<option>Select</option>
						
						<c:forEach var="listValue" items="${countryList}">

							<option>${listValue.name}</option>
							
							<br>
						</c:forEach>


					</select>
		</div><br>

		<div>
			<label for="state">State         </label><select id="state" name="state" >
						
						

					</select>
		</div><br>

		<div>
			<label>Phone no      </label> <input type="number" name="phone">
		</div>
		<div>
			<label>Updated By    </label> <input type="text" name="updatedby">
		</div><br>
		<div>
			<button type="submit">Update Customer</button>
		</div><br>

	</form>
</body>
</html>