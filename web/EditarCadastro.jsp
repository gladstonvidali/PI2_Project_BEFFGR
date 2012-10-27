<%-- 
    Document   : EditarCadastro
    Created on : Oct 27, 2012, 6:44:28 PM
    Author     : gladstonvidali
--%>

<%@page import="JPA2.Usuario"%>
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
            JPA2.Usuario us = (JPA2.Usuario) session.getAttribute("Usession");
            
            String nome = request.getParameter("nome");
            session.setAttribute("nome", nome); 
            
            us.setNome(request.getParameter("nome"));
            us.setSenha(request.getParameter("senha"));
            UsuarioDAO.editar(us);
            
        %>
        
        <jsp:forward page="Menu.jsp"/>
    </body>
</html>
