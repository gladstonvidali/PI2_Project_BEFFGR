/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.*;
import DB.*;
import Repositorio.*;
import DAO.*;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author gladstonvidali
 */
public class UsuarioServlet1 extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            RepUsuario repUsuario = new RepUsuario();
            List<Usuario> lUs = repUsuario.Buscar(request.getParameter("cpf"));
            Usuario usuario = new Usuario();
            if (request.getParameter("nome") != null ){
                usuario.setNome(request.getParameter("nome"));
                usuario.setSenha(request.getParameter("senha"));
                usuario.setCpf(request.getParameter("cpf"));
                
                if( lUs.isEmpty() == true ){
                    repUsuario.Adicionar(usuario);
                    out.println("<html>");
                    out.println("<head>");
                    out.println("<title>Servlet NewServlet</title>");            
                    out.println("</head>");
                    out.println("<body>");
                    out.println("<h1>Adicionado com sucesso!!</h1>");
                    out.println("</br>");
                    out.println("<a href="+"TelaInicial.jsp"+">Tela Inicial</a>");
                    out.println("</body>");
                    out.println("</html>");
                }else{
                    out.println("<html>");
                    out.println("<head>");
                    out.println("<title>Servlet NewServlet</title>");            
                    out.println("</head>");
                    out.println("<body>");
                    out.println("<h1>CPF já existente</h1>");
                    out.println("</br>");
                    out.println("<a href="+"TelaInicial.jsp"+">Tela Inicial</a>");
                    out.println("</body>");
                    out.println("</html>");
                }
            }
            
        } finally {            
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
