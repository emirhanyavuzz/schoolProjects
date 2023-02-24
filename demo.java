import java.util.Scanner;
public class demo
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    student student1 = new student(), student2 = new student(),student3 = new student();
    
    System.out.println( "student1 ID nizi giriniz:");
    student1.setid(keyboard.nextInt());
    System.out.println( "student1 Cinsiyetinizi giriniz:");
    student1.setgender(keyboard.next());
    System.out.println(( "student1 Not ortalamanizi giriniz:"));
    student1.setgpa(keyboard.nextFloat());
    System.out.println( "student1 Dogum yilinizi giriniz:");
    student1.setdogumyili(keyboard.nextInt());

    //student1.setSpecies(student1.Id,student1.gender,student1.dogumyili);

    System.out.println( "student2 ID nizi giriniz:");
    student2.setid(keyboard.nextInt());
    System.out.println( "Cinsiyetinizi giriniz:");
    student2.setgender(keyboard.next());
    System.out.println(( "student2 Not ortalamanizi giriniz:"));
    student2.setgpa(keyboard.nextFloat());
    System.out.println( " student2 Dogum yilinizi giriniz:");
    student2.setdogumyili(keyboard.nextInt());

    //student2.setSpecies(student2.Id,student2.gender,student2.dogumyili);

    System.out.println( "student3 ID nizi giriniz:");
    student3.setid(keyboard.nextInt());
    System.out.println( "student3 Cinsiyetinizi giriniz:");
    student3.setgender(keyboard.next());
    System.out.println(( "student3 Not ortalamanizi giriniz:"));
    student3.setgpa(keyboard.nextFloat());
    System.out.println( "student3 Dogum yilinizi giriniz:");
    student3.setdogumyili(keyboard.nextInt());

    //student3.setSpecies(student3.Id,student3.gender,student3.dogumyili); 

     
  }
}
    
    
    
    
 