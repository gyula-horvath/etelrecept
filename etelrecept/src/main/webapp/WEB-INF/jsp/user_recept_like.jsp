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
<title>Receptek kedvelése</title>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-3"></div>
			<div class="col-md-6">
				<h1 class="text-center">Receptek kedvelése</h1>
				<form action="receptlike_rogzit" method="post">
					<div class="form-group">
						<select class="form-control" name="users_id">
							<c:forEach var="user" items="${osszesUser }">
								<option value="${user.id }">${user.nev }</option>
							</c:forEach>
						</select>
					</div>
					<br>
					<div class="form-group">
						<select class="form-control" name="receptek_id">
							<c:forEach var="recept" items="${osszesRecept }">
								<option value="${recept.id }">${recept.nev }</option>
							</c:forEach>
						</select>
					</div>
					<br>
					<button type="submit">LIKE</button>
				</form>
			</div>
		</div>
	</div>
</body>
</html>