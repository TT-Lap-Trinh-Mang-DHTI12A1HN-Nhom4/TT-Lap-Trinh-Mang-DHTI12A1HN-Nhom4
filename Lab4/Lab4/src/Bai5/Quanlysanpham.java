/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4.Bai5;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author KyThuat88
 */
public class Quanlysanpham {
    static HashMap<String, String> sanphamHashmap = new HashMap<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng sp");
        int n;
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            SanPham sp = new SanPham();
            sp.input();
            sanphamHashmap.put(sp.getMasp(),sp.getTensp());
        }
        System.out.println("Danh sách Hashmap sau khi nhập");
        System.out.println(sanphamHashmap);
    }
}
