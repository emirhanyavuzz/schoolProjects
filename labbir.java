import java.util.Scanner;
public class labbir
{
  public static void main(String[] args)
   {
   
   //soru bir
   
   System.out.println("Dogum yilinizi giriniz:");
   Scanner keyboard=new Scanner(System.in);
   int a= keyboard.nextInt();
   System.out.println("Yasiniz:");
   System.out.println(2022-a);
   
   //soru iki
    
   System.out.println("Bir sayi giriniz:");
   int d= keyboard.nextInt();
   System.out.println("Girdiğiniz sayi:");
   double b=(double)d/2;
   System.out.println(d);
   System.out.println("Girdiğiniz sayinin yarisi:");
   double c=2*b;
   System.out.println(b);
   System.out.println("Girdiğiniz sayinin yarisinin iki kati:");
   System.out.println(c);
   
   //soru uc
   
   System.out.println("Bir sayi giriniz:");
   double j= keyboard.nextDouble();
   int k= (int) j/3;
   double l=j/3;
   System.out.println("int kabul edersek:");
   System.out.println(k);
   System.out.println("double kabul edersek:");
   System.out.println(l);

   //soru dort
   
   System.out.println("Celcius degerini girin:");
   int ce= keyboard.nextInt();
   double f1=(ce*1.8)+32;
   System.out.println(f1);
   System.out.println("fahreneit degerini girin:");
   double f2= keyboard.nextDouble(); 
   double ce2=(f2-32)/1.8;
   System.out.println(ce2);
   
   //soru bes

   System.out.println("en giriniz:");
   double t= keyboard.nextDouble();
   System.out.println("boy giriniz:");
   double y= keyboard.nextDouble();
   System.out.println("yukseklik giriniz:");
   double q= keyboard.nextDouble();
   System.out.println("Prizmamizin hacmi:");
   double i=t*y*q;
   System.out.println(i);
   System.out.println("Prizmamizin yuzey alani:");
   double o=2*t+2*y+2*q;
   System.out.println(o);
   
   //soru altı

   System.out.println("ucgenin kenarlarini giriniz");
   double a3=keyboard.nextDouble();
   double b3=keyboard.nextDouble();
   double c3=keyboard.nextDouble();
   double u = (a3 + b3 + c3) / 2;
   double alan=Math.sqrt(u*(u-a3)*(u-b3) *(u-c3));
   System.out.println("ucgenin alani:");
   System.out.println(alan);
  
  
  }
   
}