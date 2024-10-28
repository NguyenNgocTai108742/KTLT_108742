package tuan4;

import java.util.Scanner;

public class Buoi4 {
    public static void bai4_1() {
        int arr[] = { 3, 5, 8, 10, 14, 25 };
        System.out.print("\nDanh sách các phần tử mảng arr là:  ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("\narr[%d]= %d", i, arr[i]);
        }

    }

    public static void bai4_2() {
        String nguHanh[] = { "kim", "mộc", "thủy", "hỏa", "thổ" };
        System.out.print("\nDanh sách các phần tử mảng nguHanh là:  ");
        for (int i = 0; i < nguHanh.length; i++) {
            System.out.printf("\narr[%d]= %s", i, nguHanh[i]);
        }
    }

    public static void bai4_2NC(int n) {
        System.out.printf("\nDanh sách các phần tử nhập từ bàn phím từ 1 đến n = %d là", n);
        for (int i = 1; i <= n; i++) {
            System.out.print("\t" + i);
        }
    }
    public static void bai4_3(){
        int arr1[][] = new int[2][3];
        int n = 1;
        for(int i = 0; i<= 2 ;i++){
            for(int j = 0; j<=3 ;j++){
                System.out.printf("\nphần tử thứ %d arr1[%d][%d]", n++, i, j);
            }

        }
    }
    public static void bai4_4(){
        int arr2[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7 } };
        int m = 1;
        for(int i=0;i< arr2.length; i++){
            for(int j=0;j< arr2[i].length; j++){
                System.out.printf("\nphần tử thứ %d arr2[%d][%d]", m++,i,j);
            }
        }
    }
    public static void bai4_3NC(int n){
        System.out.printf("\nDanh sách các phần tử lẻ nhỏ hơn hoặc bằng n = %d", n);
        for(int i=0; i<=n;i++){
            if(i%2!=0){
                System.out.print("\t" + i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.printf("\nnhập n từ bàn phím");
        num = sc.nextInt();
        bai4_1();
        bai4_2();
        bai4_2NC(num);
        bai4_3();
        System.out.print("\n--------------------------------");
        bai4_4();
        bai4_3NC(num);
    }
}
