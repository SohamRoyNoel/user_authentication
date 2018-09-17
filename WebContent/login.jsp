<%@page import="java.io.PrintWriter"%>
<%@page import="master.DAO.userA_DAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
		String mpr = "";
		String msr = "";
%>

<%
		mpr = request.getParameter("status");
		if (mpr==null){
			mpr = "";
		}
		
		msr = request.getParameter("status1");
		if(msr==null){
			msr = "";
		}
		
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%=msr %>
<center>
<form action="login_servlet" method="post">
<table>
<tr>
<td>Phone no:</td>
<td><input type="text" name="ph"></td>
<td><%=mpr %></td>
</tr>
<tr>
<td>Password:</td>
<td><input type="password" name="ps">
<td><%=mpr %></td>
</tr>
<tr>
<td><input type="submit" value = "login">
</tr>
</table>
</form>
</center>
</body>
</html>