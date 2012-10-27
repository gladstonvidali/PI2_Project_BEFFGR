
<%@page import="org.hibernate.Query"%>
<%@page import="JPA2.*"%>
<%@page import="org.hibernate.Session"%>
<%@page import="org.hibernate.cfg.Configuration"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@page import="java.util.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Verificando informações</title>
    </head>
    <body>
        <%
        
        JPA2.Usuario usuario = DAO.UsuarioDAO.validarLogin(request.getParameter("cpf").toString(), 
                    request.getParameter("senha").toString());
        if (usuario != null){
                %>
                <jsp:forward page="Menu.jsp"/>
                <%
                    
            }else{
                %>
                <jsp:forward page="TelaInicial.jsp"/>
                <%
            }
       
      %>   
    </body>
</html>
