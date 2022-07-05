import java.util.Scanner;

public class day {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter week number");
		int week=sc.nextInt();
		if(week<=1)
		{
			System.out.println("sunday");
		}
		else if(week<=2)
		{
			System.out.println("monday");
		}
		
		else if(week<=3)
		{
			System.out.println("tuesday");
		}
		else if(week<=4)
		{
			System.out.println("wedness day");
		}
		else if(week<=5)
		{
			System.out.println("thursday");
		}
		else if(week<=6)
		{
			System.out.println("friday");
		}
		else if(week<=7)
		{
			System.out.println("saturday");
		}
		else
		{
			System.out.println("invalid week number");
		}
		
		
		
	}
}
