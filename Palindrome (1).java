import java.util.Scanner;
public class Palindrome{
  public static void main(String args[])
  {
    int n,rev=0,d,t;
    Scanner sc=new Scanner(System.in);
    System.out.println("enetr n value:");
    n=sc.nextInt();
    t=n;
    while(n>0)
      {
        d=n%10;
        rev=(rev*10)+d;
        n=n/10;
      }
    if(t==rev)
    {
     System.out.println("the  given numberis Palindrome:");
    } 
      else
    {
      System.out.println("the  given numberis not Palindrome:"); 
    }
    
  }
}
