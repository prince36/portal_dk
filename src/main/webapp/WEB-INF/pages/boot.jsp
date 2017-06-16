<%--
  Created by IntelliJ IDEA.
  User: Ja
  Date: 16.06.2017
  Time: 01:50
  To change this template use File | Settings | File Templates.
--%>
<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" rel="stylesheet" >

    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

    <title>Buty</title>
</head>
<body>
<jsp:include page="module/navbar.jsp" />


<section>
    <div class="jumbotron">
        <div class="container">
            <h1>${boot.brand} ${boot.model}</h1>
        </div>
    </div>
</section>
<section class="container">
    <div class="row">

        <div class="col-md-5">
            <img src="<c:url value="/resources/boot/${boot.idboots}.png"></c:url>" alt="<c:url value="${boot.idboots}"></c:url>" style = "width:100%"/>
        </div>

        <div class="col-md-5">
            <h3>${boot.brand} ${boot.model}</h3>
            <p>${boot.description}</p>
            <p>
                <strong>Kod produktu: </strong><span class="label label-warning">${boot.product_code}</span>
            </p>
            <p>
                <strong>Producent :</strong> ${boot.brand}
            </p>
            <p>
                <strong>Płeć: </strong>
                <c:if test = "${boot.gender == 'M'}"> Mężczyzna </c:if>
                <c:if test = "${boot.gender == 'K'}"> Kobieta </c:if>
                <c:if test = "${boot.gender == 'U'}"> Unisex </c:if>
            </p>
            <p>
                <strong>Kategoria: </strong> ${boot.category}
            </p>
            <h4><strong>Cena: </strong>${boot.price} PLN</h4>
            <p>
                <a href="#" class="btn btn-warning btn-large">  Zamów teraz
                </a> <a href="<spring:url value="/buty" />" class="btn btn-default"> powrót
            </a>
            </p>
        </div>
    </div>
</section>

<jsp:include page="module/bgs1.jsp" />

<jsp:include page="module/footer.jsp" />
</body>
</html>

