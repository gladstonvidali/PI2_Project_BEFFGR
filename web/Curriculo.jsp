
<%@page import="DAO.*"%>
<%@page import="JPA2.*"%>
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
        <br/>
            Área de atuação: <select name="Area_Atuacao" size="1">
                <%
                List<AreaAtuacaoSistema> areaatu = DAO.ListarDAO.listarAreaAtuacaoSistema();
                for (AreaAtuacaoSistema a : areaatu ){ %>
                <option> <%= a.getDescricao().toString() %> </option>
                <%     
                }
                %>
                </select>
                <br/>
                
             Universidade: <select name="Universidade" size="1">
                <%
                List<Universidade> uni = DAO.ListarDAO.listarUniversidade();
                for (Universidade u : uni){ %>
                <option> <%= u.getNome().toString() %> </option>
                <%     
                }
                %>
                </select>
                <br/>
                
             Cursos <select name="Universidade" size="1">
                <%
                List<Curso> curso = DAO.ListarDAO.listarCurso();
                for (Curso c : curso){ %>
                <option> <%= c.getDescricao().toString() %> </option>
                <%     
                }
                %>
                </select>
                <br/>
                
             Situação:
             
             <textarea name="Situacao" maxlength="20" cols="22" rows="1"></textarea>
                <br/>
                
             Certificado:
             <textarea name="Certficado" maxlength="20" cols="22" rows="1"></textarea>             
                <br/> 
             Semestre Atual:
             <textarea name="SemAtual" maxlength="1" cols="1" rows="1"></textarea>
                <br/>
             Semestre de Conclusão:
             <textarea name="SemConc" maxlength="1" cols="1" rows="1"></textarea>
                </br>
    </body>
</html>
