/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4.Bai6.Lifeline.Demo;

import java.util.Scanner;

/**
 *
 * @author KyThuat88
 */
public class Test {
    public static void menu(){
        System.out.println("1: Nhập danh sách doctor");
        System.out.println("2: Tìm doctor theo code");
        System.out.println("3: Xuất danh sách");
    }
    
    public static void main(String[] args) {
        int n = 0;
        DoctorHash dc = new DoctorHash();
        Scanner sc = new Scanner(System.in);
        do {            
            System.out.println("Nhập luwajc chọn");
            n = sc.nextInt();
            if(n == 1){
                dc.add();
            }else if(n == 2){
                dc.timkiem();
            }else if(n ==3){
              dc.display();
            }else{
                System.out.println("Không có lựa chọn này");
            }
        } while (n != 3);
    }
}
