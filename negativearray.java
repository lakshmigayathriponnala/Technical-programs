import java.util.Scanner;
class negativearray
  {
    public static void main(String args[])
    {
      int n,count=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size of array");
      n=sc.nextInt();
      int a[]=new int[n];
      System.out.println("enter the  array elements");
      for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
      for(int i=0;i<n;i++)
        {
          if(a[i]<0)
          {
            count++;
          }
        } 
      System.out.println(" the total noof negative elements"+count);
      
      
    }
  }