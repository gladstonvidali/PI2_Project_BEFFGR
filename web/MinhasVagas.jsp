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
                
                <%
                List<Vagas> vagas = (List<Vagas>) DAO.VagasDAO.buscarVagasCadastradas(sU.getCodUsr());
                
                //Vagas v = vagas.get(0);
                %>
                    
                </select>
                <br/>
                <%=vagas.size()%>
                <br/>
                <input type="submit" value="Menu" formaction="Menu.jsp">
                </form>
    </body>
</html>
