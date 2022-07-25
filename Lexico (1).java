import java.util.Scanner;
public class Lexico
{
    public static void main(String[] args)
    {
      String s1,s2,s3,s4;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the string s1");
      s1=sc.nextLine();
      System.out.println("enter the string s2");
      s2=sc.nextLine();
      System.out.println("enter the string s3");
      s3=sc.nextLine();
      System.out.println("enter the string s4");
      s4=sc.nextLine();
       /* String s1 = "Ram";
        String s2 = "Ram";
        String s3 = "lakshmi";
        String s4 = "Gayathri";*/
 
        System.out.println(" Comparing strings with compareTo:");
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s1.compareTo(s4));
    }
}