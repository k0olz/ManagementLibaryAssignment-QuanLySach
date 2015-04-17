/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpt.login;

import Controller.BookDAO;
import bean.Book;
import bean.BookCartView;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class showCart extends HttpServlet {

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
        HttpSession session = request.getSession();
        HashMap<String,Integer> listBorrow = (HashMap<String,Integer>)session.getAttribute("listBorrows");
        
        //collection chua ma sach  va so luong sach
        if (listBorrow!=null) {
            //khoi tao danh sach de luu thong tin
            List<BookCartView> listCartView =  new ArrayList<BookCartView>();
            
             Set<String> listKey = listBorrow.keySet();//list borrow là kiểu map nên phải duyệt theo cách này
            Iterator<String> it = listKey.iterator();
            BookDAO bookDAO = new BookDAO();
        
        while (it.hasNext()) {
            String id = it.next();
            
            Book b = bookDAO.getBookById(id);
            
            BookCartView bookView = new BookCartView();
            
            bookView.setId(b.getId());
            bookView.setName(b.getName());
            bookView.setAuthor(b.getAuthor());
            bookView.setPrice(b.getPrice());
            bookView.setTotal(listBorrow.get(id));
            bookView.setTotalPaid(bookView.getPrice()* bookView.getTotal());
            
            listCartView.add(bookView);
        }
            request.setAttribute("listView", listCartView);
            request.getRequestDispatcher("ViewCart.jsp").forward(request, response);
        }else{
            //gio hang k co san pham quay lai trang home.jsp
            request.getRequestDispatcher("home.jsp").forward(request, response);
        }
        
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
