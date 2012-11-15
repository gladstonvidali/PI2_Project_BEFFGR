 <%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Tela Inicial</h1>
        
        <form action="Verificar_Login.jsp">
            CPF: <input type="text" name="cpf" /></br>
            Senha:   <input type="password" name="senha" /></br></br>
            <input type="submit" value="Ok" />
            <a href ="Cadastro.jsp">Cadastre-se</a>
                        
        </form>    
    </body>
</html>
