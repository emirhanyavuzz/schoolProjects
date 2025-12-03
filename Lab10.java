import java.util.Scanner;

public class Lab10
{
 public static void main(String[]args)
 {
  
  Scanner sc=new Scanner(System.in);
  System.out.println("Lutfen Bir String giriniz");
  String inStr = sc.nextLine();
  System.out.println("Orijinal string:  " +  inStr);
 
  System.out.println("Tersten hali:" + reverseString (inStr));

  }
  public static String reverseString(String str)
  {
	if ((null == str) || (str.length() <= 1))
	{
		return str;
	}
	return reverseString(str.substring(1)) + str.charAt(0);
  }
 }

