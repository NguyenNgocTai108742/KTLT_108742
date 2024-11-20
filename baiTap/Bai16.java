package baiTap;

import java.util.Scanner;

public class Bai16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chuoi so nguyen");
        String n = sc.nextLine();

        int a = Integer.parseInt(n);
        System.out.print("so nguyen la " + a);
    }
}
