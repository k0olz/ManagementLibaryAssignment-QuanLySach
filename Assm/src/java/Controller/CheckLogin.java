/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import DAO.DataProcess;


/**
 *
 * @author manh
 */
public class CheckLogin {

    public static boolean Login(String name, String pass) {
        boolean status = false;
        try {
            PreparedStatement ps = DAO.DataProcess.getConnection().prepareStatement("select username, passw from Account where username=? and passw=?");

            ps.setString(1, name);
            ps.setString(2, pass);

            ResultSet rs = ps.executeQuery();
            status = rs.next();

        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }
}
