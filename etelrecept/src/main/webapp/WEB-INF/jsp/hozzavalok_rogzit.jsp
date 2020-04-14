<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="hu">
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<title>Hozzavalok felvitele</title>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<h1 class="text-center">A ${recept.nev} recept hozzavaloi</h1>
					<form action="hozzavalok_rogzit" method="post">
					<input type="hidden" name="id" value="${recept.id }">
					<table class="table">
						<c:forEach var="i" begin="1" end="${counter }">
						<tr>
							<td>Nev: <input type="text" name="nev"></td>
							<td>Mennyiseg: <input type="text" name="mennyiseg"></td>
							<td>Mertekegyseg: <input type="text" name="mertekegyseg"></td>
						</tr>	
					</c:forEach>
					</table>
					<button type="submit">Mentes</button>
					</form>
				
			</div>
		</div>
	</div>
</body>
</html>