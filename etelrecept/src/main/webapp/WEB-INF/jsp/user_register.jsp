<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<h3>Felhasználó regisztrálása</h3>
				<form action="registration" method="post">
					<div class="form-group">
						<label for="username">Felhasználónév:</label> <input type="text"
							class="form-control" name="nev" required>
					</div>
					<div class="form-group">
						<label for="password">Jelszó:</label> <input type="text"
							class="form-control" name="password" required>
					</div>
					<div class="form-group">
						<label for="password2">Jelszó ismét:</label> <input type="text"
							class="form-control" name="password2" required>
					</div>
					<button type="submit">Registrálás</button>
				</form>
				<p class="alert-warning">${message }</p>
			</div>
		</div>
	</div>
</body>
</html>