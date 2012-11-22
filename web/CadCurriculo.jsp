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
        
        //
        if ( DAO.FormAcademicaDAO.buscarFA_CodUsr(u.getCodUsr()) == false){
        
        FormacaoAcademica fa = new FormacaoAcademica();
        Curriculo c = new Curriculo();
        ExpProfSistema exps = new ExpProfSistema();
        
        List<AreaAtuacaoSistema> areaatu = (List<AreaAtuacaoSistema>) session.getAttribute("Area_Atuacao");
        List<Universidade> uni = (List<Universidade>) session.getAttribute("Universidade");
        List<Curso> curso = (List<Curso>) session.getAttribute("Curso");
        List<Empresa> empresa = (List<Empresa>) session.getAttribute("Empresa");
        
        String sCont1 = request.getParameter("Area_Atuacao");
        sCont1 = String.valueOf(sCont1.charAt(0));
        
        String sCont2 = request.getParameter("Universidade");
        sCont2 = String.valueOf(sCont2.charAt(0));
        
        String sCont3 = request.getParameter("Curso");
        sCont3 = String.valueOf(sCont3.charAt(0));
        
        String sCont4 = request.getParameter("Empresa");
        sCont4 = String.valueOf(sCont4.charAt(0));
        //
        int cont1 = Integer.parseInt(sCont1);
        int cont2 = Integer.parseInt(sCont2);
        int cont3 = Integer.parseInt(sCont3);
        int cont4 = Integer.parseInt(sCont4);
        //
           
        
        fa.setCodUniversidade(uni.get(cont2).getCodUniversidade());
        fa.setCodCurso(curso.get(cont3).getCodCurso());
        fa.setCodUsr(u.getCodUsr());
        fa.setSituacao(request.getParameter("Situacao").toString());
        fa.setAnoFormacao(Integer.parseInt(request.getParameter("Ano").toString()));
        fa.setSemestreAtual(Integer.parseInt(request.getParameter("SemAtual").toString()));
        fa.setSemestreFormacao(Integer.parseInt(request.getParameter("SemConc").toString()));
        DAO.FormAcademicaDAO.inserir(fa);
        //
        exps.setDescricao(request.getParameter("Exp_Desc"));
        exps.setCodEmpresa(empresa.get(cont4).getCodEmpresa());
        exps.setCodUsr(u.getCodUsr());
        DAO.ExpProfSisDAO.inserir(exps);
        //
        c.setCerficado(request.getParameter("Certficado").toString());
        c.setCodAreaAtuacao(areaatu.get(cont1).getCodAreaAtuacao());
        c.setCodUsr(u.getCodUsr());
        c.setCodExpProf(exps.getCodExpProf());
        DAO.CurriculoDAO.inserir(c);
        out.print("Adicionado com sucesso!"+"<br/>");
        %>
        <a href="Menu.jsp">Voltar ao Menu</a>
        <%
               }else{
    
        FormacaoAcademica fa = DAO.FormAcademicaDAO.buscarFAcodusr(u.getCodUsr());
        Curriculo c = DAO.CurriculoDAO.buscarCVcodusr(u.getCodUsr());
        ExpProfSistema exps = DAO.ExpProfSisDAO.buscarExpProfSisCod_Usr(u.getCodUsr());
        
        List<AreaAtuacaoSistema> areaatu = (List<AreaAtuacaoSistema>) session.getAttribute("Area_Atuacao");
        List<Universidade> uni = (List<Universidade>) session.getAttribute("Universidade");
        List<Curso> curso = (List<Curso>) session.getAttribute("Curso");
        List<Empresa> empresa = (List<Empresa>) session.getAttribute("Empresa");
        
        String sCont1 = request.getParameter("Area_Atuacao");
        sCont1 = String.valueOf(sCont1.charAt(0));
        
        String sCont2 = request.getParameter("Universidade");
        sCont2 = String.valueOf(sCont2.charAt(0));
        
        String sCont3 = request.getParameter("Curso");
        sCont3 = String.valueOf(sCont3.charAt(0));
        
        String sCont4 = request.getParameter("Empresa");
        sCont4 = String.valueOf(sCont4.charAt(0));
        //
        int cont1 = Integer.parseInt(sCont1);
        int cont2 = Integer.parseInt(sCont2);
        int cont3 = Integer.parseInt(sCont3);
        int cont4 = Integer.parseInt(sCont4);
        //
        
        
        fa.setCodUniversidade(uni.get(cont2).getCodUniversidade());
        fa.setCodCurso(curso.get(cont3).getCodCurso());
        fa.setCodUsr(u.getCodUsr());
        fa.setSituacao(request.getParameter("Situacao").toString());
        fa.setAnoFormacao(Integer.parseInt(request.getParameter("Ano").toString()));
        fa.setSemestreAtual(Integer.parseInt(request.getParameter("SemAtual").toString()));
        fa.setSemestreFormacao(Integer.parseInt(request.getParameter("SemConc").toString()));
        DAO.FormAcademicaDAO.editar(fa);
        //
        
        exps.setDescricao(request.getParameter("Exp_Desc"));
        exps.setCodEmpresa(empresa.get(cont4).getCodEmpresa());
        DAO.ExpProfSisDAO.editar(exps);
        //
        
        c.setCerficado(request.getParameter("Certficado").toString());
        c.setCodAreaAtuacao(areaatu.get(cont1).getCodAreaAtuacao());
        c.setCodUsr(u.getCodUsr());
        c.setCodExpProf(exps.getCodExpProf());
        DAO.CurriculoDAO.editar(c);
        out.print("Alterado com sucesso!"+"<br/>");
        %>
        <a href="Menu.jsp">Voltar ao Menu</a>
        <%
               }
            
        %>

    </body>
</html>
