import java.util.Scanner;
 
public class Bai3 {
 
    public static void main(String[] args) {
        int Tuoi, Nam;
        String Ten, Nhomtuoi;
        Scanner sc = new Scanner(System.in);
         
        System.out.println("Nhập vào tên: ");
        Ten = sc.nextLine();
        System.out.println("Nhập vào năm sinh: ");
        Nam = sc.nextInt();
         
        
        Tuoi = 2023 - Nam;  
        if (Tuoi < 16) {
            Nhomtuoi = "tuổi vị thành niên.";
        } else if (Tuoi >= 16 || Tuoi < 18) {
            Nhomtuoi = "tuổi trưởng thành.";
        } else {
            Nhomtuoi = "đã già.";
        }
         
        System.out.println("Bạn " + Ten + " thuộc nhóm " + Nhomtuoi);
    }
 
}