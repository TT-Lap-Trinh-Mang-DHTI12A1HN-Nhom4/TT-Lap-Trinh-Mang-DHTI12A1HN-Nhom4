/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2.Bai7;

import Lab2.Bai6.KhachNuocNgoai;
import Lab2.Bai6.KhachVietNam;
import java.util.Scanner;

/**
 *
 * @author KyThuat88
 */
public class KiemNghiem {
    Customer customer = new Customer();
    Employee employee = new Employee();
    Student student = new Student();
    
    Person[] person = new Person[10];

    public KiemNghiem() {
    }
    
    
    
    
    public static  void menu(){
        System.out.println("1: Nhập thông tin");
        System.out.println("2: Xuất thông tin");
    }
    
    public static void menuItem(){
        System.out.println("1: Nhập danh sách Student");
        System.out.println("2: Nhập danh sách Customer");
        System.out.println("3: Nhập danh sách Employee");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        
    }
}
