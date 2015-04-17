/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpt.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrator
 */
public class SearchById extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws java.sql.SQLException
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SearchByName</title>");            
            out.println("</head>");
            out.println("<body>");
            
            Connection con;
            PreparedStatement ps = null;
            ResultSet rs = null;
            con = DAO.DataProcess.getConnection();
            
            try {
                ps = con.prepareStatement("Select id, name from BookStore where id like ?");
                 String key = request.getParameter("key");
                 ps.setString(1, "%"+ key +"%");
                 rs = ps.executeQuery();
                 //processing
                 while(rs.next()){
                     out.println(rs.getString("id"));
                 }
            } catch (SQLException ex) {
                Logger.getLogger(SearchById.class.getName()).log(Level.SEVERE, null, ex);
            }
           finally{
            DAO.DataProcess.closeAll(con, ps, rs);
        }
            out.println("</body>");
            out.println("</html>");
        }
    }

}
