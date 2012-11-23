<%-- 
    Document   : bkp
    Created on : Nov 22, 2012, 7:07:45 PM
    Author     : gladstonvidali
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        
                for(int cont1=0;cont1<vagas.size();cont1++){
                    Vagas v = vagas.get(cont1);
                    AreaAtuacaoSistema aa = DAO.AreaAtuaDAO.buscarAreaAtuacao(v.getCodAreaAtuacao());
                    %>
                    <option> 
                        <%
                        out.print(cont1 + " - "+ v.getDescricao()+ " -R$: "+v.getSalario()+ " -Area de Atuação: "+aa.getDescricao());
                        %>
                    </option>
                    <%
                }
                session.setAttribute("ListVagas", vagas);
                %>  
                </select>
                <br/>
                
                
                
                ========
                
                
                <%
                Usuario sU = (Usuario) session.getAttribute("Usuario");
                %>
                Vagas em aberto: <select name="Vagas">
                <%
                List<Vagas> vagas = DAO.ListarDAO.listarVagas();

                for(int cont1=0;cont1<vagas.size();cont1++){
                    Vagas v = vagas.get(cont1);
                    AreaAtuacaoSistema aa = DAO.AreaAtuaDAO.buscarAreaAtuacao(v.getCodAreaAtuacao());
                    %>
                    <option> 
                        <%
                        out.print(cont1 + " - "+ v.getDescricao()+ " -R$: "+v.getSalario()+ " -Area de Atuação: "+aa.getDescricao());
                        %>
                    </option>
                    <%
                }
                session.setAttribute("ListVagas", vagas);
                %>  
                </select>
                <br/>
    </body>
</html>
