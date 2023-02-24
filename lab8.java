import java.util.Scanner;
public class lab8 
{
	
	public static void main(String[] args)
	 {
	  System.out.print("Dizi boyutunu giriniz: ");
	  Scanner sc = new Scanner(System.in);
	  int diziboyu= sc.nextInt();
	  int i=0;
	  int list[]=new int[diziboyu];

	  while ( (i <list.length) )
	   {
		System.out.print("Eleman "+ (i+1) +" : " );
		list[i] = sc.nextInt();
	    i++;
	   }
	   
	  for (int index = 0; index <list.length; index++)
	   {
	     System.out.print(list[index]+" ");
	   }
	  System.out.println();
	  System.out.print("Degistirme adimi miktarini giriniz: ");
      int degisim = sc.nextInt();

      System.out.print("Dizi: ");
 	  for (int index = 0; index <list.length; index++)
 	   {
 		  int a = index+degisim;
 		  list[index] = list[a % degisim];
 	      System.out.print(list[index]+" ");
 	   }
 
      
        

	 }
}