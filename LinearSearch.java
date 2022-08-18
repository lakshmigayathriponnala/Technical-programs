import java.util.Scanner;
class LinearSearch
  {
    public static void main(String args[])
    {
      int n,key,pos=-1;
      Scanner sc=new Scanner(System.in);
      System.out.println("enetr the size");
      n=sc.nextInt();
      int arr[]=new int[n];
      System.out.println("eneter array elements");
      for(int i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();
        }
      System.out.println("eneter elment to be searched");
      key=sc.nextInt();
      for(int i=0;i<n;i++)
        {
        if(key==arr[i])
        {
          pos=i;
          break;
        }
      }
      if(pos==-1)
      System.out.println("Search value is not available in the list");
      else
     System.out.println("Search value is" +key+ " available at"+pos+"position");
      }
  }