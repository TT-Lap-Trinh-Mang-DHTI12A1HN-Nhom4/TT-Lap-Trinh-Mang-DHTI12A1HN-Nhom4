/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4.Bai6.Lifeline.Demo;

import Lab4.Bai6.Lifeline.DoctorDetails;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author KyThuat88
 */
public class DoctorHash {
    Scanner sc = new Scanner(System.in);
    static HashMap<String, DoctorDetails> doctorHashmap = new HashMap<>();

    public DoctorHash() {
    }
    
    public void add(){
        
        System.out.println("Nhập số lượng doctor");
        int n;
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            DoctorDetails doctor = new DoctorDetails();
            doctor.input();
            doctorHashmap.put(doctor.getCode(), doctor);
        }
    }
    
    public  void display(){
        System.out.println("Danh sách doctor");
        Iterator<String> iterator = doctorHashmap.keySet().iterator();
        while(iterator.hasNext()){
            System.out.println(doctorHashmap.get(iterator.next()));
        }
    }
    
    public void timkiem(){
        String code;
        sc.nextLine();
        System.out.println("Nhập code doctor");
        code = sc.nextLine();
        if(doctorHashmap.containsKey(code)==false)  {
            System.out.println("Không tìm thấy dữ liệu!");
        }else{
            System.out.println("Thông tin bác sỹ tìm thấy:");
            System.out.println(doctorHashmap.get(code).toString());
        }
    }
        
}
