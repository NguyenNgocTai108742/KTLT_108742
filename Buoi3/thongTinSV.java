package Buoi3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class thongTinSV {
    public static String gioitinh(boolean gt) {
        return gt ? "nam" : "nu";
    }

    public static void main(String[] args) throws Exception {
        String maSV = "108742";
        System.out.println(Float.parseFloat(maSV));
        String hoVaTen = "Nguyen Ngoc Tai ";
        String ngaySinh = "18/06/2004";
        SimpleDateFormat ngaySinh1 =new SimpleDateFormat("dd/MM/yyyy");
        Date date1 = ngaySinh1.parse(ngaySinh);
        int tuoi = 20;
        boolean gt = true;
        String lop = "IT24B";
        String khoa = "Cong Nghe Thong Tin";
        String diaChi = "33 Xo Viet Nghe Tinh";
        System.out.println("---THONG TIN SINH VIEN---");
        System.out.println("ma sinh vien:  " + maSV);
        System.out.println("ho và ten:  " + hoVaTen);
        System.out.println("ngay sinh:  " + ngaySinh1.format(date1));
        System.out.println("tuoi:  " + tuoi);
        System.out.println("gioi tinh:  " + gioitinh(gt));
        System.out.println("lop:  " + lop);
        System.out.println("khoa:  " + khoa);
        System.out.println("dia chi:  " + diaChi);
        System.out.println("---HET---");

    }
}
