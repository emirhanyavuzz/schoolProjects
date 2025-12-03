import java.util.Scanner;
public class Lab3
{
 public static void main (String[]args)
  { 
     Scanner keyboard = new Scanner(System.in);
     System.out.println("Cumleyi giriniz:");
     String cumle=keyboard.nextLine();
     System.out.println("Harfi giriniz:");
     String harf = keyboard.next();
     String harf21= harf.toUpperCase();
     char harf2=harf21.charAt(0);
     char harf1=harf.charAt(0); 
     int sayac=0;
       for(int i=0 ; i<4 ; i++)
        {
          if  (cumle.charAt(i) == harf1 || cumle.charAt(i) == harf2 )
             sayac++;
             
        }
     System.out.println(harf1 + " veya O harfinden " + sayac + " adet bulunmaktadir." );
     



     double ders1kredi=0.4;
     double ders2kredi=0.6;
     int vizeders1;
     int finalders1;
     int finalders2;
     int vize1ders2;
     int vize2ders2;
     
     System.out.println("ilk dersin sirasiyla vize ve finalini giriniz:");
     vizeders1 = keyboard.nextInt();
     finalders1= keyboard.nextInt();
     System.out.println("ikinci dersin sirasiyla vize1, vize2 ve finalini giriniz:");
     
     vize1ders2= keyboard.nextInt();
     vize2ders2= keyboard.nextInt();
     finalders2= keyboard.nextInt();
     
     double ders1=(vizeders1*0.4)+(finalders1*0.6);
     double ders2=(0.25*(vize1ders2))+ (0.25*(vize1ders2))+ (0.5*finalders2);
     double ort = (ders1*ders1kredi) + (ders2*ders2kredi);
     double dortort = (ort*4)/100;
       if (ort>90)
        System.out.println("Notunuz: AA yani " + dortort);
       else if (ort>85)
        System.out.println("Notunuz: BA yani " + dortort);    
       else if (ort>80)
        System.out.println("Notunuz: BB yani " + dortort);
       else if (ort>75)
        System.out.println("Notunuz: CB yani " + dortort);
       else if (ort>70)
        System.out.println("Notunuz: CC yani " + dortort);
       else if (ort>65)
        System.out.println("Notunuz: DC yani " + dortort);
       else if (ort>60)
        System.out.println("Notunuz: DD yani " + dortort);
       else
        System.out.println("Notunuz: " + dortort);   
  }
}
     

