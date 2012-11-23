
<%@page import="org.hibernate.Query"%>
<%@page import="DB.*"%>
<%@page import="Repositorio.*"%>
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
        RepUsuario repUsuario = new RepUsuario();
        
        if (repUsuario.validarLogin(request.getParameter("cpf"), request.getParameter("senha")) == true){
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
