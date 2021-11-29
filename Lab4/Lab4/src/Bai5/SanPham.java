/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4.Bai5;

import java.util.Scanner;

/**
 *
 * @author KyThuat88
 */
public class SanPham {
    private String masp;
    private String tensp;

    public SanPham(String masp, String tensp) {
        this.masp = masp;
        this.tensp = tensp;
    }

    public SanPham() {
    }

    public String getMasp() {
        return masp;
    }

    public void setMasp(String masp) {
        this.masp = masp;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    @Override
    public String toString() {
        return "SanPham{" + "masp=" + masp + ", tensp=" + tensp + '}';
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã sp");
        this.masp = sc.nextLine();
        System.out.println("Nhập tên sp");
        this.tensp = sc.nextLine();
    }
    
    public void output(){
        System.out.println("Mã sp: "+this.masp);
        System.out.println("Tên sp: "+this.tensp);
    }
}
