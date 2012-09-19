
<%@page import="org.hibernate.Query"%>
<%@page import="Map.Usuario"%>
<%@page import="org.hibernate.Session"%>
<%@page import="org.hibernate.cfg.Configuration"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@page import="java.util.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Verificando informações</title>
    </head>
    <body>
        <%
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session s = sessionFactory.openSession();
        
        s.beginTransaction();
        String hql = "SELECT u.CPF FROM Usuario u WHERE u.CPF='"+request.getParameter("usuario")+"'";
        String hql1 = "SELECT u.Senha FROM Usuario u WHERE u.Senha='"+request.getParameter("senha")+"'";
        Query query = s.createSQLQuery(hql);
        Query query1 = s.createSQLQuery(hql1);
        List results = query.list();
        List results1 = query1.list();
        
        if (!results.isEmpty() && !results1.isEmpty()) 
        {
            s.close();
            %>
                <jsp:forward page="Menu.jsp"/>
            <%
        }
        else
        {
            s.close();
            %>
                <jsp:forward page="TelaInicial.jsp"/>
            <%
        }
        
      %>   
    </body>
</html>
