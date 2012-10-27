
<%@page import="DAO.UsuarioDAO"%>
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
        <form action="EditarCadastro.jsp" method="post">
           
            <%
            String cpf = session.getAttribute("cpf").toString();
            JPA2.Usuario us = (JPA2.Usuario) 
                    DAO.UsuarioDAO.buscarUsuario(cpf);
                     
            %>
            
            CPF: <%out.print(us.getCpf());%></br>
            
            
            Nome: <input type="text" name="nome" value="<%out.print(us.getNome());%>"/></br>
                
            Senha: <input type="text" name="senha" value="<%out.print(us.getSenha());%>"/></br>
 

            </select></br>
            
            <!--
            Experiência anterior: <select name="exp" size="1">
            -->
            <input type="submit" value="Submeter">
            <a href="Menu.jsp">Cancelar</a>
        </form>
    </body>
</html>