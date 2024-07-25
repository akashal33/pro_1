<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
    <title>Employees</title>
</head>
<body>
    <h1>List of Employees</h1>
    <table border="1">
        <thead>
            <tr>
                <th>Employee ID</th>
                <th>Name</th>
                <th>Department</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="emp" items="${employees}">
                <tr>
                    <td><c:out value="${emp.empId}" /></td>
                    <td><c:out value="${emp.empName}" /></td>
                    <td><c:out value="${emp.empDept}" /></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>