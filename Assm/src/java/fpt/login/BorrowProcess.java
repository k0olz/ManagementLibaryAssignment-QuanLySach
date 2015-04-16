/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpt.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Administrator
 */
@WebServlet(name = "BorrowProcess", urlPatterns = {"/BorrowProcess"})
public class BorrowProcess extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String id = request.getParameter("id");
        Integer numberOfBook = Integer.parseInt(request.getParameter("number"));
        
        //not validate data input
        HttpSession session = request.getSession();
        HashMap<String,Integer> listBorrow = (HashMap<String, Integer>)session.getAttribute("listBorrow");
        
        if (listBorrow ==null) {
            //chua co quyen nao
            listBorrow = new HashMap<>();
            listBorrow.put(id, numberOfBook);
        }else{
            //da duoc chon thue
            Set<String> lsId = listBorrow.keySet();
            Iterator<String> it = lsId.iterator();
            while (it.hasNext()) {
                String idChosen = it.next();
                if (idChosen.equals(id)) {
                    Integer numberChosen = listBorrow.get(idChosen) +numberOfBook;
                    listBorrow.remove(idChosen);
                    listBorrow.put(idChosen , numberChosen);
                    
                }
                
            }
        }
        session.setAttribute("listBorrow", listBorrow);
        request.getRequestDispatcher("LoadBook").forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
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
     * Handles the HTTP <code>POST</code> method.
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
