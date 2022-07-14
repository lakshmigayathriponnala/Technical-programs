import java.util.Scanner;
class oddArray
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
      for(int i=1;i<n;i+=2)
       System.out.println(a[i]);
    }
  }