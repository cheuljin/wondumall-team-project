<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->

<title></title>

<!-- Google font -->
<link
	href="https://fonts.googleapis.com/css?family=Montserrat:400,500,700"
	rel="stylesheet">

<!-- Bootstrap -->
<link type="text/css" rel="stylesheet" href="./css/bootstrap.min.css" />

<!-- Slick -->
<link type="text/css" rel="stylesheet" href="./css/slick.css" />
<link type="text/css" rel="stylesheet" href="./css/slick-theme.css" />

<!-- nouislider -->
<link type="text/css" rel="stylesheet" href="./css/nouislider.min.css" />

<!-- Font Awesome Icon -->
<link rel="stylesheet" href="./css/font-awesome.min.css">

<!-- Custom stlylesheet -->
<link type="text/css" rel="stylesheet" href="./css/style.css" />

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
		  <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
		  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
		<![endif]-->
<script type="text/javascript">
	function linkPage(pageNo) {
		location.href = "./notice.do?pageNo=" + pageNo;
	}
</script>
</head>
<body>
	<!-- HEADER -->
	<header>
		<c:import url="./header.jsp"></c:import>
	</header>
	<!-- /HEADER -->

	<!-- NAVIGATION -->
	<nav id="navigation">
		<div class="container">
			<!-- responsive-nav -->
			<div id="responsive-nav">
				<!-- NAV -->
				<ul class="main-nav nav navbar-nav" id="nav">
					<li><a href="#">공지사항</a></li>
					<li><a href="#">자유게시판</a></li>
					<li><a href="#">질문게시판</a></li>
					<li><a href="#">Q&A</a></li>
					<li><a href="#">자주묻는질문</a></li>
					<li><a href="#">실시간문의</a></li>
				</ul>
				<!-- /NAV -->
			</div>
			<!-- /responsive-nav -->
		</div>
	</nav>
	<!-- /NAVIGATION -->
	<!-- SECTION -->
	<div class="section">
		<!-- container -->
		<div class="container">
			<table class="table">
				<tr>
					<th>번호</th>
					<th>제목</th>
					<th>글쓴이</th>
					<th>조회수</th>
					<th>좋아요</th>
					<th>작성일</th>
				</tr>
				<c:forEach var="n" items="${noticeList}">
					<tr>
						<td>${n.n_no }</td>
						<td>${n.n_title }</td>
						<td>${n.u_nickname }</td>
						<td>${n.n_count }</td>
						<td>${n.n_like }</td>
						<td>${n.n_date }</td>
					</tr>
				</c:forEach>
			</table>
			<div style="text-align: center;">
				<ui:pagination paginationInfo="${paginationInfo}" type="text" jsFunction="linkPage" />
			</div>
		</div>
		<!-- /container -->
	</div>
	<!-- /SECTION -->

	<!-- FOOTER -->
	<footer id="footer">
		<c:import url="./footer.jsp"></c:import>
	</footer>
	<!-- /FOOTER -->

	<!-- jQuery Plugins -->
	<script src="./js/jquery.min.js"></script>
	<script src="./js/bootstrap.min.js"></script>
	<script src="./js/slick.min.js"></script>
	<script src="./js/nouislider.min.js"></script>
	<script src="./js/jquery.zoom.min.js"></script>
	<script src="./js/main.js"></script>

</body>
</html>