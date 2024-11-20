package baiTap;

import java.util.Scanner;

public class Bai15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chuoi so nguyen");
        String n = sc.nextLine();
        try {
            int a = Integer.parseInt(n);
            System.out.println("chuoi "+ n + " la chuoi so nguyen");
        } catch (Exception e) {
            // TODO: handle exception 
            System.out.println("chuoi "+ n + " khong phai la chuoi so nguyen");
        }
    }
}
