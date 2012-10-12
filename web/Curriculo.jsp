
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <jsp:useBean id="lista" scope="session" class="Lista.Listar"/> 
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Informações Profissionais</title>
    </head>
    <body>
        <h1>Edição de informações profissionais</h1>
        
        </br>
        ---------------------------------------------
        CURRICULO
        ---------------------------------------------
            Área de atuação: <select name="Area_Atuacao" size="1">
                <%
                List areaatu = lista.AreaAtuacao();
                for (int i=0; i < areaatu.size(); i++){ %>
                <option> <%= areaatu.get(i).toString() %> </option>
                <%     
                }
                %>
                <br/>
             Empresa: <select name="Empresa" size="1">
                <%
                List emp = lista.Empresas();
                for (int i=0; i < emp.size(); i++){ %>
                <option> <%= emp.get(i).toString() %> </option>
                <%     
                }
                %>
                <br/>
             Universidade: <select name="Universidade" size="1">
                <%
                List uni = lista.Empresas();
                for (int i=0; i < uni.size(); i++){ %>
                <option> <%= uni.get(i).toString() %> </option>
                <%     
                }
                %>
                <br/>
             Cursos <select name="Universidade" size="1">
                <%
                List curso = lista.Empresas();
                for (int i=0; i < curso.size(); i++){ %>
                <option> <%= curso.get(i).toString() %> </option>
                <%     
                }
                %>
                <br/>
             Situação:
              <textarea name="Situacao" maxlength="20"/>
                <br/>
             Certificado:
                <textarea name="Certficado" maxlength="20"/>
                <br/>
             Semestre Atual:
                <textarea name="SemAtual" maxlength="1"/>
             Semestre de Conclusão:
                <textarea name="SemConc" maxlength="1"/>
                
                
                   
            </select></br>
    </body>
</html>
