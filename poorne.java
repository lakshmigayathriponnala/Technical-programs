import java.util.Scanner;

public class poorne {
	public static void main(String args[])
	  {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter a value");
	    int a=sc.nextInt();
	    if(a>0)
	    {
	   System.out.println("the given number is positive");
	      
	    }
	    else if(a<0)
	    {
	    System.out.println("the given number is negative");
	    }
      else if(a==0)
      {
       System.out.println("the given number is zero");
      }
    
}
}