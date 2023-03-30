import java.util.Scanner;

public class Hinhtru 
{   
    public final float PI = 3.14f;
    public float banKinh;
    public float chuVi;
    public float dienTich;
    public float chieuCao;
    public float dienTichHT;
    public float theTich;

    Scanner sc = new Scanner(System.in); 
    public void setBanKinh()
    {
        System.out.print("Nhap ban kinh: ");
        banKinh = sc.nextInt();
    }

    public void setChieuCao()
    {
        System.out.print("Nhap chieu cao: ");
        chieuCao = sc.nextInt();
    }

    public void TinhchuVi()
    {
        chuVi =  PI * (banKinh + banKinh);
    }

    public void TinhdienTich()
    {
        dienTich = PI * banKinh * banKinh;
    }
    
    public void ThongTinHinhTron()
    {
        System.out.printf("Hinh tron co ban kinh bang %f - chu vi bang %f - dien tich bang %f", banKinh, chuVi, dienTich);
    }

    public void theTich()
    {
        theTich = PI  * banKinh * banKinh * chieuCao;
    }

    public void DThinhTru()
    {
        dienTichHT = 2 * PI * banKinh * chieuCao;
    }


    public void ThongTinHinhTru()
    {
        System.out.printf("Hinh tru co ban kinh bang %f - dien tich bang %f - the tich bang %f", banKinh,dienTichHT , theTich);
    }
}

