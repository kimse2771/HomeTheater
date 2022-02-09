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
	<a href="#">
		<img src="/img/logo1.png" style="" width="250px" height="100">
	</a>
</div>
<div class="login_logout">
<!--  	<i class="far fa-smile" style="font-size: 16px;"></i>&nbsp;	-->
		<a href="#">Login </a>&nbsp;|&nbsp; 
		<a href="#">Join</a>
	</div>	

<nav class="top_menu">
	<ul>
		<li><a class="menuLink" href="movieList">영화</a></li>
		<li><a class="menuLink" href="#">추천영화</a></li>
		<li><a class="menuLink" href="#">공지사항</a></li>
		<li><a class="menuLink" href="#">고객센터</a></li>
		<li><i class="fas fa-search" style="font-size: 15px;" onclick="search()"></i>&nbsp;
		<input id="search" type="search" style="width: 100px;" placeholder="검색" ></li>
	</ul>
</nav>
</body>
</html>