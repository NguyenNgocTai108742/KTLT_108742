package baiTap;

import java.util.Scanner;

public class Bai10 {
    public static void sapXepMangGiamDan(){
        //nhập số phần tử trong mảng
        Scanner sc = new Scanner(System.in);
        System.out.print(" nhap so luong phan tu trong mang: ");
        int n =sc.nextInt();

        //nhập các phần tử trong mảng
        int[] b = new int[n];
        System.out.println("nhap cac phan tu trong mang: ");
        for (int i=0; i<n ; i++){
        b[i]=sc.nextInt();
        }

        //kiểm tra và sắp xếp các phần tử trong mảng vừa nhập
        for(int i=0;i<n-1;i++){// duyệt từng phần tử trong mảng
            for(int j=i+1;j<n;j++){// duyệt các phần tử còn lại trong mảng
                // sắp xếp phần tử theo chiều giảm dần nếu b[i] < b[j] sẽ hoán đổi vị trí theo chiều giảm dần
                if(b[i]<b[j]){
                    int c = b[i];
                    b[i]=b[j];
                    b[j]=c;
                }
            }
        }
        System.err.println("mang sau khi duoc sap xep: ");
        for (int i=0;i< n;i++){
            System.err.print(b[i]+" ");
        }
    }
    public static void main(String[] args) {
        sapXepMangGiamDan();
    }
}
