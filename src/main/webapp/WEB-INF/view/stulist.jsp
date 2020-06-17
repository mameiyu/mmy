<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>学生信息列表</title>
<script type="text/javascript" src="/resource/jquery-3.2.1.js"></script>
<script type="text/javascript">
	function goPage(pageNum) {
		$("[name='pageNum']").val(pageNum);
		$("form").submit();
	}
	function add(id) {
		location="addJ?id="+id;
	}
	function mx(id) {
		location="selM?id="+id;
	}
</script>
</head>
<body>
<form action="sels" method="post">
	<input type="hidden" name="pageNum" >
	学生姓名:<input type="text" name="name" value="${name}">
	
	综合积分:<input type="text" name="s1" value="${s1}">---
			<input type="text" name="s2" value="${s2}">
		<button>查询</button>
</form>
	<table contenteditable="true" border="1px" >
		<tr>
			<td>学生编号</td>
			<td>学生姓名</td>
			<td>年龄</td>
			<td>综合积分</td>
			<td>操作 <a >新增学生</a></td>
		</tr>
		
		<c:forEach items="${info.list}" var="a">
		<tr>
			<td>${a.sid}</td>
			<td>${a.sname}</td>
			<td>${a.age}</td>
			<td>${a.comscore}</td>
			<td><a  onclick="add(${a.sid})"style="color: blue">添加违纪</a>|
			<a onclick="mx(${a.sid})"style="color: blue">违纪明细</a></td>
			</tr>
		</c:forEach>
		
	</table>
	<jsp:include page="/WEB-INF/view/pages.jsp"></jsp:include>
</body>
</html>