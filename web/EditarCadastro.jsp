<%-- 
    Document   : EditarCadastro
    Created on : Oct 27, 2012, 6:44:28 PM
    Author     : gladstonvidali
--%>

<%@page import="java.util.List"%>
<%@page import="DB.*"%>
<%@page import="Repositorio.*"%>
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
            RepUsuario repUsuario = new RepUsuario();
            List<Usuario> lUs = repUsuario.Buscar(session.getAttribute("cpf").toString());
            Usuario us = lUs.get(0);
            
            us.setNome(request.getParameter("nome"));
            us.setSenha(request.getParameter("senha"));
            try{
            repUsuario.Alterar(us);
            %>
            <jsp:forward page="Menu.jsp"/>
            <%
            }catch(Exception e){
                out.println(e);
            }
            
        %>
        
      
    </body>
</html>
