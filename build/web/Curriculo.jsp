
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
        
        <%
          Usuario sU = (Usuario) session.getAttribute("Usuario");
        %>
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
           out.print(sU.getNome());
        %>
        
        <br/>
            Área de atuação: <select name="Area_Atuacao">
                <%
                List<AreaAtuacaoSistema> areaatu = DAO.ListarDAO.listarAreaAtuacaoSistema();
                for (int cont1=0; cont1 < areaatu.size();cont1++){ 
                    AreaAtuacaoSistema a = areaatu.get(cont1);
                    %>
                <option> 
                    <% out.print(cont1 +" - "+a.getDescricao()); %>
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
                    <%out.print(cont2 +" - "+u.getNome()); %> 
                </option>
                <%     
                }
                %>
                </select>
                <br/>
                
             Cursos: <select name="Curso">
                <%
                List<Curso> curso = DAO.ListarDAO.listarCurso();
                for (int cont3=0;cont3<curso.size();cont3++){ 
                    Curso c = curso.get(cont3);%>
                <option> 
                   <%out.print(cont3 +" - "+c.getDescricao());%> 
                </option>
                <%     
                }
                %>
                </select>
                <br/>
                
             Situação :
             
             <textarea name="Situacao" maxlength="20" cols="22" rows="1"></textarea>
                <br/>
                
             Ano de Conclusão :
             
             <textarea name="Ano" maxlength="4" cols="3" rows="1"></textarea>
                <br/>
                
             Certificado :
             <textarea name="Certficado" maxlength="20" cols="22" rows="1"></textarea>             
                <br/> 
             Semestre Atual :
             <textarea name="SemAtual" maxlength="1" cols="1" rows="1"></textarea>
                <br/>
             Semestre de Conclusão :
             <textarea name="SemConc" maxlength="1" cols="1" rows="1"></textarea>
                </br>
                
             ====== Experiência Anterior ====
             <br/>
              Empresa : <select name="Empresa">
                <%
                List<Empresa> empresa = DAO.ListarDAO.listarEmpresa();
                for (int cont4=0;cont4<empresa.size();cont4++){ 
                    Empresa emp = empresa.get(cont4);%>
                <option> 
                    <% out.print(cont4 +" - "+emp.getNome());%> 
                </option>
                <%     
                }
                %>
                </select>
                <br/>
                
                Descrição: <input type="text" name="Exp_Desc"/>
                <br/>
                
             <input type="submit" value="Cadastrar"/>
             <%
             session.setAttribute("Area_Atuacao", areaatu);
             session.setAttribute("Universidade", uni);
             session.setAttribute("Curso", curso);
             session.setAttribute("Empresa", empresa);
             %>
             
        </form>
                
    </body>
</html>
