package QuanLyDanhBa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PhoneBook extends Phone {
    ArrayList<String> PhoneList = new ArrayList<>();
    void insertPhone(String name, String phone){
        if(PhoneList.isEmpty()){
            PhoneList.add(name + ", " + phone);
        }else{
            String pb = searchPhone(name);
            if(pb!=null){
                if(!pb.contains(phone)){
                    PhoneList.set(PhoneList.indexOf(pb), pb + " : " + phone);
                }
            }else{
                
            }
            
        if(!timThay){
            PhoneList.add(name + ", " + phone);
        }
    }
}
    void removePhone(String name){
 

            String pb = searchPhone(name);
                if(pb!=null){
                    PhoneList.remove(pb);
                    System.out.println("Đã xóa người dùng " + name + " kèm các số điện thoại khỏi danh bạ");
                }else{
                    System.out.println("Không tìm thấy người dùng " + name + "trong danh bạ");
                }
            }

    void updatePhone(String name, String new phone){
       
            String pb = searchPhone(name);
            if(pb!=null){
                if(!pb.contains(newphone)){
                    PhoneList.set(PhoneList.indexOf(pb), pb.split(regex: ", ")[0] + " ," + newphone);
                }
            }else{
                System.out.println("Không tìm thấy người dùng " + name + "trong danh bạ để update");
            }
        
    }
    String searchPhone(String name){
        for(String pb : PhoneList){
            if(pb.split(regex: ", " )[0].equals(name)){
                return pb;
        }
    }
    return null;
    }
    void sort(){
    
            System.out.println("Sắp xếp tăng dần: ");
            Collections.sort(PhoneList, new Comparator<T>() {
                public int compare(String o1, String o2){
                    //if(o1.compareTo(o2)){
                    //    return 1;
                    //}else if(o1.compareTo(o2)==0){
                    //    return 0;
                    //}
                    //return -1;
                    return o1.compareTo(o2);
                }
            });
            System.out.println(PhoneList);
            System.out.println("Sắp xếp giảm dần: ");
            Collections.sort(PhoneList, new Comparator<String>() {
                public int compare(String o1, String o2){
                    return o2.compareTo(o1);
                }
                
            });
            System.out.println(PhoneList);
        }
}
    