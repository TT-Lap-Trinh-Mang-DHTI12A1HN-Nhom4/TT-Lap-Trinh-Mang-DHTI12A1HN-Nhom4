/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6bai1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author KyThuat88
 */
public class Lab6Bai1 {

    Connection cn=null;
    public Connection getConnection() {
        String url="jdbc:mysql://localhost/qlsv";
        try { 
            this.cn= DriverManager.getConnection(url, "root", "");
            System.out.println("Kết nối thành công");
        } catch (SQLException ex) {
            Logger.getLogger(Lab6Bai1.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
//            try {
//                cn.close();
//                System.out.println("Đóng kết nối");
//            } catch (SQLException ex) {
//                Logger.getLogger(Lab6Bai1.class.getName()).log(Level.SEVERE, null, ex);
//            }
        }
        return cn;
    }
    

    public static void main(String[] args) throws SQLException, ClassNotFoundException{
       Lab6Bai1 test= new Lab6Bai1();
       test.getConnection();
    }
    
}
