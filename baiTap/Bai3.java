package baiTap;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap gia tri N:  ");
        int N = sc.nextInt();
        int m = 0;
        // lưu kết quqr khi tính tổng vào biến m
        for(int i=0; i<=N;i+=2){
            m+=i;
        }
        System.out.println("Tong cac so chan tu 2 " + N +"la: "+m);
    }
}
