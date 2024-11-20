package baiTap;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap gia tri: ");
        int n = sc.nextInt();
        // toán tử logic
        // boolean là một kiểu dữ liệu nhận hai giá trị true và false
        // IntStream: int là kiểu dữ liệu Stream là đại diện cho một chuổi các phần tử int hỗ trợ các hoạt động kiểm tra 
        //IntStream.rangeClosed : tạo ra một chuổi số nguyên liên tiếp phục vụ quá trình kiểm tra
        //2, (int) Math.sqrt(n) : tạo ra một chuổi từ 2 đến căn bật hai của n 
        //noneMatch(a -> n % a == 0 ): kiểm tra xem có số nào chia hết cho n hay ko nếu ko trả về true
         
        boolean kt = n > 1 && IntStream.rangeClosed(2, (int) Math.sqrt(n)).noneMatch(a -> n % a == 0 );
         
        if(kt){
            System.out.println(n + " la so nguyen to ");
        }
        else {
            System.out.println(n + " khong phai la so nguyen to ");
        }
    }
}
