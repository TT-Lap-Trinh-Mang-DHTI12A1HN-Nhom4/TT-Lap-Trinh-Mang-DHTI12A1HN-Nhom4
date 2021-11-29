/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2.Bai6;

import Lab2.Bai5.Bao;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author KyThuat88
 */
public class KhachHang {
    private String maKH;
    private String hotenKH;
    private int soLuong;
    private double dongia;
    private double thanhtien;
    private Date ngayHD;

    public KhachHang(String maKH, String hotenKH, int soLuong, double dongia, double thanhtien, Date ngayHD) {
        this.maKH = maKH;
        this.hotenKH = hotenKH;
        this.soLuong = soLuong;
        this.dongia = dongia;
        this.thanhtien = thanhtien;
        this.ngayHD = ngayHD;
    }

    public KhachHang() {
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getHotenKH() {
        return hotenKH;
    }

    public void setHotenKH(String hotenKH) {
        this.hotenKH = hotenKH;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getDongia() {
        return dongia;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }

    public double getThanhtien() {
        return thanhtien;
    }

    public void setThanhtien(double thanhtien) {
        this.thanhtien = thanhtien;
    }

    public Date getNgayHD() {
        return ngayHD;
    }

    public void setNgayHD(Date ngayHD) {
        this.ngayHD = ngayHD;
    }
    
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã khác hàng ");
        this.maKH = sc.nextLine();
        System.out.println("Nhập họ tên khách hàng ");
        this.hotenKH = sc.nextLine();
        System.out.println("Nhập số lượng tiêu thụ ");
        this.soLuong = sc.nextInt();
        System.out.println("Nhập đơn giá ");
        this.dongia = sc.nextDouble();
        sc.nextLine();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Nhập ngày thanh toán(dd/MM/yyyy):");
        String cinput = sc.nextLine();
        if(null != cinput && cinput.trim().length() > 0){
            try {
                this.ngayHD = format.parse(cinput);
            } catch (ParseException ex) {
                Logger.getLogger(Bao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    private String convertDateToString(Date ngayPhatHanh) {
        return new SimpleDateFormat("dd/MM/yyyy").format(ngayPhatHanh);
    }
    
    public void output(){
        System.out.println("Mã khách hàng: "+this.maKH);
        System.out.println("Tên khách hàng: "+this.hotenKH);
        System.out.println("Số lượng tiêu thụ: "+this.soLuong);
        System.out.println("Đơn giá: "+this.dongia);
        System.out.println("Ngày thanh toán: "+convertDateToString(this.ngayHD));
    }
//    
//    public static void main(String[] args) {
//        KhachHang k = new KhachHang();
//        k.input();
//        k.output();
//    }
    
    
}
