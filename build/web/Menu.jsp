
<%@page import="JPA2.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>MENU PRINCIPAL</title>
    </head>
    <body>
        <% 
        if (session.getAttribute("cpf") == null){
            
        String cpf = request.getParameter("cpf");
        session.setAttribute("cpf", cpf); 


        String senha = request.getParameter("senha");
        session.setAttribute("senha", senha);
        }
        
        Usuario sU = DAO.UsuarioDAO.buscarUsuario(session.getAttribute("cpf").toString());
        session.setAttribute("Usuario", sU);
        
        %>
        <h1>Menu</h1>
        <a href="Cadastro_1.jsp">Editar cadastro</a>
        </br>
        ---------------------------------------------
        <br/>
        <a href="Curriculo.jsp">Editar informações profissionais</a>
        <br/>
        ---------------------------------------------
        </br>
        <form action="Vagas.jsp">
            
            <input type="submit" value="Painel de Vagas"></br>
            <input type="submit" value="Vagas cadastradas" formaction="MinhasVagas.jsp"><br/>
            <input type="submit" value="Sair" formaction="TelaInicial.jsp">
        </form>
    </body>
</html>
