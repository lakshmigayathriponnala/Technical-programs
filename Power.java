import java.util.Scanner;
public class Power
{
  public static void main(String args[])  
  {
  Scanner sc=new Scanner(System.in);
  int base,exponent;
  System.out.println("enter base value");
base=sc.nextInt();
System.out.println("enter exponent value");
exponent=sc.nextInt();
long power=1;
while(exponent!=0)
  {
    power=power*base;
    exponent--;
  }
System.out.println("the power of given number is:"+power);

  }

}