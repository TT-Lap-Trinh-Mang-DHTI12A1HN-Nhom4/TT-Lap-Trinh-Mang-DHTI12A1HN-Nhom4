/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4.Bai6.Lifeline;

import java.util.Scanner;

/**
 *
 * @author KyThuat88
 */
public class DoctorDetails {
    private String code;
    private String name;
    private String specialization;
    private int time;

    public DoctorDetails(String code, String name, String specialization, int time) {
        this.code = code;
        this.name = name;
        this.specialization = specialization;
        this.time = time;
    }

    public DoctorDetails() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "DoctorDetails{" + "code=" + code + ", name=" + name + ", specialization=" + specialization + ", time=" + time + '}';
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập code");
        this.code = sc.nextLine();
        System.out.println("Nhập name");
        this.name = sc.nextLine();
        System.out.println("Nhập specialization");
        this.specialization = sc.nextLine();
        System.out.println("Nhập time");
        this.time = sc.nextInt();
    }  
    
    public void output(){
        System.out.println("Code: "+this.code);
        System.out.println("Name: "+this.name);
        System.out.println("Specialization: "+this.specialization);
        System.out.println("Time: "+this.time);
    }
}
