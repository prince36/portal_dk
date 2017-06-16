<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" rel="stylesheet" >
	<script src="${pageContext.request.contextPath}/resources/js/bootstrap.js"></script>



	<link rel="icon" href="${pageContext.request.contextPath}/resources/favicon.ico">
	<title>Witaj</title>
</head>
<body>
<jsp:include page="module/navbar.jsp" />
	<section>
		<div class="jumbotron">
			<div class="container">
				<h1> ${greeting} </h1>
				<p> ${tagline} </p>





				<div class="col-md-9">

					<div class="row carousel-holder">

						<div class="col-md-12">
							<div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
								<ol class="carousel-indicators">
									<li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
									<li data-target="#carousel-example-generic" data-slide-to="1"></li>
									<li data-target="#carousel-example-generic" data-slide-to="2"></li>
								</ol>
								<div class="carousel-inner">
									<div class="item active">
										<img class="slide-image" src="http://placehold.it/800x300" alt="">
									</div>
									<div class="item">
										<img class="slide-image" src="http://placehold.it/800x300" alt="">
									</div>
									<div class="item">
										<img class="slide-image" src="http://placehold.it/800x300" alt="">
									</div>
								</div>
								<a class="left carousel-control" href="#carousel-example-generic" data-slide="prev">
									<span class="glyphicon glyphicon-chevron-left"></span>
								</a>
								<a class="right carousel-control" href="#carousel-example-generic" data-slide="next">
									<span class="glyphicon glyphicon-chevron-right"></span>
								</a>
							</div>
						</div>

					</div>
				</div>









				<div class="center-block">
					<jsp:include page="module/bgs1.jsp" />
				</div>
			</div>
		</div>
	</section>




<jsp:include page="module/footer.jsp" />
</body>
</html>
