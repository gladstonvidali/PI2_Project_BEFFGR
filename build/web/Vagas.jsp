<%@page import="JPA2.*"%>
<%@page import="DAO.*"%>
<%@page import="org.hibernate.Session"%>
<%@page import="org.hibernate.cfg.Configuration"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@page import="java.util.*"%>
<jsp:useBean id="lista" scope="session" class="Lista.Listar"/> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Vagas</title>
    </head>
    <body>
        <form action="UsuarioVaga.jsp">
        <h1>Vagas encontradas</h1>
        
                <%
                Usuario sU = (Usuario) session.getAttribute("Usuario");
                %>
                Vagas em aberto: <select name="Vagas">
                <%
                List<Vagas> vagas = DAO.ListarDAO.listarVagas();
                for (int cont1=0; cont1 < vagas.size();cont1++){ 
                    Vagas a = vagas.get(cont1);
                    %>
                <option> 
                    <% 
                        AreaAtuacaoSistema aa = DAO.AreaAtuaDAO.buscarAreaAtuacao(a.getCodAreaAtuacao());
   
                        out.print(cont1 +" - "+ a.getDescricao()+"<br/>"); 
                        out.print("Salário :"+a.getSalario());
                        out.print("Área de Atuação : "+aa.getDescricao());
                    %>
                </option>
                <%     
                }
                
                session.setAttribute("ListVagas", vagas);
                %>  
                </select>
                <br/>
                
                <input type="submit" value="Cadastrar"/></br>
       
                <input type="submit" value="Menu" formaction="Menu.jsp">
                </form>
                
    </body>
</html>
