<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<h2>Shoppingcart</h2>
Existing user <a href="login"> login</a>
New user <a href="register">register</a>

<hr>
<c:if test="${userClickedlogin}">
<jsp:include page="login.jsp"></jsp:include>
</c:if>

<c:if test="${userClickedregister}">
<jsp:include page="register.jsp"></jsp:include>
</c:if>

<c:out value="${Success}"></c:out>
<c:out value="${Error}"></c:out>
</body>
</html>
