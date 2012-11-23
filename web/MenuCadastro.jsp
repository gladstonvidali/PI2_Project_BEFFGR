
<%@page import="DAO.UsuarioDAO"%>
<%@page import="DB.*"%>
<%@page import="Repositorio.*"%>
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
            RepUsuario repUsuario = new RepUsuario();
            List<Usuario> lUs = repUsuario.Buscar(cpf);
            Usuario us = lUs.get(0);
            
            %>
            
            CPF: <%out.print(us.getCpf());%></br>
            
            
            Nome: <input type="text" name="nome" value="<%out.print(us.getNome());%>"/></br>
                
            Senha: <input type="text" name="senha" value="<%out.print(us.getSenha());%>"/></br>
            
            <% session.setAttribute("Usession", us); %>

            </select></br>
            <input type="submit" value="Submeter">
            <a href="Menu.jsp">Cancelar</a>
        </form>
    </body>
</html>