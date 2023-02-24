
import java.util.Scanner;
import java.util.Random;

public class lab9 
{
 public static void main(String[] args)
 {
	 Scanner sc = new Scanner(System.in);
     Random random =new Random();
     System.out.println("Dizinin satir sayisini giriniz: ");
     int satir=sc.nextInt();
     System.out.println("Dizinin sutun sayisini giriniz: ");
     int sutun=sc.nextInt();
     int[][] intArr =new int [satir][sutun];
     for(int i =0;i<satir;i++)
     {	 
		  for(int j=0;j<sutun;j++) 
		  {
			 intArr[i][j]=random.nextInt(100); 
		  }  
     }
    
     System.out.println(toString(intArr));
     System.out.println();		
     System.out.println(toString(devrik(intArr)));
 }
     private static String toString (int[][] a) 
     {
    String str="";
    for(int i =0;i<a.length;i++)
     {	 
		  for(int j:a[i]) 
			  str=str+j+" ";
    	  str=str+"\n";
     }
     return str;
	 
     }
     
     
	 private static int[][] devrik (int[][] a){
	 
	 int [][] devrikArray = new int [a[0].length][a.length];
	  for(int i =0;i<devrikArray.length;i++) {
		  for(int j=0;j<devrikArray[i].length;j++) 
		    devrikArray[i][j] =a[j][i];
	 
	  }
	   return devrikArray;
	 }	 
}
