import java.util.Scanner;
public class Example
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int n,fact=1;
      System.out.println("enetr n value");
      n=sc.nextInt();
    for(int i=1;i<=n;i++)
        {
          fact=fact*i;
        }
       System.out.println("factorial o of a given number is:"+fact);
    }
  }
      