import java.util.Scanner;
public class Student
{
private String name;
private static String courseName;
private static int idNo=1 ;


  public Student(String newName)
  {
   name=newName;
  }

  public static String setCourseName(String newCourseName)
  {
    courseName=newCourseName;
    return courseName;
  }

  public void getStudentInfo()
  {
    System.out.println("Name: "+name);
    System.out.println("Course Name: "+courseName);
    System.out.println("ID No: "+idNo);
    idNo+=1;
  }

}