/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4.Bai3;

import static Lab4.Bai3.EmployeeList.employeeList;
import java.util.Scanner;

/**
 *
 * @author KyThuat88
 */
public class Test {
     
    public static void menu(){
        System.out.println("1: Thêm nhân viên");
        System.out.println("2: Tìm nv theo tên");
        System.out.println("3: Xóa nhân viên khỏi danh sách");
        System.out.println("4: Hiển thị danh sách nv");
        System.out.println("5: Thoát");
    }
    
    public static void main(String[] args) {
        int n= 0;
        Employee em = new Employee();
        EmployeeList employeeList = new EmployeeList();
        Scanner sc = new Scanner(System.in);
        do {     
            menu();
            System.out.println("Nhập lựa chọn");
            n = sc.nextInt();
            switch(n){
                case 1:
//                    System.out.println("Nhập số lượng nv");
//                    int m = sc.nextInt();
//                    for (int i = 0; i < m; i++) {
//                        employeeList.add();
//                    }
                    boolean ipt = true;
                    while (ipt ==true) {
                        employeeList.add();
                        String ck;
                        System.out.print ("Nhap them Y/N?");
                        sc.nextLine();
                        ck = sc.nextLine();
                        if(ck.equalsIgnoreCase("N")){
                            ipt = false;
                            break;
                        }else if(ck.equalsIgnoreCase("Y")){
                            ipt = true;
                        }
                    }
                break;
                case 2:
                    System.out.println("Nhập tên nv cần tìm");
                    employeeList.timKiem();
                break;
                case 3:
                    System.out.println("Nhập mã nhân viên muốn xóa");
                    String ma;
                    sc.nextLine();
                    ma = sc.nextLine();
                    if(employeeList.Remove(ma)>0){
                        System.out.println("Xóa thành cong");
                    }else{
                        System.out.println("Xóa thất bại");
                    }
                break;
                case 4:
                    System.out.println("Danh sách nhân viên");
                    employeeList.output();
                break;
                case 5:
                        
                break;
                case 6:
                    System.out.println("Không có lựa chọn này");
                break;
            }
        } while (n !=5);
    }
}
