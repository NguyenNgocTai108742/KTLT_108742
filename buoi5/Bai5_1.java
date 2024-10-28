package buoi5;

import java.util.Scanner;

public class Bai5_1 {
    public static int giaTriLonNhat(int a, int b){
        return a > b ? a : b;
    }
    public static int giaTriNhoNhat(int a, int b){
        return a < b ? a : b;
    }
    public static int giaTriLonNhatSoSanh(int a, int b){
        int max = a;
        if(max < b)
        max = b;
        return max;
    }
    public static int giaTriNhoNhatSoSanh(int a, int b){
        int min = a;
        if(min > b)
        min = b;
        return min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.print("nhập số thứ nhất:  ");
        num1 = sc.nextInt();
        System.out.print("nhập số thứ hai:  ");
        num2 = sc.nextInt();
        System.out.printf("\nGiá trị lớn nhất của hai số %d và %d là %d", num1, num2, giaTriLonNhat(num1, num2));
        System.out.printf("\nGiá trị nhỏ nhất của hai số %d và %d là %d", num1, num2, giaTriNhoNhat(num1, num2));
        System.out.printf("\nGiá trị lớn nhất của hai số %d và %d là %d", num1, num2, giaTriLonNhatSoSanh(num1, num2));
        System.out.printf("\nGiá trị nhỏ nhất của hai số %d và %d là %d", num1, num2, giaTriNhoNhatSoSanh(num1, num2));
    }
}
