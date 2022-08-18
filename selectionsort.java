import java.util.Scanner;
class selectionsort
  {
    public static void main(String args[])
    {
      int n,temp=0;
      System.out.println("enter thesize of array");
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
     int arr[]=new int[n];
      System.out.println("enter the elements");
      for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
      System.out.println("before swapping");
      for(int i=0;i<arr.length;i++)
        {
          System.out.println(arr[i]);
        }
      for(int i=0;i<n-1;i++)
        {
          for(int j=i+1;j<n;j++)
            {
              if(arr[i]>arr[j])
              {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
              }
            }
        }
      System.out.println("after swapping");
      for(int i=0;i<arr.length;i++)
        {
          System.out.println(arr[i]);
        }
        
    }
  }