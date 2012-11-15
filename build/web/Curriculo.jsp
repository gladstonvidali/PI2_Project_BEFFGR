
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
        <br/>
        CURRICULO
        <br/>
        ---------------------------------------------
        <br/>
        
        <form>
        Nome:  
        <%
           Usuario sU = (Usuario) session.getAttribute("Usuario");
           out.print(sU.getNome());
         %>
        
        <br/>
            Área de atuação: <select name="Area_Atuacao">
                <%
                List<AreaAtuacaoSistema> areaatu = DAO.ListarDAO.listarAreaAtuacaoSistema();
                for (AreaAtuacaoSistema a : areaatu ){ %>
                <option> <% out.print(a.getDescricao()); %> </option>
                <%     
                }
                %>  
                </select>
                <br/>
                
             Universidade: <select name="Universidade">
                <%
                List<Universidade> uni = DAO.ListarDAO.listarUniversidade();
                for (Universidade u : uni){ %>
                <option> <% out.print(u.getNome()); %> </option>
                <%     
                }
                %>
                </select>
                <br/>
                
             Cursos <select name="Universidade">
                <%
                List<Curso> curso = DAO.ListarDAO.listarCurso();
                for (Curso c : curso){ %>
                <option> <% out.print(c.getDescricao());%> </option>
                <%     
                }
                %>
                </select>
                <br/>
                
             Situação:
             
             <textarea name="Situacao" maxlength="20" cols="22" rows="1"></textarea>
                <br/>
                
             Ano:
             
             <textarea name="Ano" maxlength="4" cols="3" rows="1"></textarea>
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
                
             <input type="button" formaction="CadCurriculo.jsp" formmethod="post" value="Cadastrar"/>
    
             <input type="button" formaction="AltCurriculo.jsp" formmethod="post" value="Alterar"/>
             
        </form>
    </body>
</html>
