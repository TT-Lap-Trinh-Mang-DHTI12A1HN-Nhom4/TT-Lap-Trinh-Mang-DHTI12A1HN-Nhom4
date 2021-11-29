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
public class Employee extends Person{
    private double heSoLuong;

    public Employee(double heSoLuong, String hoTen, String diaChi) {
        super(hoTen, diaChi);
        this.heSoLuong = heSoLuong;
    }

    public Employee() {
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    @Override
    public String toString() {
        return super.toString()+" Hệ số lương: "+this.heSoLuong; //To change body of generated methods, choose Tools | Templates.
    }
    
    public double tinhLuong(){
        return 0;
    }
    
    public String danhGia(){
        return null;
    }

    
    
}
