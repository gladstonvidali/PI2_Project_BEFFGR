<%-- 
    Document   : cadCurriculo
    Created on : Nov 15, 2012, 4:06:08 PM
    Author     : gladstonvidali
--%>

<%@page import="java.util.List"%>
<%@page import="DB.*" %>
<%@page import="DAO.*" %>
<%@page import="Repositorio.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        Usuario u = (Usuario) session.getAttribute("pUsuario");
        
        RepExpProfSistema repExpProfSistema = new RepExpProfSistema();
        RepAreaAtuacao repAreaAtuacao = new RepAreaAtuacao();
        RepCurso repCurso = new RepCurso();
        RepUniversidade repUniversidade = new RepUniversidade();
        RepEmpresa repEmpresa = new RepEmpresa();
        RepFormacaoAcademica repFormacaoAcademica = new RepFormacaoAcademica();
        RepCurriculo repCurriculo = new RepCurriculo();
        //
       if ( repFormacaoAcademica.BuscarCodUsr(u.getCodUsr()).isEmpty() == true){
        /*
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
        repFormacaoAcademica.Adicionar(fa);
        //
        
        exps.setDescricao(request.getParameter("Exp_Desc"));
        exps.setCodEmpresa(empresa.get(cont4).getCodEmpresa());
        exps.setCodUsr(u.getCodUsr());
        repExpProfSistema.Adicionar(exps);
        //
        c.setCerficado(request.getParameter("Certficado").toString());
        c.setCodAreaAtuacao(areaatu.get(cont1).getCodAreaAtuacao());
        c.setCodUsr(u.getCodUsr());
        c.setCodExpProf(exps.getCodExpProf());
        repCurriculo.Adicionar(c);
        
         out.print("Adicionado com sucesso!"+"<br/>");
 *       */
        %>
        <a href="Menu.jsp">Voltar ao Menu</a>
        <%
        
        }else{
    
        FormacaoAcademica fa = repFormacaoAcademica.BuscarCodUsr(u.getCodUsr()).get(0);
        Curriculo c = repCurriculo.BuscarCodUsr(u.getCodUsr()).get(0);
        ExpProfSistema exps = repExpProfSistema.BuscarCodUsr(u.getCodUsr()).get(0);
        /*
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
        repFormacaoAcademica.Adicionar(fa);
        //
        
        exps.setDescricao(request.getParameter("Exp_Desc"));
        exps.setCodEmpresa(empresa.get(cont4).getCodEmpresa());
        repExpProfSistema.Adicionar(exps);
        //
        
        c.setCerficado(request.getParameter("Certficado").toString());
        c.setCodAreaAtuacao(areaatu.get(cont1).getCodAreaAtuacao());
        c.setCodUsr(u.getCodUsr());
        c.setCodExpProf(exps.getCodExpProf());
        repCurriculo.Adicionar(c);
        
        out.print("Alterado com sucesso!"+"<br/>");
 *      */
        %>
        <a href="Menu.jsp">Voltar ao Menu</a>
        <%
          }
            
        %>

    </body>
</html>
