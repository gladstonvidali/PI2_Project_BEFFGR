<%-- 
    Document   : RemoverVaga
    Created on : Nov 23, 2012, 5:54:00 PM
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
        <title>Removendo Vaga Selecionada</title>
    </head>
    <body>
        <%
        DB.Usuario pU = (DB.Usuario) session.getAttribute("pUsuario");
        RepVagas repVagas = new RepVagas();
        RepAreaAtuacao repAreaAtuacao = new RepAreaAtuacao();
        RepEmpresa repEmpresa = new RepEmpresa();
                
        List<Vagas> vagas = repVagas.BuscarCadastradas(pU.getCodUsr());
                
        
        String sCont1 = request.getParameter("Vagas");
        sCont1 = String.valueOf(sCont1.charAt(0));
        int cont1 = Integer.parseInt(sCont1);
        
        try{
            if(repVagas.remover(vagas.get(cont1)) == true){
                out.println("<a href="+"MinhasVagas.jsp>Vaga removida! Voltar ao menu de vagas cadastradas.</a>");
            }else{
                out.println("Erro ao remover.");
            }
        }catch(Exception e){
            out.println(e);
        }
        %>
    </body>
</html>
