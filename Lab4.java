import java.util.Scanner;
public class Lab4
{
 public static void main(String[] args)
  {
        Scanner keyboard = new Scanner(System.in);
	System.out.println("Sayi giriniz:");
	int alinan_input = keyboard.nextInt();
        for(int i=2 ;alinan_input!=1 ;i++)
	 {
           if(alinan_input%i==0)
	     {
               alinan_input/=i;
	       System.out.print(" "+i);
               i--;

	     }
	 }
        
  }	

}
