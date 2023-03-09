import java.util.Scanner;

public class Slide47 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int sum = 0;
          String tmp = "";
          do{
               System.out.println("nhap so: ");
               int n = sc.nextInt();
               sum += n;
               tmp = n + " + " + tmp;
          }while(sum <= 100);
          String newTmp = tmp.substring(0, tmp.length()-2);
          System.out.println(newTmp);
          System.out.println("tong cac so nguyen lon hon 100 la:" + sum);
     }
}