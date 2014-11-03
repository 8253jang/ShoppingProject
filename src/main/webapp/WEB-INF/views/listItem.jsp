<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<table border="1" align="center">
		<tr>
			<td>상품아이디</td>
			<td>상품명</td>
			<td>가격</td>
		</tr>
	<c:forEach var="item" items="${ listItem }">
		<tr>
			<td>${ item.itemId }</td>
			<td><a href="detailItem.shop?itemId=${ item.itemId }">${ item.itemName }</a></td>
			<td>${ item.price }</td>
		</tr>
	</c:forEach>
	</table>
</body>
</html>