package buoi7;

import java.util.Scanner;

public class Nhap {

    public static float nhapDiem() {
        float n = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("\nnhap diem thi:  ");
                n = Float.parseFloat(sc.nextLine());
                if (n >= 0 && n <= 10) {
                    break;
                } else {
                    System.out.println("diem kkhong hop le yeu cau nhap lai !!!");
                }
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("diem kkhong hop le yeu cau nhap lai !!!");
            }
        }
        return n;
    }
    public static int nhapTuoi(){
        int tuoi = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("nhap tuoi:  ");
                tuoi = Integer.parseInt(sc.nextLine());
                if(tuoi >=0 && tuoi<=150)
                break;
                else{
                    System.out.println("nhap tuoi khong hop le tu 0-127, yeu cau nhap lai");
                }
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("nhap tuoi khong hop le tu 0-127, yeu cau nhap lai");
            }
        }
        return tuoi;
    }

    public static void main(String[] args) {
        /*float b = nhapDiem();
        System.out.printf("diem thi la %f", b);*/
        int c = nhapTuoi();
        System.out.printf("tuoi la %d" , c);
    }
}
