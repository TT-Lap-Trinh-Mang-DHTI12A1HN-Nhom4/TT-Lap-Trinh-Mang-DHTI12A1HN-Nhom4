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
public class KhachNuocNgoai extends KhachHang{
    private String quocTich;

    public KhachNuocNgoai(String quocTich, String maKH, String hotenKH, int soLuong, double dongia, double thanhtien, Date ngayHD) {
        super(maKH, hotenKH, soLuong, dongia, thanhtien, ngayHD);
        this.quocTich = quocTich;
    }

    public KhachNuocNgoai() {
    }

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }
    
    public double thanhTien(KhachNuocNgoai nn){
        return (nn.getSoLuong()*nn.getDongia());
    }

    @Override
    public void input() {
        super.input(); //To change body of generated methods, choose Tools | Templates.
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập quốc tịch");
        this.quocTich = sc.nextLine();
    }

    @Override
    public void output() {
        super.output(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Quốc tịch: "+this.quocTich);
        System.out.println("Thành tiền: "+thanhTien(this));
    }
    
    
    
    
}
