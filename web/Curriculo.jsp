
<%@page import="DAO.*"%>
<%@page import="JPA2.*"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
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
        
        <form action="CadCurriculo.jsp">
        Nome:  
        <%
           Usuario sU = (Usuario) session.getAttribute("Usuario");
           out.print(sU.getNome());
         %>
        
        <br/>
            Área de atuação: <select name="Area_Atuacao">
                <%
                List<AreaAtuacaoSistema> areaatu = DAO.ListarDAO.listarAreaAtuacaoSistema();
                for (int cont1=0; cont1<areaatu.size();cont1++){ 
                    AreaAtuacaoSistema a = areaatu.get(cont1); %>
                <option> 
                    <% out.print(a.getDescricao()); %>
                    <input type="hidden" name="Harea_atu" value="<%=cont1%>"/>
                </option>
                <%     
                }
                %>  
                </select>
                <br/>
                
             Universidade: <select name="Universidade">
                <%
                List<Universidade> uni = DAO.ListarDAO.listarUniversidade();
                for (int cont2=0;cont2<uni.size();cont2++){ 
                    Universidade u = uni.get(cont2);%>
                <option> 
                    <% out.print(u.getNome()); %> 
                    <input type="hidden" name="Huni" value="<%=cont2%>"/> 
                </option>
                <%     
                }
                %>
                </select>
                <br/>
                
             Cursos: <select name="Universidade">
                <%
                List<Curso> curso = DAO.ListarDAO.listarCurso();
                for (int cont3=0;cont3<curso.size();cont3++){ 
                    Curso c = curso.get(cont3);%>
                <option> 
                    <% out.print(c.getDescricao());%> 
                    <input type="hidden" name="Hcurso" value="<%=cont3%>"/>
                </option>
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
                
             <input type="submit" value="Cadastrar"/>
             <%
             session.setAttribute("Area_Atuacao", areaatu);
             session.setAttribute("Universidade", uni);
             session.setAttribute("Curso", curso);
             %>
        </form>
                
    </body>
</html>
