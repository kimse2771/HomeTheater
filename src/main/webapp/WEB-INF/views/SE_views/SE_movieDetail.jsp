<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상세정보</title>
</head>
<style>
.box-image {
	float: left;
}

.wrap-movie-detail {
	height: 400px;
}

#recommendationUnLike{
background-color: white;
}


</style>
<body>
	<div class="container">

		<%@ include file="../header.jsp"%>
		<h1>______</h1>
		<h2 class="main_title">영화 상세</h2>
		<br>
		<div class="wrap-movie-detail">
			<div class="box-image">
				<img class="detail-image" src="/${movie.mo_filename }" alt="">
			</div>
			<div class="box-content">
				<div class="title">
					<strong>${movie.mo_title }</strong>
					<hr>
				</div>
				<div class="ect_detail">추천 수: ${movie.mo_recommendation }</div>
				<div class="spec">
					감독 : ${movie.mo_director }<br> 배우 : ${movie.mo_actor }<br>
					장르 : ${movie.mo_genre }<br> 기본 : ${movie.mo_age },${movie.mo_playTime }<br>
					테스트 : ${listMovie.mo_age }<br>
				</div>
			</div>
			<div class="ect_box">
				<button type="button" class="like">관심</button>
				<button type="button" class="resulvation">예매하기</button>


				<button type="button" class="recommendation" id="recommendationLike" 
					onclick="recommendationUpdate()" >추천</button>


			</div>
		</div>
</body>

<script>

/* 	function recommendationUpdate(Mo_number,M_id){
		alert("Mo_number, M_id->"+M_id);
		
	} */

		
		
function recommendationUpdate(){ 
		
		var mo_num = ${movie.mo_number};
		var m_num = "${member.m_id}";
		
		     $.ajax({
		            type : "POST",  
		            url : "/updateLike",       
		            data : {'mo_number':mo_num, 'm_id':m_num },
	                error:function(request, status, error){
		        		alert("code:"+request.status+"\n"+"message:"+request.responseText+"\n"+"error:"+error);

		        	},
		            success : function(data) {
		            	
		                    if(data == 0){
		                    	alert("추천완료.");
		                    	location.reload();
		                    	$('#recommendationLike').attr("style", "background: red;");
		                    }
		                    else if (data == 1){
		                     alert("추천취소");
		                    	location.reload();

		                }
		            }
		        });
}
		

	
	
	
	


</script>


<%@include file="../footer.jsp"%>
</html>