<%-- 
    Document   : TesteHibenate
    Created on : Nov 15, 2012, 10:55:54 AM
    Author     : gladstonvidali
--%>
<%@page import="DAO.*" %>
<%@page import="JPA2.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
        AreaAtuacaoSistema aas = new AreaAtuacaoSistema();
        aas.setDescricao("TI");
        
        DAO.AreaAtuaDAO.inserir(aas);
        %>
    </body>
</html>
