import java.util.Scanner;

public class Hinhtron {
   
        public float bankinh;
        public float chuvi;
        public float dientich;
        public final float pi = 3.14f;
         Scanner sc = new Scanner(System.in);
        public void nhappi()
        {
            System.out.println("Nhap vao ban kinh: ");
            bankinh = sc.nextInt();   
        }
        public void chuvi() 
        {
            chuvi = bankinh * 2 *pi;
         System.out.printf("Chu vi cua hinh tron la: %s -%d ", bankinh,chuvi,dientich);
    }
        public void dientich() 
        {
            dientich = bankinh * bankinh * pi;
            System.out.printf("Dien tich cua hinh tron la: %s - %d ",bankinh,chuvi,dientich);
        }
        public void hienthithongtin(){
        System.out.printf("chuvi: %f dientich:%f bankinh:%f", chuvi, dientich, bankinh);
        }
        public void ThongTinHinhTron() {
        }
        public void setBanKinh() {
        }
        
}



