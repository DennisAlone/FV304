import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int kichThucMang;
        do {
            out.print("nhap kich thuc mang: ");
            kichThucMang = sc.nextInt();
        }
        while (kichThucMang <= 0);
        int arrA[] = new int[kichThucMang];

        for (int i = 0; i < arrA.length; i++) {
            out.print("\nnhap gia tri A[" + i + "]=");
            arrA[i] = sc.nextInt();
        }
        out.println("Mang vua nhap:");
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
        out.println("\nMẢng sau khu sắp xếp:");
        for (int i = 0; i < arrA.length; i++) {
            out.printf(" " + arrA[i]);
        }
    }
}