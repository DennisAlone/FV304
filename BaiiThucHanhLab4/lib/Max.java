import java.util.ArrayList;
import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        ArrayList<Integer> arrListInteger = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int number;

        System.out.println("Nhập số phần tử của ArrayList: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập phần tử thứ " + i + ":");
            number = sc.nextInt();
            arrListInteger.add(number);
        }
        int max = arrListInteger.get(0);
        for (int i = 1; i < arrListInteger.size(); i++) {
            if (arrListInteger.get(i).compareTo(max) > 0) {
                max = arrListInteger.get(i);
            }
        }
        System.out.println("Phần tử lớn nhất trong arrlistInteger = " + max);
    }
}
