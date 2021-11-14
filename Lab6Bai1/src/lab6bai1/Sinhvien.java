/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6bai1;

/**
 *
 * @author KyThuat88
 */
public class Sinhvien {
    private String maSV;
    private String hoTen;
    private String email;
    private String diaChi;
    private String msLop;

    public Sinhvien(String maSV, String hoTen, String email, String diaChi, String msLop) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.email = email;
        this.diaChi = diaChi;
        this.msLop = msLop;
    }

    public Sinhvien() {
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getMsLop() {
        return msLop;
    }

    public void setMsLop(String msLop) {
        this.msLop = msLop;
    }

    @Override
    public String toString() {
        return "Sinhvien{" + "maSV=" + maSV + ", hoTen=" + hoTen + ", email=" + email + ", diaChi=" + diaChi + ", msLop=" + msLop + '}';
    }
    
    
}
