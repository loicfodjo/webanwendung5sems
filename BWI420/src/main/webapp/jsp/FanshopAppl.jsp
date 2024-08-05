<%@page import="de.hwg_lu.bwi420.beans.MessageBean"%>
<%@page import="de.hwg_lu.bwi420.beans.FanshopBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="fsb" class="de.hwg_lu.bwi420.beans.FanshopBean" scope="session" />
<jsp:useBean id="mb" class="de.hwg_lu.bwi420.beans.MessageBean" scope="session" />
<%
String kunde     = request.getParameter("kunde");
String[] artikel = request.getParameterValues("artikel");
String bestellen = request.getParameter("bestellen");

if (bestellen == null) bestellen = "";
if (artikel == null) artikel = new String[0];

if (bestellen.equals("bestellen")){
	boolean hatGeklappt = fsb.bestellungSpeichern(kunde, artikel);
	//if (hatGeklappt){
	//	mb.setBestellungOk();
	//}else{
	//	mb.setBestellungKaputt();
	}
	response.sendRedirect("./FanshopView.jsp");
//}else{

	response.sendRedirect("./FanshopView.jsp");
//}

%>
</body>
</html>