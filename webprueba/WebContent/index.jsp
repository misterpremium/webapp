<!DOCTYPE HTML><%@page language="java"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
	<%@page import="java.util.Calendar"%>
<%@page import="java.util.GregorianCalendar"%>
<html>
<head>
<title>index</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
<h1>Good <% if (new GregorianCalendar().get(Calendar.HOUR_OF_DAY) < 12) {%><br />Morning<br /><% } else { %><br />Afternoon<br /><% } %></h1>
<p>esto es un parrafo</p>
<form action="/webprueba/HelloWorld">
<input type="text" name="variable" />
<input type="submit" value="Enviar" />
</form>
<% String variable = request.getParameter("variable"); %>
<p>Me han pasado <%= variable %></p>

<p>escriba los dos valores a operar</p>
<form action="/webprueba/HelloWorld">
<input type="text" name="valor1" />
<input type="text" name="valor2" />
<input type="submit" value="Enviar" />
</form>
<a href="http://25.16.12.204:8080/webprueba/pruebaservelet">Ejemplo</a>
<a href="http://25.16.12.204:8080/webprueba/HelloWorld">Project</a>
 
<img src="http://25.16.12.204:8081/" border="0" width="45%"/>

</body>
</html>