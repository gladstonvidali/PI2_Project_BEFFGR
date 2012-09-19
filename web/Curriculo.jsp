
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        
            Área de atuação: <select name="Area_Atuacao" size="1">
                <%
                List listas = lista.AreaAtuacao();
                for (int i=0; i < listas.size(); i++){ %>
                <option> <%= listas.get(i).toString() %> </option>
                <%     
                }
                %>
            </select></br>
    </body>
</html>
