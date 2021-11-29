/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4.Bai3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author KyThuat88
 */
public class EmployeeList {
    public static  ArrayList<Employee> employeeList = new ArrayList<Employee>();

    public EmployeeList() {
    }
    
  
    
    
    
    public static void add(){
        Employee employee = new Employee();
        employee.input();
        employeeList.add(employee);
    }
    
    public static int Remove(String ma){
        int q =0;
        for (int i = 0; i < employeeList.size(); i++) {
          if(employeeList.get(i).getMaNv().equals(ma)){
              employeeList.remove(i);
              q=1;
          }
        }
        return q;
    }
    
    public void output(){
        System.out.println("Danh sách");
        for (Employee employee : employeeList) {
            employee.output();
        }
    }
    
    public static void timKiem(){
        Scanner sc = new Scanner(System.in);
        String name;
        name =sc.nextLine();
        Employee em = employeeList.get(0);
        for (int i = 0; i < employeeList.size(); i++) {
            if(employeeList.get(i).getTenNv().equals(name)){
               em = employeeList.get(i);
            }
        }
        System.out.println("Nhân viên cần tìm");
        em.output();
    }
    
        
    
    
   
    
    
}
