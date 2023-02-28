import java.util.Scanner;
import java.lang.Math;

public class Slide34
{
	public static void main(String[] args) 
	{
	    double a, b, c , x , x1 , x2,delta;
	     
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.print("Nhap a: ");
	    a = sc.nextInt();
	    System.out.print("Nhap b: ");
	    b = sc.nextInt();
	    System.out.print("Nhap c: ");
	    c = sc.nextInt();
	    
	   
	    
	    delta = b*b - 4*a*c;
	    
	    x1 = (-b + Math.sqrt(delta)) / 2*a;
	    x2 = (-b - Math.sqrt(delta)) / 2*a;
	    x  = -b/2*a;
	    
	    
	    if(delta < 0)
	    {
	        System.out.println("Phuong trinh vo nghiem");
	    }
	    
	    else if(delta == 0)
	    {
	        System.out.println("Phuong trinh co nghiem kep x1 = x2 = " + (int)x);
	    }
	    
	    else 
	    {
	        System.out.println("Phuong trinh co 2 nghiem phan biet:\n x1 = " +(int)x1 + "\n x2 = " + (int)x2);
	    }
		
	}
}
