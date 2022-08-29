<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calculator</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<link href="css/style.css" rel="stylesheet">
 <script src="js/validation.js"></script>
</head>
<body>
	<div class="container">
		<form action="calculator" method="post" name = "myForm" onkeyup="ValidationForm()">
			<div class="mb-3">
				<label for="txtNum1" class="form-label">Number 1</label>
				 <input type="text" name="txtNum1" placeholder="Please enter number 1">
				 <span id = "error1" class="text-danger"></span>
			</div>
			<div class="mb-3">
				<label for="txtNum2" class="form-label">Number 2</label> 
				<input type="text" name="txtNum2" placeholder="Please enter number 2">
				<span id = "error2" class="text-danger"></span>
			</div>
			<div class="mb-3">
				<input type="submit" id = "btn1" name = "btnCal" value="+" disabled>
				<input type="submit" id = "btn2" name = "btnCal" value="-" disabled>
				<input type="submit" id = "btn3" name = "btnCal" value="*" disabled>
				<input type="submit" id = "btn4" name = "btnCal" value="/" disabled>
			
			</div>
		</form>
	</div>

</body>
</html>