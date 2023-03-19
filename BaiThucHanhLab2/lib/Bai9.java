import java.util.Scanner;

public class Bai9 {
 
    public static void main(String[] args) {
        String Chuoi;
        char Kytu;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi ký tự bất kỳ: ");
        Chuoi = sc.nextLine();
        System.out.println("Các ký tự có trong chuỗi là: ");
        for(int i=0; i < Chuoi.length(); i++){
            Kytu = Chuoi.charAt(i);
            System.out.println(Kytu);
        }
    }
}