<%-- 
    Document   : Cadastro
    Created on : Sep 16, 2012, 3:55:12 PM
    Author     : ffutigam
--%>
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
        <form action="Criar_Usuario.jsp">
            Nome: <input type="text" name="nome"/></br>
            Senha: <input type="text" name="senha"/></br>
            CPF: <input type="text" name="cpf"/></br>
            Universidade: <select name="Universidade" size="1">
                <%
                List Univ = lista.Universidade();
                for (int i=0; i < Univ.size(); i++){ %>
                <option> <%= Univ.get(i).toString() %> </option>
                <%     
                }
                %>
            </select></br>
            <!--
            Experiência anterior: <input type="text" name="exp"/></br>
            -->
            <input type="submit" value="Submeter">
            <a href="TelaInicial.jsp">Cancelar</a>
        </form>
    </body>
</html>
