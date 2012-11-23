<%-- 
    Document   : MinhasVagas
    Created on : Nov 22, 2012, 6:44:30 PM
    Author     : gladstonvidali
--%>

<%@page import="DB.*"%>
<%@page import="Repositorio.*"%>
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
        <h1>Minhas Vagas</h1>
        
                <%
                DB.Usuario pU = (DB.Usuario) session.getAttribute("pUsuario");
                RepVagas repVagas = new RepVagas();
                RepAreaAtuacao repAreaAtuacao = new RepAreaAtuacao();
                RepEmpresa repEmpresa = new RepEmpresa();
                
                List<Vagas> vagas = repVagas.BuscarCadastradas(pU.getCodUsr());
                
                %>
                Vagas: <select name="Vagas">
                <%
                for(int cont1=0;cont1<vagas.size();cont1++){
                Vagas v = vagas.get(cont1);
                List<AreaAtuacaoSistema> atuacaoSistemas = repAreaAtuacao.Buscar(v.getCodAreaAtuacao());
                List<Empresa> empresas = repEmpresa.BuscarCod(v.getCodEmpresa());
                AreaAtuacaoSistema aas = atuacaoSistemas.get(0);
                Empresa e = empresas.get(0);
                %>
                    <option>
                <%
                    out.print(cont1 +" -  " + vagas.get(cont1).getDescricao() +" -R$: " + vagas.get(cont1).getSalario() + " -Area de Atuação: "+aas.getDescricao() + " -Empresa: "+e.getNome());
                %>
                    </option>
                <%
                }    
                %>
                </select>
                <br/>
                <%
                session.setAttribute("ListaVagas", vagas);
                %>
                
                <br/>
                <input type="submit" value="Remover" formaction="RemoverVaga.jsp"><br/>
                <input type="submit" value="Menu" formaction="Menu.jsp">
                </form>
    </body>
</html>
