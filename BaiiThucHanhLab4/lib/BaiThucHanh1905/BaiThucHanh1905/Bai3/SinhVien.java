package BaiThucHanh1905.Bai3;

import java.util.List;
import java.util.Scanner;

public class SinhVien {
    public String name;
    public double point;

    public String getName() {
        return name;
    }

    public double getPoint() {
        return point;
    }

    public static void addSv(List<SinhVien> std) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            SinhVien sv = new SinhVien();
            System.out.print("Enter name :");
            sv.name = sc.nextLine();
            if (sv.name.isEmpty()) {
                break;
            }
            System.out.print("Enter point :");
            sv.point = sc.nextDouble();
            sc.nextLine();
            std.add(sv);
        }
    }

    public static void countSvBack(List<SinhVien> std) {
        int cnt = 0;
        System.out.println("Cac Sinh Vien thi lai la :");
        for (int i = 0; i < std.size(); i++) {
            if (std.get(i).point <= 5) {
                System.out.println("Sinh Vien thu :" + (i + 1));
                System.out.println("name :" + std.get(i).name);
                System.out.println("point :" + std.get(i).point);
                ++cnt;
            }
        }
        System.out.println("So luong Sinh Vien thi lai la :" + cnt);
    }

    public static void outputPointMax(List<SinhVien> std) {
        double max = std.get(0).point;
        for (int i = 1; i < std.size(); i++) {
            if (std.get(i).point > max) {
                max = std.get(i).point;
            }
        }
        System.out.println("cac sinh vien co diem cao nhat la");
        for (int i = 0; i < std.size(); i++) {
            if (std.get(i).point == max) {
                System.out.println("sinh vien thu :" + (i + 1));
                System.out.println("name :" + std.get(i).name);
                System.out.println("point :" + std.get(i).point);
            }
        }
    }

    public static void searchSv(List<SinhVien> std) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao ten muon tim :");
        String tmp = sc.nextLine();
        boolean check = false;
        for (SinhVien sinhVien : std) {
            if (sinhVien.name.equals(tmp)) {
                System.out.println("name :" + sinhVien.name);
                System.out.println("point :" + sinhVien.point);
                check = true;
            }
        }
        if (check == false) {
            System.out.println("not found !");
        }
    }

}
