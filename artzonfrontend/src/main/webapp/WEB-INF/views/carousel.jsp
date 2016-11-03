<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
<div class="container">
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0"></li>
      <li data-target="#myCarousel" data-slide-to="1" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
      <li data-target="#myCarousel" data-slide-to="3"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox">

      <div class="item active">
        <img src="dell.jpg" alt="books" width="460" height="345">
        <div class="carousel-caption">
          <h3>DELL</h3>
          
        </div>
      </div>

      <div class="item">
        <img src="lenova.jpg" alt="books" width="460" height="345">
        <div class="carousel-caption">
          <h3>LENOVA</h3>
         
        </div>
      </div>
    
      <div class="item">
        <img src="mac.jpg" alt="books" width="460" height="345">
        <div class="carousel-caption">
          <h3>MAC</h3>
          
        </div>
      </div>

      <div class="item">
        <img src="alienware.png" alt="books" width="460" height="345">
        <div class="carousel-caption">
          <h3>ALIENWARE</h3>
         
        </div>
      </div>
  
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div></body>
</html>