<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<jsp:useBean id="userinfo" class="com.model.Userinfo" scope="request"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	username:<jsp:getProperty property="username" name="userinfo"/><br>
	password:<jsp:getProperty property="pwd" name="userinfo"/><br>
	sex:<jsp:getProperty property="sex" name="userinfo"/><br>
	hobby:<jsp:getProperty property="hobby" name="userinfo"/><br>
</body>
</html>