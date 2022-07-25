import java.util.Scanner;
class concatenate
  {
    public static void main(String args[])
    {
      String s,s1;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the string");
      s=sc.nextLine();
      System.out.println("enter another  string");
      s1=sc.nextLine();
      String s2=s.concat(s1);
      System.out.println(s2);
    }
  }