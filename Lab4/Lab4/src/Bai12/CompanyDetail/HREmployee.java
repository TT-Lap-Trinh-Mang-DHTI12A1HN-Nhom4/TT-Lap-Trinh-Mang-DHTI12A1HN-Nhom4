/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4.Bai12.CompanyDetail;

/**
 *
 * @author KyThuat88
 */
public class HREmployee extends Employee{
    private String tenPhongBan, maPhongBan;

    public HREmployee(String tenPhongBan, String maPhongBan, String ten, String ma, String chucVu) {
        super(ten, ma, chucVu);
        this.tenPhongBan = tenPhongBan;
        this.maPhongBan = maPhongBan;
    }

    public HREmployee() {
        
    }

    public String getTenPhongBan() {
        return tenPhongBan;
    }

    public void setTenPhongBan(String tenPhongBan) {
        this.tenPhongBan = tenPhongBan;
    }

    public String getMaPhongBan() {
        return maPhongBan;
    }

    public void setMaPhongBan(String maPhongBan) {
        this.maPhongBan = maPhongBan;
    }

    @Override
    public String toString() {
        return "HREmployee{" + "tenPhongBan=" + tenPhongBan + ", maPhongBan=" + maPhongBan + '}';
    }
    
    
    
}
