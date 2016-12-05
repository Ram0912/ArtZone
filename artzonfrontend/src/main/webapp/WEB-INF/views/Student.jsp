<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Management</title>
</head>
<body>
<h1>Students Data</h1>
<form:form action="" method="post" commandName="student">
<table>
<tr>
<td>StudentId</td>
<td><input path="studentId" /></td>
</tr>

<tr>
<td>FirstName</td>
<td><input path="firstname" /></td>
</tr>

<tr>
<td>LastName</td>
<td><input path="lastname" /></td>
</tr>

<tr>
<td>Year Level</td>
<td><input path="yearlevel" /></td>
</tr>


<tr>
<td colspan="2">
<input type="submit" name="action" value="Add" />
<input type="submit" name="action" value="Edit" />
<input type="submit" name="action" value="Delete" />
<input type="submit" name="action" value="Search" />
</td>
</tr>
</table>
</form:form>
<br>
<table boarder="1">
<th>ID</th>
<th>First Name</th>
<th>Last Name</th>
<th>Year Level</th>
<c:forEach items="${studentList}" var="student"> 
<tr>
<td>${student.studentId}</td>
<td>${student.firstname}</td>
<td>${student.lastname}</td>
<td>${student.yearlevel}</td>
</tr>
</c:forEach>
</table>
</body>
</html>