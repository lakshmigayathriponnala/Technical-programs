import java.util.Scanner;
class Evenandoddarray
  {
    public static void main(String args[])
    {
      int n,evencount=0,oddcount=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size of array");
      n=sc.nextInt();
      int a[]=new int[n];
      System.out.println("enter the  array elements");
      for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
      for(int i=0;i<n;i++)
        {
          if(a[i]%2==0)
          {
            evencount++;
          }
          else
          {
            oddcount++;
          }
        }
      System.out.println(" the total noof even elements"+evencount);
      System.out.println(" the total noof odd elements"+oddcount);
      
    }
  }