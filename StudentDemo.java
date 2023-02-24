import java.util.Scanner;
public class StudentDemo
{
 public static void main(String[] args)
 {


	Student s1 = new Student();
	Student s2 = new Student();
	int k = keyboard.nextInt();
	
	String st= keyboard.next(); 
	
	s1.setGrade();

	s1.setName(st);

	s2.set(2.88, "Serdar Ortac");
	
	Boolean b = s1.equals(s2);
	
	s1.assign(s2);

	s1.showInfo();
	s2.showInfo();

	}

}