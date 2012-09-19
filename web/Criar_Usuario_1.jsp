
<%@page import="Map.Usuario"%>
<%@page import="org.hibernate.Session"%>
<%@page import="org.hibernate.cfg.Configuration"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastrando...</title>
    </head>
    <body>
        <h1>Cadastrando usuário no sistema.</h1>
        <%
        /*
        Usuario user = new Usuario();
        user.setNome(request.getParameter("nome").toString());
        user.setSenha(request.getParameter("senha").toString());
        user.setCpf(session.getAttribute("usuario").toString());
        user.setCodCv(Integer.parseInt(request.getParameter("Area_Atuacao").toString()));
        user.setCodFa(Integer.parseInt(request.getParameter("Universidade").toString()));
        */ 
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session s = sessionFactory.openSession();
        s.beginTransaction();
        s.createSQLQuery("UPDATE usuario SET "
            + "nome='"+request.getParameter("nome").toString()+"', "              
            + "senha='"+request.getParameter("senha").toString()+"', "               
            + "codFA='"+request.getParameter("Universidade").toString()+"' "
            + "WHERE CPF='"+session.getAttribute("usuario").toString()+"'").executeUpdate();
        s.getTransaction().commit();
        s.close();
      %>
      <jsp:forward page="Menu.jsp"/>
    </body>
</html>
