import java.util.Scanner;

public class Bai5 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int sum = 0;
          String tmp = "";
          do{
               System.out.println("Nhập số: ");
               int n = sc.nextInt();
               sum += n;
               tmp = n + " + " + tmp;
          }while(sum <= 100);
          String newTmp = tmp.substring(0, tmp.length()-2);
          System.out.println(newTmp);
          System.out.println("Tổng các số nguyên lớn hơn 100 là:" + sum);
     }
}