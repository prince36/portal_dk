<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Ja
  Date: 16.06.2017
  Time: 03:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<h3>Zobacz także:</h3>
<div class="row">
    <c:forEach items="${boots1}" var="boots1">

    <div class="col-xs-6 col-md-2">
        <a href="<spring:url value="/buty/buty?id=${boot.idboots}" />" class="thumbnail">
            <img src="<c:url value="/resources/boot/${boots1.idboots}.png"/>" alt="${boots1.model}" class="img-rounded img-responsive">
        </a>
    </div>
    </c:forEach>

</div>