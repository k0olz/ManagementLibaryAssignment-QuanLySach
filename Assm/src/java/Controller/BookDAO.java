/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import bean.Book;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class BookDAO {
    public  List<Book> getAllBook(){
        List<Book> list = new ArrayList<>();
        Connection con;
        PreparedStatement ps = null;
        ResultSet rs = null;
        con = DAO.DataProcess.getConnection();
        
        try {
            ps = con.prepareStatement("Select * from BookStore");
            rs = ps.executeQuery();
            while(rs.next()){
                Book book = new Book();
                book.setId(rs.getString(1));
                book.setName(rs.getString(2));
                book.setAuthor(rs.getString(3));
                book.setPrice(rs.getFloat(4));
                book.setDescription(rs.getString(5));
                book.setImg(rs.getString(6));
                list.add(book);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BookDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            DAO.DataProcess.closeAll(con, ps, rs);
        }
        return list;
    }
    
    
}
