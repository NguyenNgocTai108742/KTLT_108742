package buoi7;

import java.util.Scanner;

public class ViDu {
    public static void hienThiDuLieu(int n){
        int i=1;
        while (i<=n) {
           System.out.print("\t" + i);
           i++; 
        }
        
    }
    public static int nhapSoNguyen(){
        Scanner sc =new Scanner(System.in);
        int n =0;
        while (true) {
            try {
                System.out.println("\nhay nhap gia tri:  ");
                n = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("Du lieu khong hop le, yeu cau nhap lai !!!");
            }
        }
        return n;
    }
    public static void main(String[] args) {
        int tam = nhapSoNguyen();
        System.out.printf("danh sach cac phan tu lon hon hoat bang %d la:  ",tam);
        hienThiDuLieu(tam);

    }
}
