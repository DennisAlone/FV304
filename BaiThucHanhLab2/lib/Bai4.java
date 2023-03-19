import java.util.Scanner;

public class Bai4 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println(" Nhập một số từ 1 đến 12 để hiển thị ngày lẽ tương ứng :");
          int n = sc.nextInt();
          switch(n){
                case 1:
                    System.out.println("Chủ nhật");
                    break;
                case 2:
                    System.out.println("Thứ hai");
                    break;
                case 3:
                    System.out.println("Thứ ba");
                    break;
                case 4:
                    System.out.println("Thứ tư");
                    break;
                case 5:
                    System.out.println("Thứ năm");
                    break;
                case 6:
                    System.out.println("Thứ sáu");
                    break;
                case 7:
                    System.out.println("Thứ bảy");
                    break;
                case 8:
                    System.out.println("Chủ nhật");
                    break;
                case 9:
                    System.out.println("Thứ hai");
                    break;
                case 10:
                    System.out.println("Thứ ba");
                    break;
                case 11:
                    System.out.println("Thứ tư");
                    break;
                case 12:
                    System.out.println("Thứ năm");
                    break;
               default:
                    System.out.println("Đây không phải ngày trong tuần lễ !");
               
          }
     }
}