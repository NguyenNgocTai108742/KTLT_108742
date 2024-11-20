package buoi9;

import java.util.Scanner;

public class inTamGiacVuong {
    public static void tamGiacSao(){
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so ki tu * ban muon o chieu cao: ");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void tamGiacSaoNguoc(){
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so ki tu * ban muon o chieu cao: ");
        int n = sc.nextInt();

        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void tamGiacSo(){
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so ki tu so ban muon o chieu cao: ");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void tamGiacSoNguoc(){
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so ki tu so ban muon o chieu cao: ");
        int n = sc.nextInt();

        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void tamGiacSaoDeu(){
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so ki tu so ban muon o chieu cao: ");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;++j)
            {
                System.out.print("  ");
            }
            for(int k=1;k<=2*i-1;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }    
    }
    public static void tamGiacSaoDeuNguoc(){
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so ki tu so ban muon o chieu cao: ");
        int n = sc.nextInt();

        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=n-i;++j)
            {
                System.out.print("  ");
            }
            for(int k=1;k<=2*i-1;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }    
    }
    public static void tamGiacSoDeu(){
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so ki tu so ban muon o chieu cao: ");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print("  ");
            }
            for(int d=1;d<=i;d++)
            {
                System.out.print(d +" ");
            }
            for(int k=i-1;k>=1;k--)
            {
                System.out.print( k+" ");
            }
            System.out.println();
        }    
    }



    public static void main(String[] args) {
        /*tamGiacSao();
        tamGiacSaoNguoc();
        tamGiacSo();
        tamGiacSoNguoc();*/
        tamGiacSaoDeu();
        tamGiacSaoDeuNguoc();
        tamGiacSoDeu();
    }
}
