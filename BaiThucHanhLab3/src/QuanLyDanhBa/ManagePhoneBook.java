package QuanLyDanhBa;

import java.util.Scanner;

public class ManagePhoneBook {
    static void menu(){
        System.out.println("PHONEBOOK MANAGE SYSTEM");
        System.out.println("1. Insert phone");
        System.out.println("2. Remove phone");
        System.out.println("3. Update phone");
        System.out.println("4. Search phone");
        System.out.println("5. Sort");
        System.out.println("6. Exit");
    }
    /**
     * @param args
     */
    public static void main(String[] args) {
        menu();
        String option;
        Scanner inputScanner = new Scanner(System.in);
        String name, phone;
        While (true)Object pb;
        {
            System.out.println("Mời bạn chọn một mục: ");
            option = inputScanner.nextLine();
            switch (inputScanner.nextLine()){
                case "1":
                    System.out.println("Mời nhập tên: ");
                    name = inputScanner.nextLine();
                    System.out.println("Mời nhập số điện thoại: ");
                    phone = inputScanner.nextLine();
                    ((Object) pb).insertPhone(name, phone);
                    break;
                case "2":
                if(pb.PhoneList.isEmpty()){
                    System.out.print("Danh bạ trống!");
                    break;
                }
                    System.out.println("Mời nhập tên người dùng muốn xóa");
                    pb.removePhone(name);
                    name = inputScanner.nextLine();
                    break;
                case "3":
                    System.out.println("Mời nhập tên người dùng muốn update: ");
                    name = inputScanner.nextLine();
                    System.out.println("Mời nhập số điện thoại muốn update: ");
                    phone = inputScanner.nextLine();
                    pb.updatePhone(name, phone);
                    break;
                case "4":
                    System.out.println("Mời nhập tên người dùng muốn tìm: ");
                    name = inputScanner.nextLine();
                    String result = pb.searchPhone(name);
                    if(result==null){
                        System.out.println("Không tìm thấy người dùng có tên " + name);
                    }else{
                        System.out.println("Kết quả: " + result);
                    }
                    break;
                case "5":
                pb.sort();
                    break;
                case "6": return;
            }
        }

        pb.insertPhone(name: "ABC", phone: "0324685419");
        pb.insertPhone(name: "DEF", phone: "0347686878");
        pb.insertPhone(name: "DEF", phone: "0347686887");
        pb.insertPhone(name: "DE", phone: "0316489754");
        
        
        for(String pl : pb.PhoneList){
            System.out.println(pl);
        }
    }
    private static void While(boolean b) {
    }
}
