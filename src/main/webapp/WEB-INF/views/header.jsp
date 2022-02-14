<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<script src="https://use.fontawesome.com/releases/v5.2.0/js/all.js"></script>
<link href="https://fonts.googleapis.com/css2?family=Noto+Serif+KR&display=swap" rel="stylesheet"><meta charset="UTF-8">
<title>header</title>
<script type="text/javascript">
function search() {
	var search = document.getElementById("search").value;
	console.log("ddddd", search);
	
	var form = document.getElementById("search").value;
	
}
</script>
<style>
*{
	font-family: 'Noto Serif KR', serif;

}
.logo{
	text-align: left;
	margin-bottom: -20px;
}
.top_menu{
	text-align: center;
	border-bottom: 1px solid black;
	border-top: 1px solid black;
	margin-top: 10px;
	padding-top: 10px;
}
li{
	list-style: none;
	display: inline-block;
	margin: auto 10px;
}
a:hover{
	color: black;
	background-color: #D5D5D5;
}
.menuLink{
	width: 100px;
	display: block;
}
.menuLink:hover{
	color: black;
	background-color: #D5D5D5;
}
.login_logout{
	text-align: right;
}
.container {
	text-align: center;
	width: 1000px;
}

.list_image {
	border: 1pxsolidblack;
	width: 200px;
	height: 250px;
}

a {
	color: black;
	border-radius: 5px;
	font-size: 15px;
}
.detail-image {
	border: 1pxsolidblack;
	width: 200px;
	height: 250px;
}


</style>
</head>
<body>
<div class="logo">
	<a href="main">
		<img src="/img/logo1.png" style="" width="250px" height="100">
	</a>
</div>
<c:choose>
 <c:when test="${empty userName}">
	<div class="loginJoin">
		<a href="loginForm">Login </a>&nbsp;|&nbsp; 
		<a href="terms">Join</a>
	</div>
</c:when>
<c:otherwise>
	<div class="myPaygeLogout">
		<i class="fas fa-user" style="font-size: 15px;"></i>
		<a href="myPage">[${userName}님]</a>
		<a href="logout">Logout</a>
	</div>
</c:otherwise>	
</c:choose>

<nav class="top_menu">
	<ul>
		<li><a class="menuLink" href="movieList">영화</a></li>
		<li><a class="menuLink" href="movieRecommendList">추천영화</a></li>
		<li><a class="menuLink" href="#">공지사항</a></li>
		<li><a class="menuLink" href="#">고객센터</a></li>
		<li><i class="fas fa-search" style="font-size: 15px;"></i>&nbsp;
		<input type="text" name="mo_title" id="mo_title" style="width: 100px;" placeholder="통합 검색" 
			   required oninvalid="this.setCustomValidity('검색어를 입력해주세요.')"
			   oninput = "setCustomValidity('')"/>	
		<input type="hidden" name="bbs_title" id="bbs_title">		
		<input type="submit" class="submitBtn" value="검색" onclick="getInputValue();"></li>
	</ul>
</nav>
</body>
</html>