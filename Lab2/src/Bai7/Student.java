/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2.Bai7;

/**
 *
 * @author KyThuat88
 */
public class Student extends Person{
    private double mh1;
    private double mh2;

    public Student(double mh1, double mh2, String hoTen, String diaChi) {
        super(hoTen, diaChi);
        this.mh1 = mh1;
        this.mh2 = mh2;
    }

    public Student() {
    }

    public double getMh1() {
        return mh1;
    }

    public void setMh1(double mh1) {
        this.mh1 = mh1;
    }

    public double getMh2() {
        return mh2;
    }

    public void setMh2(double mh2) {
        this.mh2 = mh2;
    }

    @Override
    public String toString() {
        return super.toString()+"Môn học 1: "+this.mh1+" Môn học 2: "+this.mh2; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public String danhGia(){
        return null;
    }
    
    
    
    
}
