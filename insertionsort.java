import java.util.Scanner;
class insertionsort
  {
    public static void main(String args[])
    {
      int n,t,i,j;
      System.out.println("enter the size of array");
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
     int arr[]=new int[n];
      System.out.println("enter the elements");
      for( i=0;i<n;i++)
        arr[i]=sc.nextInt();
      System.out.println("before swapping");
      for( i=0;i<arr.length;i++)
        {
          System.out.println(arr[i]);
        }
      for(i=1;i<n;i++)
        {
              t=arr[i];
              j=i-1;
             while(j>=0 && t<arr[j])
               
                {
                  arr[j+1]=arr[j];
                  j--;
                }
          arr[j+1]=t;
            
        }
      System.out.println("After swapping");
      for( i=0;i<arr.length;i++)
        {
          System.out.println(arr[i]);
        }
        
    }
  }