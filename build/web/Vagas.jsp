
<%@page import="Map.Usuario"%>
<%@page import="org.hibernate.Session"%>
<%@page import="org.hibernate.cfg.Configuration"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@page import="java.util.*"%>
<jsp:useBean id="lista" scope="session" class="Lista.Listar"/> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Vagas</title>
    </head>
    <body>
        <h1>Vagas encontradas</h1>
        
                <%
                List listas = lista.AreaAtuacao();
                for (int i=0; i < listas.size(); i++){ %>
                <%= i + " " + listas.get(i).toString() %>
                <%     
                }
                %>
    </body>
</html>
