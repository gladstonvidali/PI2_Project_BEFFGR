
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
        <title>Cadastro</title>
    </head>
    <body>
        <h1>Cadastro</h1>
        <form action="Criar_Usuario_1.jsp">
           
            Nome: 
                <%
                List nome = lista.Nome(session.getAttribute("usuario").toString());
                for (int i=0; i < nome.size(); i++){ %>
                <input type="text" name="nome" value="<%= nome.get(i).toString() %>"/>
                <%     
                }
                %>
                </br>
                
            Senha: <input type="text" name="senha" value="<%= session.getAttribute("senha") %>"/></br>
 
            CPF: <%= session.getAttribute("usuario") %></br>
            
            </select></br>
            
            <!--
            Experiência anterior: <select name="exp" size="1">
            -->
            
            <input type="submit" value="Submeter">
            <a href="Menu.jsp">Cancelar</a>
        </form>
    </body>
</html>