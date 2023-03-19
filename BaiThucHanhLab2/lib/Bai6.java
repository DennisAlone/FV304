import java.util.Scanner;

public class Bai6 {
     public static void main(String[] args) {
          int a , b = 1;
          long Giaithua = 1;
          Scanner sc = new Scanner(System.in);
          do{
               System.out.println("Nhập số: ");
                a = sc.nextInt();
          }while ((a <= 0) || (b > 10));
     while (b <= a){
     Giaithua *= b;
     b++;   
     }
     System.out.println(a + "! = " + Giaithua);
     }
}
     

