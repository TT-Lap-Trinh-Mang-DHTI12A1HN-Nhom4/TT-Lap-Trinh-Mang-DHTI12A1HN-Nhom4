/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2.Bai6;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author KyThuat88
 */
public class KhachVietNam extends KhachHang{
    private String loạiKH;
    private int dinhMuc;

    public KhachVietNam(String loạiKH, int dinhMuc, String maKH, String hotenKH, int soLuong, double dongia, double thanhtien, Date ngayHD) {
        super(maKH, hotenKH, soLuong, dongia, thanhtien, ngayHD);
        this.loạiKH = loạiKH;
        this.dinhMuc = dinhMuc;
    }

    public KhachVietNam() {
    }

    public String getLoạiKH() {
        return loạiKH;
    }

    public void setLoạiKH(String loạiKH) {
        this.loạiKH = loạiKH;
    }

    public int getDinhMuc() {
        return dinhMuc;
    }

    public void setDinhMuc(int dinhMuc) {
        this.dinhMuc = dinhMuc;
    }
    
    public double thanhTien(KhachVietNam vn){
        double tien = 0;
        vn.setThanhtien(0);
        if(vn.getSoLuong() <= vn.getDinhMuc()){
            vn.setThanhtien(vn.getSoLuong()*vn.getDongia());
        }else{
            vn.setThanhtien((vn.getSoLuong()* vn.getDongia()* vn.getDinhMuc()) + ((vn.getSoLuong()-vn.getDinhMuc())*vn.getDongia()*2.5));
        }
        return vn.getThanhtien();
    }

    @Override
    public void input() {
        super.input(); //To change body of generated methods, choose Tools | Templates.
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập loại khách hàng ");
        this.loạiKH = sc.nextLine();
        System.out.println("Nhập định mức");
        this.dinhMuc = sc.nextInt();
    }

    @Override
    public void output() {
        super.output(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Loại khách hàng: "+this.loạiKH);
        System.out.println("Thành tiền: "+thanhTien(this));
    }
    
//    public static void main(String[] args) {
//        KhachVietNam vn = new KhachVietNam();
//        vn.input();
//        vn.output();
//    }
    
    
    
    
    
}
