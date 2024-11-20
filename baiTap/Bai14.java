package baiTap;

import java.util.Scanner;

public class Bai14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("mhap 3 so nguyen bat ki ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        int max = a;
        for(int i=0;i<a;i++)
        {
            if(max<b){
                max =b;
            }
            if(max<c){
                max =c;
            }
        }
        System.out.printf("gia tri lon nhat trong 3 so nguyen la %d", max);
    }
}
