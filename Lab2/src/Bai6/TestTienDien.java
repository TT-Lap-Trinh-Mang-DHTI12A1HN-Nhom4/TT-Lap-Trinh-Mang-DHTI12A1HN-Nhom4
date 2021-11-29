/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2.Bai6;

import java.util.Scanner;

/**
 *
 * @author KyThuat88
 */
public class TestTienDien {
    KhachNuocNgoai khnn = new KhachNuocNgoai();
    KhachVietNam khvn = new KhachVietNam();
    
    KhachNuocNgoai[] arrnn;
    KhachVietNam[] arrvn;
    
    public void menu(){
        System.out.println("1: Nhập danh sách khách Việt Nam");
        System.out.println("2: Nhập danh sách khách nước ngoài");
        System.out.println("3: Xuât danh sách");
        System.out.println("4: Tính tổng số điện tiêu thụ");
        System.out.println("5: Tính trung bình cộng");
        System.out.println("6: Kết thúc");
    }
    
    public void Chuongtrinh(){
        Scanner sc = new Scanner(System.in);
        int selectedValue;
        do {
            menu();
            System.out.println("Bạn chọn: ");
            selectedValue = sc.nextInt();
            switch(selectedValue){
            case 1:
                System.out.println("Nhập số lượng khách Việt Nam");
                int m = sc.nextInt();
                arrvn = new KhachVietNam[m];
                for (int i = 0; i < m; i++) {
                    System.out.println("Nhập thông tin khách hàng thứ: "+i);
                    arrvn[i] = new KhachVietNam();
                    arrvn[i].input();
                }
                break;
            case 2:
                System.out.println("Nhập số lượng khách ngước ngoài");
                int p = sc.nextInt();
                arrnn = new KhachNuocNgoai[p];
                for (int i = 0; i < p; i++) {
                    System.out.println("Nhập thông tin khách hàng thứ: "+i);
                    arrnn[i] = new KhachNuocNgoai();
                    arrnn[i].input();
                }
                break;
            case 3:
                System.out.println("Thông tin danh sách khách nước ngoài");
                    for (int i = 0; i < arrnn.length; i++) {
                        arrnn[i].output();
                    }
                    System.out.println("---------------------------------");
                    System.out.println("Thông tin danh sách khách Việt Nam");
                    for (int i = 0; i < arrvn.length; i++) {
                        arrvn[i].output();
                    }
                    System.out.println("---------------------------------");
                    break;
            case 4:
                tinhTong(arrnn, arrvn);
                break;
            case 5:
                trungBinhThanhTien(arrnn);
                break;
            default:
                System.out.println("Không có lựa chọn nào");
                break;
        }
       } while (selectedValue!=5);
    }
    
    public  void tinhTong(KhachNuocNgoai[] arrnn, KhachVietNam[] arrvn){
        double tongnn = 0;
        double tongvn = 0;
        for (int i = 0; i < arrnn.length; i++) {
            tongnn += arrnn[i].getSoLuong();
        }
        if(arrvn.length != 0){
            System.out.println("Tông số lượng điện tiêu thụ khách nước ngoài: "+tongnn);
            for (int i = 0; i < arrvn.length; i++) {
                tongvn += arrvn[i].getSoLuong();
            }
            System.out.println("Tông số lượng điện tiêu thụ khách Việt Nam: "+tongvn);
        }
        
    }
    
    public void trungBinhThanhTien(KhachNuocNgoai[] arrnn){
        int max = arrnn.length; 
        double tong = 0;
        for (int i = 0; i < this.arrnn.length; i++) {
            tong += arrnn[i].getThanhtien();
        }
        System.out.println("Trung bình cộng thành tiền khách nước ngoài: "+(tong/max));
    }
    
    
    public static void main(String[] args) {
        TestTienDien test = new TestTienDien();
        test.Chuongtrinh();
        
        
    }
    
}
