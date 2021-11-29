/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4.Bai4;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author KyThuat88
 */
public class EmployeeList {
    public static LinkedList<Employee> employeeList = new LinkedList<Employee>();
    
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
    
    public void output2(){
        System.out.println("Danh sách");
        Iterator<Employee> list = employeeList.iterator();
        while(list.hasNext()){
            System.out.println(list.next());
        }
    }
    
    public static void timKiem(){
        Scanner sc = new Scanner(System.in);
        String nameString;
        nameString = sc.nextLine();
        Employee em = employeeList.get(0);
        for (int i = 0; i < employeeList.size(); i++) {
            if(employeeList.get(i).getTenNv().equals(nameString)){
               em = employeeList.get(i);
            }
        }
        System.out.println("Nhân viên cần tìm");
        em.output();
    }
    
    
    
}
