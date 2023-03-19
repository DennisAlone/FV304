import java.text.DecimalFormat;
import java.util.Scanner;

public class Bai8 {
 
    public static void main(String[] args) {
        int n, Tong = 0, So;
        float Sotrungbinh;
        Scanner sc = new Scanner(System.in);
        DecimalFormat  decimalFormat = new DecimalFormat("#.##");

            System.out.println("Nhập số các số nguyên có trong dãy số: ");
            n = sc.nextInt();
            for (int count = 1; count <= n; count++){
              System.out.println("Nhập số thứ " + count + ":");
            So = sc.nextInt();
            Tong += So;  
            }
        Sotrungbinh = (float)Tong / n;
        System.out.println("Trung bình cộng = " + decimalFormat.format(Sotrungbinh));   
    }
    
}