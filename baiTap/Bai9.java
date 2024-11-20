package baiTap;

import java.util.Scanner;

public class Bai9 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap gia tri n:  ");
        int n = sc.nextInt();
        // lưu kết quả khi tính tổng vào biến a
        int a = 0;
        for(int i = 1;i<= n;i+=2 ){
            a+=i;
        }
        System.err.println("tong cac so le tu 1 den " + n +" la: "+a);
    }
}
