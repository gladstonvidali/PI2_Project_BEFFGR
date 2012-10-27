<%@page import="JPA2.*"%>
<%@page import="javax.persistence.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JPA Teste</title>
    </head>
    <body>
        <h1>Teste</h1>
        <form action="UsuarioServlet" method="post">
            <table>
                <tr>
                    <td>Nome</td>
                    <td><input type="text" name="nome_usuario" /></td>
                </tr>
                <tr>
                    <td>CPF</td>
                    <td><input type="text" name="cpf" /></td>
                </tr>
                <tr>
                    <td colspan="2"><input type="submit"></td>
                </tr>
            </table>
        </form>
        
    </body>
</html>
