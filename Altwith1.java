import java.util.Scanner;
class Altwith1
  {
    public static void main(String args[])
    {
      int n;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size of array");
      n=sc.nextInt();
      int a[]=new int[n];
      System.out.println("enter the  array elements");
      for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
       System.out.println(" the  alternate elements are:");
      for(int i=1;i<n;i=i+2)
        {
          
           System.out.println (a[i]);
        }
       
      
    }
  }