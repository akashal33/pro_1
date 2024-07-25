<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Employee Registration</title>
</head>
<body>
	<h2>Employee Registration Form</h2>
	<form:form modelAttribute="emp" method="post" action="${pageContext.request.contextPath}/reg.htm" >
		<table>
			<tr>
				<td><label for="empName">Employee Name:</label></td>
				<td><form:input path="empName" id="empName" /></td>
			</tr>
			<tr>
				<td><label for="empDept">Employee Department:</label></td>
				<td><form:input path="empDept" id="empDept" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Register" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>