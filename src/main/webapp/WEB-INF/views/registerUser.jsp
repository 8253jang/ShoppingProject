<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>Register User</h1>

<form:form commandName="user" action="registerUser.shop" method="post">
	<table>
		<tr>
			<td>User Id</td>
			<td>
				<form:input path="userId" />
				<form:errors path="userId" />
			</td>
		</tr>
		<tr>
			<td>User Pwd</td>
			<td>
				<form:input path="userPwd" />
				<form:errors path="userPwd" />
			</td>
		</tr>
		<tr>
			<td>User Name</td>
			<td>
				<form:input path="userName" />
				<form:errors path="userName" />
			</td>
		</tr>
	
		<tr>
			<td colspan="2">
				<button type="submit">Submit</button>
			</td>
		</tr>
	</table>
</form:form>

</body>
</html>