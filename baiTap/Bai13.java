package baiTap;

import java.util.Scanner;

public class Bai13 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("mhap so phan tu trong mang");
    int n = sc.nextInt();

    int[]a= new int[n];
    System.out.println("mhap gia tri phan tu trong mang");
    for(int i = 0 ; i <n;i++)
    {
        a[i]=sc.nextInt();
    }
    int min=a[0];
    int viTrimin = 0;
    for(int i=0;i<a.length;i++)
    {
        if(min>a[i])
        {
            min=a[i];
            viTrimin = i;
        }
    }
    System.out.printf("gia tri nho nhat trong mang la %d và o vi tri %d",min,viTrimin);
   } 
}
