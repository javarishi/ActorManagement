<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Actor Form</title>
</head>
<body>
	<div>
	<p> Form for Creating Actor </p>
	<form action="saveActor" method="post">
		<p> First Name: <input type="text" name="firstName"> </p>
		<p> Last Name: <input type="text" name="lastName"> </p>
		<p> <input type="submit" title="Submit"> </p>
	</form>
	</div>
	
	<div>
	<p> Search Actor With ID </p>
	<form action="getActorById" method="post">
		<p> ActorId: <input type="text" name="actorId"> </p>
		<p> <input type="submit" title="Submit"> </p>
	</form>
	</div>
	<div>
	<p> Search Actor With FirstName </p>
	<form action="getActorByFirstName" method="post">
		<p> First Name: <input type="text" name="firstName"> </p>
		<p> <input type="submit" title="Submit"> </p>
	</form>
	</div>

<div>
<p> Saved this Actor:: 	${actor} </p>
</div>
</body>
</html>