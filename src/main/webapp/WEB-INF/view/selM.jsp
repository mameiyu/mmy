<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>学生违纪明细</title>
<script type="text/javascript" src="/resource/jquery-3.2.1.js"></script>
<script type="text/javascript">
	function del(sid,cid) {
		location="del?sid="+sid+"&cid="+cid;
	}
</script>
</head>
<body>
<center>
${list2.sname}的违纪情况:共违纪${list2.count},共扣分${list2.sum},现剩余综合积分${list2.comscore}

	<table contenteditable="true" border="1px" >
		<tr>
			<td>学生编号</td>
			<td>学生姓名</td>
			<td>违纪编号</td>
			<td>违纪类型</td>
			<td>违纪分数</td>
			<td>操作</td>
		</tr>
		
	
		<c:forEach items="${list1}" var="a">
		<tr>
			<td>${a.sid}</td>
			<td>${a.sname}</td>
			<td>${a.cid}</td>
			<td>${a.ctype}</td>
			<td>${a.score}</td>
			<td><a onclick="del(${a.sid},${a.cid})"style="color: blue">撤销违纪</a></td>
			</tr>
		</c:forEach>
		
		
	</table>
	
<center>
</body>
</html>