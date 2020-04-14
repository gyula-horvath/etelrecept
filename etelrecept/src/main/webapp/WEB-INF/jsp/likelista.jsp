<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<title>Összes felhasználó</title>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<h1 class="text-center">Összes felhasználó</h1>
				<table class="table table-bordered">
					<tr>
						<th>Név</th>
						<th>Kedvelt receptek</th>
					</tr>
					<c:forEach var="user" items="${osszesUser }">
						<tr>
							<td>${user.nev }</td>
							<td>
								<c:forEach var="recept" items="${user.likedReceptek }">
								${recept.nev }<br> 
								</c:forEach>
							</td>
						</tr>
					</c:forEach>
				</table>
			</div>
		</div>
	</div>
</body>
</html>