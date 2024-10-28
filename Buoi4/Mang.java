package buoi4;

public class Mang {
    public static void main(String[] args) {
        // khai báo ba mang a,b,c
        int a[] = { 2, 5, 4, 7, 6 };
        int b[][] = { { 1, 2, 3 }, { 4, 5, 6, 8 }, { 7 }, { 8, 9 } };
        int c[][][] = { { { 5, 2, 3 }, { 4, 5, 6, 8 }, { 7, 7 } }, { { 5, 6, 7, 3 }, { 8, 9 } } };

        // hiển thị các phần tử mảng c
        System.out.println("các phần tử mảng c:  ");
        for (int i = 0; i < c.length; i++) { // i là mảng 3 chiều c[i][][]
            for (int j = 0; j < c[i].length; j++) { // j là mảng 2 chiều c[i][j][]
                for (int k = 0; k < c[i][j].length; k++) { // k là mảng 1 chiều c[i][j][k]
                    System.out.println(c[i][j][k] + " ");
                }
            }
        }
    }
}
