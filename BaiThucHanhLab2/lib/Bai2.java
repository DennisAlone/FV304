import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so can kiem tra: ");
        n = sc.nextInt();
        if(n%2==0){
            System.out.printf("%d Đây là số chẵn!",n);
        }
        else{
            System.out.printf("%d Đây là số lẻ!",n);
        }
    }
}