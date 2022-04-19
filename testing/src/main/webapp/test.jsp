<%@page import="javax.security.auth.message.callback.PrivateKeyCallback.Request"%>
<%@page import="org.apache.coyote.RequestGroupInfo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	String str1 = request.getParameter("n1");
	String str2 = request.getParameter("n2");
	out.print(str1+" "+str2);
%>
</body>
</html>