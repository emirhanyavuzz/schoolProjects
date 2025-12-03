import java.util.*;

public class faiz1 {
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		boolean control = true;
		while(control==true)
		{
		System.out.println("Welcome to the interest calculate program. ");

		System.out.print("Please enter a positive value for your money: ");
		double mainMoney=kb.nextDouble();
		System.out.print("Please enter a positive value for your banks interestRate: ");
		double percentRateForYear = kb.nextDouble();
		double percentRate = percentRateForYear/365;
		System.out.print("Please enter a positive value for days: ");
		int days = kb.nextInt();
		System.out.print("Please enter a name for your bank: ");
		String bank= kb.next();
		System.out.println();
		
		if(mainMoney>0 && days>0)
		{
			for(int i = 1 ; days>=i; i++)
			{
				double yourMoney=(calculateLastMoney( bank, percentRate, mainMoney,days));
				System.out.println("Your money is after " +i + " days in " + bank + " bank = " + yourMoney );
				mainMoney=yourMoney;
			}
			System.out.print("Do you want to continue? (plz enter Y or N .): ");
			
		}
		else 
		{
				System.out.println("Please enter a positive value for your money !!! ");
		}
		System.out.print("Do you want to continue? (Please enter Yes or No .): ");
		String yesOrNo = (kb.next());
		if(yesOrNo.equalsIgnoreCase("yes"))
			control=true;
		else if (yesOrNo.equalsIgnoreCase("no"))
		{
			System.out.print(" Goodbye . ");
			control=false;
		}
		else
		{
			control=false;
			System.out.print(" You dont enter yes or no. Please enter Yes or No : ");
			yesOrNo = (kb.next());
				if(yesOrNo.equalsIgnoreCase("yes"))
					control=true;
				else if (yesOrNo.equalsIgnoreCase("no"))
			{
					System.out.print(" Goodbye . ");
					control=false;
			}
		}
		}
	}
	public static double calculateLastMoney(String nameOfBank, double percentRate,double mainMoney,int days)
	{
		double lastMoney = mainMoney + (mainMoney * (percentRate/100));
		return lastMoney;
	}
}
