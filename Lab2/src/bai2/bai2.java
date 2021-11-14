/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author minhm
 */
class Product {

    String maHH;
    String tenHH;
    float soLuong;
    float gia1SP;

    public Product() {
    }

    public Product(String maHH, String tenHH, float soLuong, float gia1SP) {
        this.maHH = maHH;
        this.tenHH = tenHH;
        this.soLuong = soLuong;
        this.gia1SP = gia1SP;
    }

    public String getMaHH() {
        return maHH;
    }

    public void setMaHH(String maHH) {
        this.maHH = maHH;
    }

    public String getTenHH() {
        return tenHH;
    }

    public void setTenHH(String tenHH) {
        this.tenHH = tenHH;
    }

    public float getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(float soLuong) {
        this.soLuong = soLuong;
    }

    public float getGia1SP() {
        return gia1SP;
    }

    public void setGia1SP(float gia1SP) {
        this.gia1SP = gia1SP;
    }

    @Override
    public String toString() {
        return "Product{" + "maHH=" + maHH + ", tenHH=" + tenHH + ", soLuong=" + soLuong + ", gia1SP=" + gia1SP + '}';
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Ma hang hoa:");
        maHH = sc.nextLine();
        System.out.print(" Ten hang hoa:");
        tenHH = sc.nextLine();
        System.out.print(" So luong:");
        soLuong = sc.nextFloat();
        System.out.print(" Gia ban 1 san pham:");
        gia1SP = sc.nextFloat();

    }

    public void hienthi() {
        System.out.print(" Ma hang hoa:" + maHH);
        System.out.print("\n Ten hang hoa:" + tenHH);
        System.out.print("\n So luong:" + soLuong);
        System.out.print("\n Gia ban 1 san pham:" + gia1SP);
    }

}

class TestProduct {

    public static void main(String[] args) {
        int n = 0;
        ArrayList<Product> arrlist = new ArrayList<Product>();
        Scanner sc = new Scanner(System.in);
        int m;
        System.out.print("Nhap vao n :");
        m = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < m; i++) {
            Product pro = new Product();
            System.out.println("Nhap thong tin hang hoa thu " + i + 1);
            pro.nhap();
            arrlist.add(pro);
        }
        System.out.println("------------------------------------------");
        System.out.println("Danh sach hang hoa: ");
        for (Product pr : arrlist) {
            pr.hienthi();
        }

        float max = 0;
        for (Product pr : arrlist) {
            if (max < pr.getGia1SP()) {
                max = pr.getGia1SP();
            }
        }
        System.out.println("------------------------------------------");
        System.out.println("\nthong tin mat hang co gia cao nhat la :");
        for (Product pr : arrlist) {
            if (pr.getGia1SP() == max) {
                pr.hienthi();
            }
        }

        Collections.sort(arrlist, new Comparator<Product>() {
            public int compare(Product pr1, Product pr2) {
                if (pr1.getGia1SP() < pr2.getGia1SP()) {
                    return 1;
                } else {
                    if (pr1.getGia1SP() == pr2.getGia1SP()) {
                        return 0;
                    } else {
                        return -1;
                    }
                }
            }
        });
        System.out.println("\ndanh sach duoc sap xep giam dan theo gia la:");
        int i = 1;
        for (Product pr : arrlist) {
            System.out.println("san pham thu :" + (i));
            pr.hienthi();
            i++;
        }
        for (Product pr : arrlist) {
            if (pr.getTenHH().equals("sữa") || pr.getTenHH().equals("SỮA")) {
                pr.hienthi();
            }
        }
    }
}
