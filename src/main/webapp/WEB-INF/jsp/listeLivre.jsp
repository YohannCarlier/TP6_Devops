<%--
  Created by IntelliJ IDEA.
  User: faneva
  Date: 23/11/2023
  Time: 11:43
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<jsp:include page="../../header.jsp"></jsp:include>
<body>
<%@include file="menu.jsp"%>
<div class="container">
    <h1>Liste de livres</h1>
    <ul>
        <c:forEach items="${listelivres}" var="livre" varStatus="loop">
            <li>
                    ${livre.getTitre()} - ${livre.getAuteur()} - ${livre.getAnnee()} - ${livre.getGenre()}
            </li>
        </c:forEach>
    </ul>
</div>
</body>
</html>
