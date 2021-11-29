/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4.Bai3;

import java.util.Scanner;

/**
 *
 * @author KyThuat88
 */
public class Employee {
    private String maNv;
    private String tenNv;
    private String chucVu;
    private double luong;
    private int thoiGianBatDau;

    public Employee(String maNv, String tenNv, String chucVu, double luong, int thoiGianBatDau) {
        this.maNv = maNv;
        this.tenNv = tenNv;
        this.chucVu = chucVu;
        this.luong = luong;
        this.thoiGianBatDau = thoiGianBatDau;
    }

    public Employee() {
    }

    public String getMaNv() {
        return maNv;
    }

    public void setMaNv(String maNv) {
        this.maNv = maNv;
    }

    public String getTenNv() {
        return tenNv;
    }

    public void setTenNv(String tenNv) {
        this.tenNv = tenNv;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public int getThoiGianBatDau() {
        return thoiGianBatDau;
    }

    public void setThoiGíanBatDau(int thoiGíanBatDau) {
        this.thoiGianBatDau = thoiGianBatDau;
    }

    @Override
    public String toString() {
        return "Employee{" + "maNv=" + maNv + ", tenNv=" + tenNv + ", chucVu=" + chucVu + ", luong=" + luong + ", thoiGianBatDau=" + thoiGianBatDau + '}';
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã nv");
        this.maNv = sc.nextLine();
        System.out.println("Nhập tên nv");
        this.tenNv = sc.nextLine();
        System.out.println("Nhập chức vụ");
        this.chucVu = sc.nextLine();
        System.out.println("Nhập luong");
        this.luong = sc.nextDouble();
        System.out.println("Nhập thoi gian bd");
        this.thoiGianBatDau = sc.nextInt();
    }
    
    public void output(){
        System.out.println("Mã: "+this.maNv);
        System.out.println("Tên: "+this.tenNv);
        System.out.println("Chức vụ: "+this.chucVu);
        System.out.println("Lương: "+this.luong);
        System.out.println("Thời gian: "+this.thoiGianBatDau);
    }
    
    
}
