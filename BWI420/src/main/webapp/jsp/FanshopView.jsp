
<%@page import="de.hwg_lu.bwi420.beans.FanshopBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Fanshop WM 2010</title>
<link rel="stylesheet" type="text/css" href="../css/Fanshop.css">
<script type="text/javascript" src="../js/Fanshop.js" ></script>
</head>
<body>
<jsp:useBean id="fsb" class="de.hwg_lu.bwi420.beans.FanshopBean" scope="session" />
<jsp:useBean id="mb" class="de.hwg_lu.bwi420.beans.MessageBean" scope="session" />
<h2>Willkommen zum BWI420 Fanshop</h2>
<h4>Was darf's denn sein?</h4>
<jsp:getProperty name="mb" property="messageHtml" />
<form action="./FanshopAppl.jsp" method="get" onsubmit="return checkData(this)">
Kunde: <input type="text" name="kunde" value="" /><br>

<input type="checkbox" name="artikel" value="0" />
Power Fan 2720s, EUR 29,80
<img src="../img/0.jpg" />
<br>

<jsp:getProperty name="fsb" property="htmlFromArtikel" />

<input type="submit" name="bestellen" value="bestellen" /><br>
<a href="./Impressum.jsp">Impressum</a>
</form>
<div id="msgField"></div>
</body>
</html>