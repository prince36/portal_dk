<%--
  Created by IntelliJ IDEA.
  User: Ja
  Date: 09.05.2017
  Time: 19:10
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
    <title>Produkty</title>
</head>
<body>
<jsp:include page="module/navbar.jsp" />
<section>
    <div class="jumbotron">
        <div class="container">
            <h1>Produkty</h1>
            <p>Dodaj produkty</p>
        </div>
        <a href="<c:url value="/j_spring_security_logout"/>" class="btn btn-danger btn-mini pull-right">Wyloguj się</a>
    </div>
</section>
<section class="container">
    <form:form commandName="newProduct"  modelAttribute="newProduct" class="form-horizontal">
        <fieldset>
            <legend>Dodaj nowy produkt</legend>
                <%--
                            <div class="form-group">
                                <label class="control-label col-lg-2" for="productId">
                                        <%-- <spring:message code="addProduct.form.productId.label"/>       --%>
                <%--  Id produktu

              </label>
              <div class="col-lg-10">
                  <form:input id="productId" path="productId" type="text" class="form:input-large"/>
              </div>
          </div>
          --%>
            <div class="form-group">
                <label class="control-label col-lg-2" for="name">Nazwa</label>
                <div class="col-lg-10">
                    <form:input id="name" path="name" type="text" class="form:input-large"/>
                </div>
            </div>

            <div class="form-group">
                <label class="control-label col-lg-2" for="unitPrice">Cena</label>
                <div class="col-lg-10">
                    <div class="form:input-prepend">
                        <form:input id="unitPrice" path="unitPrice" type="text" class="form:input-large"/>
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
                <label class="control-label col-lg-2" for="manufacturer">Producent</label>
                <div class="col-lg-10">
                    <form:input id="manufacturer" path="manufacturer" type="text" class="form:input-large"/>
                </div>
            </div>

            <div class="form-group">
                <label class="control-label col-lg-2" for="category">Kategoria</label>
                <div class="col-lg-10">
                    <form:input id="category" path="category" type="text" class="form:input-large"/>
                </div>
            </div>

            <div class="form-group">
                <label class="control-label col-lg-2" for="unitsInStock">Liczba dostępnych sztuk</label>
                <div class="col-lg-10">
                    <form:input id="unitsInStock" path="unitsInStock" type="text" class="form:input-large"/>
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
