<%-- 
    Document   : UsuarioVaga
    Created on : Nov 22, 2012, 5:26:51 PM
    Author     : gladstonvidali
--%>

<%@page import="java.util.List"%>
<%@page import="JPA2.*"%>
<%@page import="DAO.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastrando na vaga selecionada</title>
    </head>
    <body>
        <%
        Usuario sU = (Usuario) session.getAttribute("Usuario");
        List<Vagas> vagas = (List<Vagas>) session.getAttribute("ListVagas");
        
        String sCont1 = request.getParameter("Vagas");
        sCont1 = String.valueOf(sCont1.charAt(0));
        int cont1 = Integer.parseInt(sCont1);
        
        try{
        UsuarioVaga uv = new UsuarioVaga();
        uv.setCodUsr(sU.getCodUsr());
        uv.setCodVaga(vagas.get(cont1).getCodVaga());
        DAO.UsuarioVagaDAO.inserir(uv);
        %>
        <jsp:forward page="Menu.jsp"/>
        <%
        }catch (Exception e){
            out.print(e);
        }
        %>
        
    </body>
</html>
