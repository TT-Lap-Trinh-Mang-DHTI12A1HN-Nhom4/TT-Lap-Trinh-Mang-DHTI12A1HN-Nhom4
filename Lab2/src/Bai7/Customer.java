/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2.Bai7;

/**
 *
 * @author KyThuat88
 */
public class Customer extends Person{
    private String tenCty;
    private double tgHDon;

    public Customer(String tenCty, double tgHDon, String hoTen, String diaChi) {
        super(hoTen, diaChi);
        this.tenCty = tenCty;
        this.tgHDon = tgHDon;
    }

    public Customer() {
    }

    public String getTenCty() {
        return tenCty;
    }

    public void setTenCty(String tenCty) {
        this.tenCty = tenCty;
    }

    public double getTgHDon() {
        return tgHDon;
    }

    public void setTgHDon(double tgHDon) {
        this.tgHDon = tgHDon;
    }

    @Override
    public String toString() {
        return super.toString()+" Tên công ty: "+this.tenCty+ " Thông tin hóa đơn: "+this.tgHDon; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
