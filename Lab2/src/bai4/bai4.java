/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4;

import java.util.Scanner;

/**
 *
 * @author minhm
 */
class Engine {

    String engineId;
    String engineName;
    String manufacturer;
    int yearMaking;
    float price;
    Scanner sc = new Scanner(System.in);

    public Engine() {
    }

    public Engine(String engineId, String engineName, String manufacturer, int yearMaking, float price) {
        this.engineId = engineId;
        this.engineName = engineName;
        this.manufacturer = manufacturer;
        this.yearMaking = yearMaking;
        this.price = price;
    }

    public String getEngineId() {
        return engineId;
    }

    public String getEngineName() {
        return engineName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getYearMaking() {
        return yearMaking;
    }

    public float getPrice() {
        return price;
    }

    public void setEngineId(String engineId) {
        this.engineId = engineId;
    }

    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setYearMaking(int yearMaking) {
        this.yearMaking = yearMaking;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void input() {
        System.out.print("nhap ma may: ");
        this.engineId = sc.nextLine();
        System.out.print("nhap ten may: ");
        this.engineName = sc.nextLine();
        System.out.print("nhap ten nha san xuat: ");
        this.manufacturer = sc.nextLine();
        System.out.print("nhap nam san xuat: ");
        this.yearMaking = sc.nextInt();
        System.out.print("nhap gia ban: ");
        this.price = sc.nextFloat();
    }

    public void display() {
        System.out.print("ma may: " + engineId + "\n");
        System.out.print("ten may: " + engineName + "\n");
        System.out.print("ten nha san xuat: " + manufacturer + "\n");
        System.out.print("nam san xuat: " + yearMaking + "\n");
        System.out.print("gia ban: " + price + "\n");
    }
}

class Car extends Engine {

    int totalSeat;
    float speed;

    public Car() {
    }

    public Car(int totalSeat, float speed) {
        this.totalSeat = totalSeat;
        this.speed = speed;
    }

    public Car(int totalSeat, float speed, String engineId, String engineName, String manufacturer, int yearMaking, float price) {
        super(engineId, engineName, manufacturer, yearMaking, price);
        this.totalSeat = totalSeat;
        this.speed = speed;
    }

    public int getTotalSeat() {
        return totalSeat;
    }

    public float getSpeed() {
        return speed;
    }

    public void setTotalSeat(int totalSeat) {
        this.totalSeat = totalSeat;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public void input() {
        super.input();
        System.out.print("nhap so cho ngoi: ");
        this.totalSeat = sc.nextInt();
        System.out.print("nhap toc do: ");
        this.speed = sc.nextFloat();
    }

    public void display() {
        super.display();
        System.out.print("so cho ngoi: " + totalSeat + "\n");
        System.out.print("toc do: " + speed + "\n");
    }
}

class Mobile extends Engine {

    String country;
    Scanner scmobile = new Scanner(System.in);

    public Mobile() {
    }

    public Mobile(String country) {
        this.country = country;
    }

    public Mobile(String country, String engineId, String engineName, String manufacturer, int yearMaking, float price) {
        super(engineId, engineName, manufacturer, yearMaking, price);
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void input() {
        super.input();
        System.out.print("nhap nuoc san xuat: ");
        this.country = scmobile.nextLine();
    }

    public void display() {
        super.display();
        System.out.print("nuoc san xuat: " + country + "\n");
    }
}

class Manager {

    static void menu() {
        System.out.print("\n");
        System.out.print("Menu \n");
        System.out.print("1.nhap thong tin dien thoai \n");
        System.out.print("2.nhap thong tin oto \n");
        System.out.print("3.hien thi thong tin dien thoai và oto \n");
        System.out.print("4.Tim kiem theo ten nha san xuat \n");
        System.out.print("0.thoat \n");
    }

    public static void main(String[] args) {
        int n;
        Mobile mobile[] = null;
        Car car[] = null;
        Scanner sc = new Scanner(System.in);
        do {
            menu();
            System.out.print("Nhap vao lua chon cua ban: ");
            n = sc.nextInt();
            switch (n) {
                case 1: {
                    int m;
                    System.out.print("\n");
                    System.out.print("Nhap so luong dien thoai: ");
                    m = sc.nextInt();
                    mobile = new Mobile[m];
                    for (int i = 0; i < m; i++) {
                        System.out.print("\n");
                        System.out.print("Nhap thong tin dien thoai " + (i + 1) + "\n");
                        mobile[i] = new Mobile();
                        mobile[i].input();
                    }
                    System.out.print("\n");
                    break;
                }
                case 2: {
                    int m;
                    System.out.print("Nhap so luong oto: ");
                    m = sc.nextInt();
                    car = new Car[m];
                    for (int i = 0; i < m; i++) {
                        System.out.print("\n");
                        System.out.print("Nhap thong tin oto " + (i + 1) + "\n");
                        car[i] = new Car();
                        car[i].input();
                    }
                    System.out.print("\n");
                    break;
                }
                case 3: {
                    if (mobile == null && car == null) {
                        System.out.print("ban chua nhap du lieu");
                    } else {
                        System.out.print("du lieu ban vua nhap la : \n");
                        if (mobile == null) {
                            System.out.println("khong co thong tin dien thoai \n");
                        } else {
                            for (int i = 0; i < mobile.length; i++) {
                                System.out.print("\n");
                                System.out.println("thong tin dien thoai " + (i + 1));
                                mobile[i].display();
                            }
                        }
                        if (car == null) {
                            System.out.println("khong co thong tin oto \n");
                        } else {
                            for (int i = 0; i < car.length; i++) {
                                System.out.print("\n");
                                System.out.println("thong tin oto " + (i + 1));
                                car[i].display();
                            }
                        }
                    }
                    System.out.print("\n");
                    break;
                }
                case 4: {
                    Scanner sc1 = new Scanner(System.in);
                    System.out.print("\n");
                    System.out.print("nhap ten nha san xuat:");
                    String engineName = sc1.nextLine();
                    int dem = 0;
                    System.out.print("thong tin nha san xuat ban muon tim la : \n\n");
                    if (mobile != null) {
                        for (int i = 0; i < mobile.length; i++) {
                            if (mobile[i].getEngineName().equals(engineName)) {
                                System.out.println("thong tin dien thoai " + (i + 1));
                                mobile[i].display();
                                System.out.print("\n");
                                dem++;
                            }
                        }
                    }
                    if (car != null) {
                        for (int i = 0; i < car.length; i++) {
                            if (car[i].getEngineName().equals(engineName)) {
                                System.out.println("thong tin oto " + (i + 1));
                                car[i].display();
                                System.out.print("\n");
                                dem++;
                            }
                        }
                    }
                    if (dem == 0) {
                        System.out.println("khong co nha san xuat ban muon tim");
                    }
                    break;
                }
            }
        } while (n != 0);
    }
}
