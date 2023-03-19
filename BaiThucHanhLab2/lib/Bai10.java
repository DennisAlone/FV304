import java.util.Scanner;

public class Bai10 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String Chuoi;
        char Kytu;
        int Count = 0;
        do{
        System.out.println("Nhập vào chuỗi ký tự bất kỳ: ");
        Chuoi = sc.nextLine();  
        }while(Chuoi.length() > 80);
        System.out.println("Nhập ký tự cần đếm: ");
        Kytu = sc.next().charAt(0);
        for (int i = 0; i < Chuoi.length(); i++){
          if(Kytu == Chuoi.charAt(i));
        Count++;  
        }
    System.out.println("Số lần xuất hiện của ký tự " + Kytu +
        " trong chuỗi " + Chuoi + " = " + Count);    
    }
    
}    
