<%--
  Created by IntelliJ IDEA.
  User: Ja
  Date: 16.06.2017
  Time: 00:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" rel="stylesheet" >
    <title>Dodawanie nowego obuwia</title>
</head>
<body>
<jsp:include page="module/navbar.jsp" />
<section>
    <div class="jumbotron">
        <div class="container">
            <h1>Buty</h1>
            <p>Dodaj nowe obuwie</p>
        </div>
        <a href="<c:url value="/j_spring_security_logout"/>" class="btn btn-danger btn-mini pull-right">Wyloguj się</a>
    </div>
</section>
<section class="container">
    <form:form commandName="newBoot"  modelAttribute="newBoot" class="form-horizontal">
        <div>
            <legend>Dodaj nowy produkt</legend>
            <div class="form-group">
                <label class="control-label col-lg-2" for="brand">Producent </label>
                <div class="col-lg-10">
                    <form:input id="brand" path="brand" type="text" class="form:input-large"/>
                </div>
            </div>

            <div class="form-group">
                <label class="control-label col-lg-2" for="model">Model </label>
                <div class="col-lg-10">
                    <div class="form:input-prepend">
                        <form:input id="model" path="model" type="text" class="form:input-large"/>
                    </div>
                </div>
            </div>

            <div class="form-group">
                <label class="control-label col-lg-2" for="product_code">Kod produktu </label>
                <div class="col-lg-10">
                    <div class="form:input-prepend">
                        <form:input id="product_code" path="product_code" type="text" class="form:input-large"/>
                    </div>
                </div>
            </div>

            <div class="form-group">
                <label class="control-label col-lg-2" for="product_code">Płeć </label>
                <div class="col-lg-10">
                    <div class="form:input-prepend">
                        <form:select path="gender" items="${genderList}" multiple="true" cssClass="dropdown-menu" aria-labelledby="dropdownMenu1"/>
                    </div>
                </div>
            </div>

            <div class="form-group">
                <label class="control-label col-lg-2" for="color">Kolor </label>
                <div class="col-lg-10">
                    <div class="form:input-prepend">
                        <form:input id="color" path="color" type="text" class="form:input-large"/>
                    </div>
                </div>
            </div>
            <div class="form-group">
                <label class="control-label col-lg-2" for="category">Kategoria </label>
                <div class="col-lg-10">
                    <div class="form:input-prepend">
                        <form:input id="category" path="category" type="text" class="form:input-large"/>
                    </div>
                </div>
            </div>
            <div class="form-group">
                <label class="control-label col-lg-2" for="description">Opis</label>
                <div class="col-lg-10">
                    <form:textarea id="description" path="description" rows = "2"/>
                </div>
            </div>

            <div class="form-group">
                <label class="control-label col-lg-2" for="price">Cena </label>
                <div class="col-lg-10">
                    <div class="form:input-prepend">
                        <form:input id="price" path="price" type="text" class="form:input-large"/>
                    </div>
                </div>
            </div>
            <div class="form-group">
                <div class="col-lg-offset-2 col-lg-10">
                    <input type="submit" id="btnAdd" class="btn btn-primary" value ="Dodaj"/>
                </div>
            </div>







        </fieldset>
    </form:form>
</section>

<jsp:include page="module/footer.jsp" />
</body>
</html>

