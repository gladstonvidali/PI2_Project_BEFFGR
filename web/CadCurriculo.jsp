<%-- 
    Document   : cadCurriculo
    Created on : Nov 15, 2012, 4:06:08 PM
    Author     : gladstonvidali
--%>
<%@page import="java.util.List"%>
<%@page import="JPA2.*" %>
<%@page import="DAO.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        
        Usuario u = (Usuario) session.getAttribute("Usuario");
        FormacaoAcademica fa = new FormacaoAcademica();
        Curriculo c = new Curriculo();
        
        List<AreaAtuacaoSistema> areaatu = (List<AreaAtuacaoSistema>) session.getAttribute("Area_Atuacao");
        List<Universidade> uni = (List<Universidade>) session.getAttribute("Universidade");
        List<Curso> curso = (List<Curso>) session.getAttribute("Curso");
        
        String sCont1 = request.getParameter("Area_Atuacao");
        sCont1 = String.valueOf(sCont1.charAt(0));
        
        String sCont2 = request.getParameter("Universidade");
        sCont2 = String.valueOf(sCont2.charAt(0));
        
        String sCont3 = request.getParameter("Curso");
        sCont3 = String.valueOf(sCont3.charAt(0));
        
        int cont1 = Integer.parseInt(sCont1);
        int cont2 = Integer.parseInt(sCont2);
        int cont3 = Integer.parseInt(sCont3);
        
        out.print(cont1+"<br/>");
        out.print(cont2+"<br/>");
        out.print(cont3+"<br/>");
        
        out.print(areaatu.get(cont1).getDescricao()+"<br/>");
        out.print(uni.get(cont2).getNome()+"<br/>");
        out.print(curso.get(cont3).getDescricao()+"<br/>");
        /*
        fa.setCodUniversidade(uni.get(cont2).getCodUniversidade());
        fa.setCodCurso(curso.get(cont3).getCodCurso());
        fa.setCodUsr(u.getCodUsr());
        fa.setSituacao(request.getAttribute("Situacao").toString());
        fa.setAnoFormacao(Integer.parseInt(request.getAttribute("Ano").toString()));
        fa.setSemestreAtual(Integer.parseInt(request.getParameter("SemAtual").toString()));
        fa.setSemestreFormacao(Integer.parseInt(request.getParameter("SemConc").toString()));
        DAO.FormAcademicaDAO.inserir(fa);
        
        c.setCerficado(request.getAttribute("Certificado").toString());
        c.setCodAreaAtuacao(areaatu.get(cont1).getCodAreaAtuacao());
        c.setCodUsr(u.getCodUsr());
        * */
        %>
    </body>
</html>
