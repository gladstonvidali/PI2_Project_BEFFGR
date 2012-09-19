
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>MENU PRINCIPAL</title>
    </head>
    <body>
        <% 
        if (session.getAttribute("usuario") == null){
            
        String usuario = request.getParameter("usuario");
        session.setAttribute("usuario", usuario); 


        String senha = request.getParameter("senha");
        session.setAttribute("senha", senha); 
        }

        %>
        <h1>Menu</h1>
        <a href="Cadastro_1.jsp">Editar cadastro</a>
        </br>
        ---------------------------------------------
        </br>
        <form action="Vagas.jsp">
            <input type="text" name="busca"></br>
            <input type="submit" value="Buscar_vaga"></br>
            <input type="submit" value="Sair" formaction="TelaInicial.jsp">
        </form>
    </body>
</html>
