<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SignUp</title>
</head>
<body>
	ment : ${ment}
	<c:if test="${!empty ment}">
		<script type="text/javascript">
			alert("${ment}");
		</script>
	</c:if>
	<form action="" method="post">
		<table border="1">
			<tr>
				<th>ID</th>
				<td><input type="text" name="id"></td>
			</tr>
			<tr>
				<th>이름</th>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<th>PW</th>
				<td><input type="password" name="pw"></td>
			</tr>
			<tr>
				<th>PW 확인</th>
				<td><input type="password" name="pwchk"></td>
			</tr>
			<tr>
				<th>Email</th>
				<td><input type="email" name="email"></td>
			</tr>
		</table>
		<input type="submit" value="가입">
	</form>
</body>
</html>