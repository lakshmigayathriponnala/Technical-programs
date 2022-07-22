import java.util.Scanner;
class index
  {
    public static void main(String args[])
    {
      int n,index=0,element;
      
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size of array");
      n=sc.nextInt();
      int a[]=new int[n];
      System.out.println("enter the  array elements");
      for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
       System.out.println("enter elements to find the index:");
      element=sc.nextInt();
      for(int i=0;i<n;i++)
        {
          if(a[i]==element)
            index=i;
        }
      System.out.println("the index element are:"+index);
    }
  }
      