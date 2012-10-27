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
import JPA2.*;
import DAO.*;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author gladstonvidali
 */
public class EditarCadastro extends HttpServlet {

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
        
            javax.servlet.http.HttpSession session = request.getSession();
            Usuario usuario = new Usuario();
            usuario.setCpf(session.getAttribute("cpf").toString());
            usuario.setNome(request.getParameter("nome").toString());
            usuario.setSenha(request.getParameter("senha").toString());
            UsuarioDAO.inserir(usuario);
            
               
            String sair = "<a href="+"Menu.jsp"+">Menu</a>";
            /* TODO output your page here. You may use following sample code. */
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Usuário inserido com sucesso!</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<hr />");
            /*
            List<Usuario> listaUsuarios = UsuarioDAO.listarUsuarios();
            for (Usuario u1 : listaUsuarios) {
                out.println("<h3> - " + u1.getNome() + "</h3>");
            }
            */
            out.println("</body>");
            out.println("</html>");
            out.println(sair);
                  
            out.close();
        
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
