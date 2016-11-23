<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container" id="main">

	<div class="navbar navbar-fixed-top">
		<div class="container">
			<button class="navbar-toggle" data-target=".navbar-responsive-collapse" data-toggle="collapse" type="button">
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
			</button>
		<a class="navbar-brand" href="/"><img src="" alt="Your Logo"></a>
		<div class="nav-collapse collapse navbar-responsive-collapse">
		<ul class ="nav navbar-nav">
			<li class="active">
			<a href="#">Home</a>
			</li>
			<li class="dropdown">
			<a href="#" class="dropdown-toggle" data-toggle="dropdown">Service<storng class="caret"></storng></a>
			<ul class="dropdown-menu">
			<li> 
			<a href="#">Web Design</a>
			</li>
			<li>
			<a href="#">Web Development</a>
			</li>
			<li>
			<a href="#">SEO</a>
			</li>
			<li class="divider"></li>
			<li class="dropdown-header">More Service</li>
			<li>
			<a href="#">Content Creation</a>
			</li>
			<li>
			<a href="#">Social Media Marketing</a>
			</li>
 			</ul>
			</li>   
		</ul>
		<form class="navbar-form pull-left">
			<input type="text" class="form-control" placeholder="Search this site....." id="searchinput">
			<button type="submit" class="btn btn-default"><span class="glyphicon glyphicon-search"></span></button>
		</form>
		<ul class="nav navbar-nav pull-right">
			<li class="dropdown">
			<a href="#" class="dropdown-toggle" data-toggle="dropdown"><span class="glyphicon glyphicon-user"></span>My Account<storng class="caret"></storng></a>
			<ul class="dropdown-menu">
			<li>
			<a href="#"><span class="glyphicon glyphicon-wrench"></span>Settings</a>
			</li>

			<li>
			<a href="#"><span class="glyphicon glyphicon-refresh"></span>Update Profile</a>
			</li>

			<li>
			<a href="#"><span class="glyphicon glyphicon-briefcase"></span>Billing</a>
			</li>
			<li class="divider"></li>
			<li>
			<a href="#"><span class="glyphicon glyphicon-off"></span>Sign Out</a>
			</li>
			</ul>
			</li>
		</ul>

		</div>
	</div>
</div>
</div>

</body>
</html>