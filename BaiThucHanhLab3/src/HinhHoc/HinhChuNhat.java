package HinhHoc;

import java.util.Scanner;

public class HinhChuNhat extends HinhHoc {
    public float dai, rong;
    public HinhChuNhat() {
        ten = "Hình Chữ Nhật";
    }   
    public void nhapChieuDai() {
        System.out.println("Chiều dài = ");
        Scanner sc = new Scanner(System.in);
        dai = sc.nextFloat();
    }
    public void nhapChieuRong() {
        System.out.println("Chiều Rộng = ");
        Scanner sc = new Scanner(System.in);
        rong = sc.nextFloat();
    }
    public void tinhChuVi() {
        chuVi = 2 * (dai + rong);
    }
    public void tinhDienTich() {
        dienTich = dai * rong;
    }
}
