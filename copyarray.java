import java.util.Scanner;
class copyarray
  {
    public static void main(String args[])
    {
      int n;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size of array");
      n=sc.nextInt();
      int a[]=new int[n];
      int b[]=new int[n];
      System.out.println("enter the  array elements");
      for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
      for(int i=0;i<n;i++)
        {
          b[i]=a[i];
        }
      System.out.println(" the copy of array elements are ");
      for(int i=0;i<n;i++)
        {
           System.out.println (+b[i]);
        }
       
      
    }
  }