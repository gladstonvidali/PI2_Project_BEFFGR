<%-- 
    Document   : MinhasVagas
    Created on : Nov 22, 2012, 6:44:30 PM
    Author     : gladstonvidali
--%>

<%@page import="JPA2.*"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form>
        <h1>Vagas encontradas</h1>
        
                <%
                Usuario sU = (Usuario) session.getAttribute("Usuario");
                %>
                Vagas em aberto: <select name="Vagas">
                    <option>
                <%
                List<Vagas> vagas = DAO.VagasDAO.buscarVagasCadastradas(sU.getCodUsr());
                %>
                    </option>
                </select>
                <br/>
                <%
                Vagas v = DAO.VagasDAO.buscarVagas(2);
                out.print(v.getDescricao());
                
                List<Vagas> Lv = DAO.VagasDAO.buscarVagasCadastradas(7);
                Lv.get(0).getDescricao();
                
                %>
                
                <br/>
                <input type="submit" value="Menu" formaction="Menu.jsp">
                </form>
    </body>
</html>
