<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
           
             <%@ taglib prefix="form" 
           uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="category.do" method="POST" commandName="category">

<table>
<tr>
<td>category ID</td>
<td><form:input path="id"/></td>
</tr>

<tr>
<td>category Name</td>
<td><form:input path="name"/></td>
</tr>


<tr>
<td>Description</td>
<td><form:input path="description"/></td>
</tr>

<tr>
<td colspan="2">
<input type="submit" name="action" value="save" />
<input type="submit" name="action" value="delete" />
<input type="submit" name="action" value="update" />

</td>
</tr>
</table>

<br>
<table>
<th>ID
</th>
<th>NAME
</th>
<th>DESCRIPTION
</th>
<c:forEach items="${categoryList}" var="category">
<tr>
<td>${category.categoryid}</td>
<td></td>
<td></td>
</tr>
</c:forEach>


</table>

</form:form>

</body>
</html>