import java.util.Scanner;

public class Bai1 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
            System.out.println("Nhập số thứ nhất: ");
            int Sothunhat = sc.nextInt();
            System.out.println("Nhập số thứ hai: ");
            int Sothuhai = sc.nextInt();
            int Tong = Sothunhat + Sothuhai;
            System.out.println(Sothunhat + "+" + Sothuhai + "+" + "=" + Tong);
            
            int Hieu = Sothunhat - Sothuhai;
            System.out.println(Sothunhat + "-" + Sothuhai + "-" + "=" + Hieu);
            
            int Tich = Sothunhat * Sothuhai;
            System.out.println(Sothunhat + "*" + Sothuhai + "*" + "=" + Tich);
            
            int Thuong = Sothunhat / Sothuhai;
            System.out.println(Sothunhat + "/" + Sothuhai + "/" + "=" + Thuong);
            
            int Laydu = Sothunhat % Sothuhai;
            System.out.println(Sothunhat + "%" + Sothuhai + "%" + "=" + Laydu);
            
            System.out.println("Kết quả so sánh bằng của " + Sothunhat + "và" + Sothuhai + "là" + (Sothunhat == Sothuhai));
            
            System.out.println("Kết quả so sánh không bằng của  " + Sothunhat + "và" + Sothuhai + "là" + (Sothunhat != Sothuhai));
            
            System.out.println("Kết quả so sánh lớn hơn của " + Sothunhat + "và" + Sothuhai + "là" + (Sothunhat > Sothuhai));
            
            System.out.println("Kết quả so sánh nhỏ hơn của " + Sothunhat + "và" + Sothuhai + "là" + (Sothunhat < Sothuhai));
            
            System.out.println("Kết quả so sánh lớn hơn hoặc bằng của " + Sothunhat + "và" + Sothuhai + "là" + (Sothunhat >= Sothuhai));
            
            System.out.println("Kết quả so sánh nhỏ hơn hoặc bằng của " + Sothunhat + "và" + Sothuhai + "là" + (Sothunhat <= Sothuhai));
     }
}    