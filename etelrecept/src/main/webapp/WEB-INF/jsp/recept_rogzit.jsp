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
<title>Recept rögzítése</title>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<h1 class="text-center">Recept rögzítése</h1>
				<form action="recept_rogzit" method="post">
					<div class="form-group">
						<label for="nev">Név:</label>
						<input class="form-control" class="" type="text" name="nev"> 
					</div>
					<div class="form-group">
						<label for="nehezseg">Nehézségi fok:</label>
						<input class="form-control" type="text" name="nehezseg"> 
					</div>
					<div class="form-group">
						<label for="szam">Hozzávalók száma:</label>
						<input class="form-control" type="text" name="szam">
					</div>
					<button type="submit">Mentés</button>
				</form>
			</div>
		</div>
	</div>
</body>
</html>