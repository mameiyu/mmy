<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>添加违纪</title>
</head>
<body>
<center>
	<form action="add" method="post">
	<input type="hidden" value="${stu.sid}" name="sid">
		姓名：${stu.sname}<br>
		<br>
	   综合积分：${stu.comscore}<br>
	   <br>
		违纪：<c:forEach items="${list}" var="a">
		 	<input type="checkbox" name="cid" value="${a.cid}">${a.ctype}
		</c:forEach>
		<button>提交</button>
	</form>
	<center>
</body>
</html>