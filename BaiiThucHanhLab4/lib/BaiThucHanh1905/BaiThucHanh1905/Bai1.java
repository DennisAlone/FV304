package BaiThucHanh1905;

import java.rmi.Remote;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        // Nhập dãy số
        System.out.print("Nhập vào các số nguyên (nhập 0 để kết thúc): ");
        int input = sc.nextInt();
        while (input != 0) {
            numbers.add(input);
            input = sc.nextInt();
        }

        // Tìm số nguyên có giá trị lớn nhất
        int max = Collections.max(numbers);
        System.out.println("Số nguyên lớn nhất: " + max);

        // Nhập vào số nguyên và xoá khỏi mảng các phần tử có giá trị bằng số đó
        System.out.print("Nhập vào một số nguyên để xoá: ");
        int deleteNumber = sc.nextInt();
        numbers.removeIf(number -> number == deleteNumber);

        // Sắp xếp dãy số và in ra màn hình
        Collections.sort(numbers);
        System.out.println("Dãy số sau khi sắp xếp:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
