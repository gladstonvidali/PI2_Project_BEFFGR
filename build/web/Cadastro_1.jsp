
<%@page import="JPA2.*"%>
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
        <title>Editar Cadastro</title>
    </head>
    <body>
        <h1>Cadastro</h1>
        <form action="UsuarioServlet">
           
            <%
            
            Usuario u = DAO.UsuarioDAO.buscarUsuario(request.getParameter("cpf"));
            %>
            
            CPF: <%= u.getCpf() %></br>
            
            
            Nome: <input type="text" name="nome" value="<%= u.getNome() %>"/></br>
                
            Senha: <input type="text" name="senha" value="<%= u.getSenha() %>"/></br>
 

            </select></br>
            
            <!--
            Experiência anterior: <select name="exp" size="1">
            -->
            
            <input type="submit" value="Submeter">
            <a href="Menu.jsp">Cancelar</a>
        </form>
    </body>
</html>