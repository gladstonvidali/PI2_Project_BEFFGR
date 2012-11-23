<%-- 
    Document   : CadCurriculoValidacao
    Created on : Nov 23, 2012, 5:13:51 PM
    Author     : gladstonvidali
--%>
<%@page import="java.util.List"%>
<%@page import="DB.*"%>
<%@page import="Repositorio.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Validando Alterações</title>
    </head>
    <body>
        <%
            Usuario u = (Usuario) session.getAttribute("pUsuario");
            RepUsuario repUsuario = new RepUsuario();
            RepFormacaoAcademica repFormacaoAcademica = new RepFormacaoAcademica();
            RepCurriculo repCurriculo = new RepCurriculo();
            List<Usuario> lUs = repUsuario.Buscar(session.getAttribute("cpf").toString());
            FormacaoAcademica fa = repFormacaoAcademica.BuscarCodUsr(u.getCodUsr()).get(0);
            Curriculo c = repCurriculo.BuscarCodUsr(u.getCodUsr()).get(0);
            Usuario us = lUs.get(0);
            
            us.setCodFa(fa.getCodFa());
            us.setCodCv(c.getCodCv());
                
            try{
                repUsuario.Alterar(us);
            %>
                <jsp:forward page="Menu.jsp"/>
            <%
            }catch(Exception e){
                out.println(e);
            }
            
        %>
    </body>
</html>
