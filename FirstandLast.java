import java.util.Scanner;
public class FirstandLast
  {
    public static void main(String args[])
    {
      int n,p=1,d;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a value");
      n=sc.nextInt();
      while(n>0)
      {
        d=n%10;
        p=p*d;
        n=n/10;
      } 
        System.out.println("the product of given number is:"+p);
      
    }
    
  }