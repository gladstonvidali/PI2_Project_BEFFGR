<%@page import="DB.*"%>
<%@page import="DAO.*"%>
<%@page import="Repositorio.*"%>
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
                Usuario sU = (Usuario) session.getAttribute("pUsuario");
                %>
                Vagas em aberto: <select name="Vagas">
                <%
                RepVagas repVagas = new RepVagas();
                RepAreaAtuacao repAreaAtuacao = new RepAreaAtuacao();
                RepEmpresa repEmpresa = new RepEmpresa();
                List<Vagas> vagas = repVagas.BuscarTodos();

                for(int cont1=0;cont1<vagas.size();cont1++){
                    Vagas v = vagas.get(cont1);
                    List<AreaAtuacaoSistema> atuacaoSistemas = repAreaAtuacao.Buscar(v.getCodAreaAtuacao());
                    List<Empresa> empresas = repEmpresa.BuscarCod(v.getCodEmpresa());
                    AreaAtuacaoSistema aas = atuacaoSistemas.get(0);
                    Empresa e = empresas.get(0);
                    
                    %>
                    <option> 
                        <%
                        out.print(cont1 + " - "+ v.getDescricao()+ " -R$: "+v.getSalario()+ " -Area de Atuação: "+aas.getDescricao() + " -Empresa: "+e.getNome());
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

