<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<jsp:include page="header.jsp"></jsp:include>
<hr>

${Success}
${Error}
${register}
<c:if test="${not empty Error }">
<jsp:include page="login.jsp"></jsp:include>
</c:if>

<c:if test="${userClickedlogin}">
<jsp:include page="login.jsp"></jsp:include>
</c:if>

<c:if test="${userClickedregister}">
<jsp:include page="register.jsp"></jsp:include>
</c:if>


</body>
</html>
