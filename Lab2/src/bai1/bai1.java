/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.util.Scanner;

/**
 *
 * @author minhm
 */
class Product {

    private String tenHangHoa;
    private String maHangHoa;
    private int soluong;
    private float giaBan;

    public Product() {
    }

    public Product(String tenHangHoa, String maHangHoa, int soluong, float giaBan) {
        this.tenHangHoa = tenHangHoa;
        this.maHangHoa = maHangHoa;
        this.soluong = soluong;
        this.giaBan = giaBan;
    }

    public String getTenHangHoa() {
        return tenHangHoa;
    }

    public void setTenHangHoa(String tenHangHoa) {
        this.tenHangHoa = tenHangHoa;
    }

    public String getMaHangHoa() {
        return maHangHoa;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.maHangHoa = nhaSanXuat;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public float getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(float giaBan) {
        this.giaBan = giaBan;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ma hang hoa:");
        maHangHoa = sc.nextLine();
        System.out.print("Ten hang hoa:");
        tenHangHoa = sc.nextLine();
        System.out.print("So luong:");
        soluong = sc.nextInt();
        System.out.print("Gia ban 1 san pham:");
        giaBan = sc.nextFloat();

    }

    public void hienthi() {
        System.out.print("Ma hang hoa:" + maHangHoa);
        System.out.print("\nTen hang hoa:" + tenHangHoa);
        System.out.print("\nSo luong:" + soluong);
        System.out.print("\nGia ban 1 san pham:" + giaBan);
        System.out.println("");
    }

    @Override
    public String toString() {
        return "Product{" + "maHH=" + maHangHoa + ", tenHH=" + tenHangHoa + ", soLuong=" + soluong + ", gia1SP=" + giaBan + '}';
    }

    public void sort(Product[] b) {
        for (int i = 0; i < b.length - 1; i++) {
            for (int j = i + 1; j < b.length; j++) {
                if (b[i].giaBan > b[j].giaBan) {
                    Product tem = b[i];
                    b[i] = b[j];
                    b[j] = tem;
                }
            }
        }
    }
}

class ProductMenu {

    static void menu() {
        System.out.println("--------------------MENU--------------------");
        System.out.println("1. Nhập thông tin cho n sản phẩm\n"
                + "2. Hiển thị thông tin vừa nhập\n"
                + "3. Sắp xếp thông tin giảm dần theo giá và hiển thị\n"
                + "4. Thoát ");
        System.out.println("--------------------------------------------");
    }

    public static void main(String[] args) {
        int n = 0;
        Product a = new Product();
        Product[] product = null;
        do {
            menu();
            System.out.print("Nhap vao lua chon cua ban :");
            Scanner sc = new Scanner(System.in);
            n = Integer.parseInt(sc.nextLine());
            switch (n) {
                case 1: {
                    int m;
                    System.out.print("Nhap vao n :");
                    m = Integer.parseInt(sc.nextLine());
                    product = new Product[m];
                    for (int i = 0; i < m; i++) {
                        product[i] = new Product();
                        product[i].nhap();
                    }
                    break;
                }
                case 2: {
                    if (product == null) {
                        System.out.println("ban chua nhap du lieu");
                    } else {
                        System.out.println("du lieu ban vua nhap la :");
                        for (int i = 0; i < product.length; i++) {
                            System.out.println("thong tin hang hoa thu " + (i + 1));
                            product[i].hienthi();
                        }
                    }
                    break;
                }
                case 3: {
                    if (product == null) {
                        System.out.println("ban chua nhap du lieu");
                    } else {
                        a.sort(product);
                        System.out.println("du lieu sau khi sap xep la :");
                        for (int i = 0; i < product.length; i++) {
                            System.out.println("thong tin hang hoa thu " + (i + 1));
                            product[i].hienthi();
                        }
                    }
                    break;
                }
                case 4:
                    break;
                default: {
                    System.out.println("khong co lua chon cua ban ");
                    break;
                }
            }
        } while (n != 4);
    }
}
