<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="imagenes" value="/resources/imagenes" />

<!DOCTYPE html>
<html lang="en">

  <head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>MP - MarketPlaceTurístico - ${titulo}</title>
    
    <script>
    	window.menu = '${titulo}';
    </script>

    <!-- Bootstrap core CSS -->
    <link href="${css}/bootstrap.min.css" rel="stylesheet">

    <!-- Tema Externo -->
    <link href="${css}/bootstrap-readable-theme2.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="${css}/app.css" rel="stylesheet">
    
  </head>

  <body>

	<!--  <div class="wrapper">-->
	
		<!-- Navigation -->
		<%@include file="./shared/navbar.jsp"%>

		<!-- Page Content -->

		<!--  <div class="content">-->
		
			<c:if test="${userClickHome == true }">
				<%@include file="home.jsp"%>
			</c:if>

			<!-- Quiénes Somos -->
			<c:if test="${userClickQuienes == true }">
				<%@include file="quienes.jsp"%>
			</c:if>

			<!-- Destinos-->
			<c:if test="${userClickDestinos== true }">
				<%@include file="destinos.jsp"%>
			</c:if>

			<!-- Contactenos -->
			<c:if test="${userClickContactenos == true }">
				<%@include file="contactenos.jsp"%>
			</c:if>

			<!-- Encuesta -->
			<c:if test="${userClickEncuesta == true }">
				<%@include file="encuesta.jsp"%>
			</c:if>

		<!-- Content </div>-->

		<!-- Footer -->
		<%@include file="./shared/footer.jsp"%>>

		<!-- Bootstrap core JavaScript -->
		<script src="${js}/jquery.js"></script>
		<script src="${js}/bootstrap.bundle.min.js"></script>

		<script src="${js}/app.js"></script>

	<!-- Wrapper </div>-->

</body>

</html>
