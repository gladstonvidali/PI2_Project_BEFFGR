<%-- 
    Document   : Criar_Usuario
    Created on : Sep 16, 2012, 4:40:19 PM
    Author     : Gladston
--%>

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
        
        Usuario user = new Usuario();
        user.setNome(request.getParameter("nome").toString());
        user.setSenha(request.getParameter("senha").toString());
        user.setCpf(request.getParameter("cpf").toString());
        user.setCodCv(0);
        user.setCodFa(Integer.parseInt(request.getParameter("Universidade").toString()));
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session s = sessionFactory.openSession();
        s.beginTransaction();
        s.save(user);
        s.getTransaction().commit();
        
      %>
      <jsp:forward page="TelaInicial.jsp"/>
    </body>
</html>
