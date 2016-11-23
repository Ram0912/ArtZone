<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<body>
<jsp:include page="header.jsp"></jsp:include>
<jsp:include page="carousel.jsp"></jsp:include>
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

<c:if test="${userClickedaddtocart}">
<jsp:include page="add to cart.jsp"></jsp:include>
</c:if>

</body>
</html>
