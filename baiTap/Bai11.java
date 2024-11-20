package baiTap;

import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so luong phan tu trong mang: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.println("nhap gia tri phan tu trong mang: ");
        for(int i= 0 ;i<n; i++){
             a[i]=sc.nextInt();
        }
        int min = a[0];
        for(int i= 0; i<a.length;i++){
            
            if(min>a[i])
                min = a[i];            
        }
        System.out.printf("phan tu trong mang co gia tri nho nhat la: %d ", min);
        
    }
    
}
