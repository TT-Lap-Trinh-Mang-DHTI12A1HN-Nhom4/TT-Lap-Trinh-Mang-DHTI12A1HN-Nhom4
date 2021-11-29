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
public class Person {
    private String hoTen;
    private String diaChi;

    public Person(String hoTen, String diaChi) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
    }

    public Person() {
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "Person{" + "hoTen=" + hoTen + ", diaChi=" + diaChi + '}';
    }
    
    
}
