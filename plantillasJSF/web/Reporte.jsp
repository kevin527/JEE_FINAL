<%-- 
    Document   : Reporte
    Created on : 12-may-2015, 19:34:20
    Author     : Miguel
--%>

<%@page contentType="text/html" %>
<%@ page import="net.sf.jasperreports.engine.*" %> 
<%@ page import="java.util.*" %> 
<%@ page import="java.io.*" %> 
<%@ page import="java.sql.*" %> 
<% /*Parametros para realizar la conexión*/ 
Connection conexion; 
Class.forName("org.postgresql.Driver").newInstance(); 
conexion = DriverManager.getConnection("jdbc:postgresql://localhost:5432/autos","postgres","postgres");
/*Establecemos la ruta del reporte*/ 
File reportFile = new File(application.getRealPath("reportes/general.jasper")); 
/* No enviamos parámetros porque nuestro reporte no los necesita asi que escriba 
cualquier cadena de texto ya que solo seguiremos el formato del método runReportToPdf*/ 
Map parameters = new HashMap(); parameters.put("Nombre_parametro", "Valor_Parametro"); 
/*Enviamos la ruta del reporte, los parámetros y la conexión(objeto Connection)*/ 
byte[] bytes = JasperRunManager.runReportToPdf(reportFile.getPath (), parameters, conexion); 
/*Indicamos que la respuesta va a ser en formato PDF*/ response.setContentType("application/pdf");
response.setContentLength(bytes.length); ServletOutputStream ouputStream = response.getOutputStream(); 
ouputStream.write(bytes, 0, bytes.length); /*Limpiamos y cerramos flujos de salida*/ ouputStream.flush(); 
ouputStream.close(); %>
