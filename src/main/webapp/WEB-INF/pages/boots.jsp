<%--
  Created by IntelliJ IDEA.
  User: Ja
  Date: 16.06.2017
  Time: 00:41
  To change this template use File | Settings | File Templates.
--%>
<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" rel="stylesheet" >
    <title>Buty</title>
</head>
<body>
<jsp:include page="module/navbar.jsp" />
<section>
    <div class="jumbotron">
        <div class="container">
            <h1>Buty</h1>
            <p>Wszystkie buty dostępne w naszym sklepie</p>
        </div>
    </div>
</section>

<section class="container">
    <div class="row">
        <c:forEach items="${boots}" var="boot">
            <div class="col-xs-6 col-md-3" style="padding-bottom: 15px">
                <div class="thumbnail">
                    <div class="caption">
                        <img src="<c:url value="/resources/boot/${boot.idboots}.png"></c:url>" alt="<c:url value="${boot.idboots}"></c:url>" style = "width: 100%" class="img-thumbnail"/>
                        <h3>${boot.brand} ${boot.model}</h3>
                        <p>Kategoria: ${boot.category}</p>
                        <p><strong>Cena: </strong> ${boot.price} PLN</p>
                        <p>Płeć:
                            <c:if test = "${boot.gender == 'M'}"> Mężczyzna </c:if>
                            <c:if test = "${boot.gender == 'K'}"> Kobieta </c:if>
                            <c:if test = "${boot.gender == 'U'}"> Unisex </c:if>
                        </p>
                        <p>
                            <a
                                    href=" <spring:url value="/buty/buty?id=${boot.idboots}" /> "
                                    class="btn btn-primary"> Szczegóły
                            </a>
                        </p>

                    </div>
                </div>
            </div>
        </c:forEach>
    </div>
</section>

<jsp:include page="module/footer.jsp" />
</body>
</html>
