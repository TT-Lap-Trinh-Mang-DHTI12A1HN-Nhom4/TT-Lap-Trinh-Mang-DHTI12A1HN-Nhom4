/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6bai1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author KyThuat88
 */
public class Test {
    private Connection conn;
    private PreparedStatement stmt = null;
    private ResultSet rs = null;
    
    static ArrayList<Sinhvien> sinhvienList;
    
    public ArrayList<Sinhvien> getList() {   
        Lab6Bai1 data = new Lab6Bai1();
        conn = data.getConnection();
        sinhvienList = new ArrayList<Sinhvien>();
        PreparedStatement ps = null;
        String sql = "select * from sinhvien";
        ResultSet rs = null;
        try {
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                String maSV = rs.getString("maSV");
                String hoTen = rs.getString("hoTen");
                String email = rs.getString("email");
                String diaChi = rs.getString("diaChi");
                String msLop = rs.getString("msLop");
                sinhvienList.add(new Sinhvien(maSV, hoTen, email, diaChi, msLop));
            
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sinhvienList;
    }
    
    public static void main(String[] args) {
        Test t1 = new Test();
        System.out.println("Danh sách");
        sinhvienList =  t1.getList();
        for (int i = 0; i < sinhvienList.size(); i++) {
            System.out.println(sinhvienList.get(i).getHoTen());
        }
    }
}
