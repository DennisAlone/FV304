import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Slide74 {
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
            out.print("nhap gia tri A[" + i + "]=");
            arrA[i] = sc.nextInt();
        }
        out.print("Mang vua nhap:");
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
        out.print("\nMảng sau khi sắp xếp:");
        for (int i = 0; i < arrA.length; i++) {
            out.printf(" " + arrA[i]);
        }
        int sum=0;
        for (int i=0; i<arrA.length;i++){
            if(arrA[i]%2==0){
                sum+=arrA[i];
            }
        }
        out.println("\ntong cac so chan trong mang vua nhap la: "+sum);
    }
}