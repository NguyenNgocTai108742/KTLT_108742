package baiTap;

import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.print("nhap gia tri thu nhat:  ");
        int a = sc.nextInt();
        System.err.print("nhap gia tri thu hai:  ");
        int b = sc.nextInt();
        // Math.min(a, b) hàm này giúp tìm giá trị nhỏ nhất giữa hai số a và b và lưu giá trị nhỏ hơn đó 
        int m = Math.min(a, b);
        // giá trị chạy từ số lớn nhất đến số 1
            for(int i=m;i>=1;i--){
                if (a%i==0 && b%i==0) {
                    System.out.printf("uoc so chung lon nhat cua hai so %d và %d la: %d ",a,b, i);
                    break;
                }
            }
        
        
    }
}
