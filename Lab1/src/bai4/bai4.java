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
public class bai4 {

    public static void main(String[] args) {
        int sodien;
        int tiendien;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so dien:");
        sodien = sc.nextInt();

        if (sodien < 50) {
           tiendien = sodien*5000;     
        }
        else {
            tiendien = 50*5000+(sodien-50)*1200;
        }
        System.out.println("So tien dien la:" + tiendien);
    }
}
