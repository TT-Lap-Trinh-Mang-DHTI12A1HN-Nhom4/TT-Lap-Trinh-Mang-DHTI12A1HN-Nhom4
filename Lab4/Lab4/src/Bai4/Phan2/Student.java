/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4.Bai4.Phan2;

import java.util.Scanner;

/**
 *
 * @author KyThuat88
 */
public class Student implements Comparable<Student>{
    private String name;
    private int age;
    private String address;

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public Student() {
        
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", age=" + age + ", address=" + address + '}';
    }
    
    
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên");
        this.name = sc.nextLine();
        System.out.println("Nhập tuổi");
        this.age = sc.nextInt();
        System.out.println("Nhập địa chỉ");
        this.address = sc.nextLine();  
    }
    
    public void output(){
        System.out.println("Tên: "+this.name);
        System.out.println("Tuổi: "+this.age);
        System.out.println("Địa chỉ: "+this.address);
    }

    @Override
    public int compareTo(Student o) {
       return this.getName().compareTo(o.getName());
    }
}
