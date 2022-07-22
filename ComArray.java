import java.util.Scanner;
class ComArray
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
      System.out.println("enter the  array elements");
      for(int i=0;i<n;i++)
        b[i]=sc.nextInt();
      for(int i=0;i<n;i++)
        {
        for(int j=0;j<n;j++)
        {
          if(a[i]==b[j])
          {
            
          
         System.out.println (a[i]);
          }
        }
      } 
      
    }
  }