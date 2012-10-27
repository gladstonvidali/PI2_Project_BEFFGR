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
            
            String nome = request.getParameter("nome");
            session.setAttribute("nome", nome); 
            
            Usuario usuario = new Usuario();
            usuario.setCpf(session.getAttribute("cpf").toString());
            usuario.setNome(request.getParameter("nome").toString());
            usuario.setSenha(request.getParameter("senha").toString());
            UsuarioDAO.inserir(usuario);
            
        %>
        
        <jsp:forward page="Menu.jsp"/>
    </body>
</html>
