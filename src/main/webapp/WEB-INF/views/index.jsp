<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
<link href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/sandstone/bootstrap.min.css" rel="stylesheet" integrity="sha384-G3Fme2BM4boCE9tHx9zHvcxaQoAkksPQa/8oyn1Dzqv7gdcXChereUsXGx6LtbqA" crossorigin="anonymous">
</head>
<body>
<main class="container">
		<h1>Restaurants' Rating</h1>
		
		<table class="table">
			<thead>
			<tr>
				<th>Name</th><th>Rating</th><!-- <th>Upvote</th> -->
			</tr>
			</thead>
			<tbody>
			<c:forEach items="${restaurant}" var="restaurant">
				<tr>
					<td>${restaurant.name}</td>
					<td>${restaurant.rating}</td>
					<!-- <td><a href="/vote">upvote</a></td> -->
				</tr>
			</c:forEach>
			</tbody>
		</table>
		<a href="/rating">Order by rating</a>
		<br>
		<a href="/name">Order by name</a>
	</main>
</body>
</html>