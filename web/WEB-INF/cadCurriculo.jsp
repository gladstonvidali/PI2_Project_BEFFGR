<%-- 
    Document   : cadCurriculo
    Created on : Nov 15, 2012, 4:06:08 PM
    Author     : gladstonvidali
--%>
<%@page import="JPA2.*" %>
<%@page import="DAO.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        Usuario u = (Usuario) session.getAttribute("Usuario");
        FormacaoAcademica fa = new FormacaoAcademica();
        Curriculo c = new Curriculo();
        
        fa.setAnoFormacao(Integer.parseInt(request.getParameter("Ano")));
        fa.setCodCurso(codCurso);
        
        
        %>
    </body>
</html>
