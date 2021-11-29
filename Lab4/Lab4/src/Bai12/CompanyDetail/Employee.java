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
public class Employee {
    private String ten, ma, chucVu;

    public Employee(String ten, String ma, String chucVu) {
        this.ten = ten;
        this.ma = ma;
        this.chucVu = chucVu;
    }

    public Employee() {
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    @Override
    public String toString() {
        return "Employee{" + "ten=" + ten + ", ma=" + ma + ", chucVu=" + chucVu + '}';
    }
    
}
