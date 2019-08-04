<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>home</title>
<link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
	<div class="center">
		<span class="red"><p><c:out value="${error}" /></p></span>
		<h1>What is the Code?</h1>
		<form method="POST" action="/verify">
			 <input class="bigger" type="text" name="code"><br><br>
			 <button type="submit">Save</button>
		</form>
	</div>
</body>
</html>