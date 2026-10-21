<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags" %>
<jsp:include page="fragments/header.jsp" />
<jsp:include page="fragments/navbar.jsp" />

<div class="container">
    <h2 class="mb-4">Our Products</h2>
    <div class="row">
        <c:forEach var="prod" items="${products}">
            <tags:productCard product="${prod}" />
        </c:forEach>
    </div>
</div>

<jsp:include page="fragments/footer.jsp" />
