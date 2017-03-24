<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color:plum">
<form action="controller" method="post">
<center>
<table>
<tr><td>id</td><td><input type="text" name="id" id="id"></td></tr>
<tr><td>name</td><td><input type="text" name="name" id="name"></td></tr>
<tr><td>email</td><td><input type="text" name="email" id="email"></td></tr>
<tr><td>technology</td><td><input type="text" name="technology" id="technology"></td></tr>
<tr><td><input type="hidden" name="source" value="add"><input type="submit" name="submit"></td></tr>
</table>
</center>
</form>


</body>
</html>