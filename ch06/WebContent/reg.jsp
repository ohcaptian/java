<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>	
	<%
		String strMess=(String)request.getAttribute("mess");
		
		if(strMess==null){
			strMess="";
		}
	%>
	<%=strMess %>
	<form action="regServlet">
		<table>
			<tr>
				<td>用户名：</td>
				<td><input type="text" name="username"></td>
			</tr>
			<tr>
				<td>密码：</td>
				<td><input type="password" name="pwd"></td>
			</tr>
			<tr>
				<td>确认密码：</td>
				<td><input type="password" name="pwd1"></td>
			</tr>
			<tr>
				<td>性别：</td>
				<td><input type="radio" name="sex" value="man">男
					<input type="radio" name="sex" value="woman">女
				</td>
			</tr>
			<tr>
				<td>兴趣爱好：</td>
				<td>
					<input type="checkbox" name="hobby" value="climb">爬山
					<input type="checkbox" name="hobby" value="sing">唱歌
				</td>
			</tr>
			<tr>
				<td><input type="submit" value="注册"></td>
				<td><input type="reset" value="重置"></td>
			</tr>
		</table>
	</form>
</body>
</html>