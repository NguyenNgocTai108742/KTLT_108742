package baiTap;

public class Bai6 {
    public static void main(String[] args) {
        int a[]={4, 5, 7, 9};
        int k=0;
        // int c là biến sẽ sử dụng để lưu giá trị tường phần của mảng a
        //: a chỉ định duyệt qua tất cả các phần tử của mảng a
        for(int c : a){
            int n=1;
            for(int i=1;i<=c;i++){
                n *=i;
            }
            k+=n;
            
        }
        System.out.println("gia tri cua bieu thuc 4! + 5! + 7! + 9! la: " + k);
    }
    
}
