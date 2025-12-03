import java.util.Scanner;
public class student
{
	private int id;
	private String gender;
	private float gpa;
	private int dogumyili;
	
	public int getid()
	{
  	  return id;
	}
	public float getGpa()
	{
  	  return gpa;
	}
	public int getdogumyili()
	{
  	  return dogumyili;
	}
	public String getgender()
	{
  	  return gender;
	}


	public void setgpa(float gpa)
	{
  	  gpa=gpa;
	}
	public void setid(int id)
	{
	  id=id;
	}
	public void setgender(String gender)
	{
	  gender=gender;
	}
	public void setdogumyili(int dogumyili)
	{
	  dogumyili=dogumyili;
	}

	
	public int calculateAge()
	{
            int yas=2022-dogumyili;
	    return yas;
	}	
  }
