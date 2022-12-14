<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>wondumall</title>
 		<link href="https://fonts.googleapis.com/css?family=Montserrat:400,500,700" rel="stylesheet">

 		<!-- Bootstrap -->
 		<link type="text/css" rel="stylesheet" href="/wondumall/css/bootstrap.min.css"/>

 		<!-- Slick -->
 		<link type="text/css" rel="stylesheet" href="/wondumall/css/slick.css"/>
 		<link type="text/css" rel="stylesheet" href="/wondumall/css/slick-theme.css"/>

 		<!-- nouislider -->
 		<link type="text/css" rel="stylesheet" href="/wondumall/css/nouislider.min.css"/>

 		<!-- Font Awesome Icon -->
 		<link rel="stylesheet" href="/wondumall/css/font-awesome.min.css">

 		<!-- Custom stlylesheet -->
 		<link type="text/css" rel="stylesheet" href="/wondumall/css/style.css"/>
</head>
<body>
	<header>
		<c:import url="./businessheader.jsp"></c:import>
	</header>
	<nav id="navigation">
		<c:import url="./businessnav.jsp"></c:import>
	</nav>
	<section>
		<div id="section">
			<div id="container">
			
			</div>
		</div>
	</section>
	<footer id="footer">
		<c:import url="/footer.do"></c:import>
	</footer>
		<!-- jQuery Plugins -->
	<script src="/wondumall/js/jquery.min.js"></script>  
	<script src="/wondumall/js/bootstrap.min.js"></script>
	<script src="/wondumall/js/slick.min.js"></script>
	<script src="/wondumall/js/nouislider.min.js"></script>
	<script src="/wondumall/js/jquery.zoom.min.js"></script>
	<script src="/wondumall/js/main.js"></script>
	<script type="text/javascript" src="https://code.jquery.com/jquery-1.12.4.min.js" ></script>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
</body>
</html>