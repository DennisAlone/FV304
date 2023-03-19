import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Bai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int kichThucMang;
        do {
            out.print("Nhập kích thước mảng: ");
            kichThucMang = sc.nextInt();
        }
        while (kichThucMang <= 0);
        int arrA[] = new int[kichThucMang];

        for (int i = 0; i < arrA.length; i++) {
            out.print("\nNhập giá trị A[" + i + "]=");
            arrA[i] = sc.nextInt();
        }
        out.println("Mảng vừa nhập:");
        for (int i = 0; i < arrA.length; i++) {
            out.print(" " + arrA[i]);
        }
        for (int i = 0; i < arrA.length - 1; i++) {
            int tt;
            for (int j = i + 1; j < arrA.length; j++) {
                if (arrA[i] > arrA[j]) {
                    tt = arrA[i];
                    arrA[i] = arrA[j];
                    arrA[j] = tt;
                }
            }
        }
        out.println("\nMảng sau khu sắp xếp:");
        for (int i = 0; i < arrA.length; i++) {
            out.printf(" " + arrA[i]);
        }
    }
}