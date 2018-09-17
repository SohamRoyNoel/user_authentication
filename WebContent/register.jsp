<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
<form action="register_servlet" method="post">
<table>
<tr>
<td>Name:</td>
<td><input type="text" name="nm">
</tr>
<tr>
<td>Password:</td>
<td><input type="password" name="ps">
</tr>
<tr>
<td>Confirm password:</td>
<td><input type="password" name="con">
</tr>
<tr>
<td>Phone no:</td>
<td><input type="text" name="ph">
</tr>
<tr>
<td><input type="submit" value = "Register">
</tr>
</table>
</form>
</center>
</body>
</html>