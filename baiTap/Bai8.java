package baiTap;

import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap gia tri thu nhat:  ");
        int a =sc.nextInt();
        System.out.print("nhap gia tri thu hai:  ");
        int b =sc.nextInt();

        int n = Math.min(a, b);
        int k=0;
        for(int i=n;i>1;i--){
            if(a%i==0 && b%i==0){
                k=i;
            }
        }
        System.out.printf("boi chung nho nhat cua hai so %d va %d la: %d",a ,b,k);
    }
}
