
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
        
        <!--
        
        Tela de Cadastro
        -->
        
        
        <h1>Cadastro</h1>
        <form action="UsuarioServlet.java" method="post">
            Nome: <input type="text" name="nome"/></br>
            Senha: <input type="text" name="senha"/></br>
            CPF: <input type="text" name="cpf"/></br>
            
            <input type="submit" value="Submeter">
            <a href="TelaInicial.jsp">Cancelar</a>
        </form>
    </body>
</html>
