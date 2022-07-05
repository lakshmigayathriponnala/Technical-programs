import java.util.Scanner;
  public class divisibleby5and11{
    public static void main(String args[])
    {
      int number;
      Scanner sc=new Scanner(System.in);
      System.out.println("please enter any number to check wheather it is divisible by 5 and 11::");
      number=sc.nextInt();
      if((number%5==0)&&(number%11==0))
      {
        System.out.println("given number "+number+" is divisible by 5 and 11");
      }
      else
      {
       System.out.println("given number "+number+" is not divisible by 5 and 11");
      }
    }
  }
  
