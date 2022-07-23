import java.util.Scanner;

class mid
  {
  public static void main(String args[]) 
  {
    int n;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size of array");
      n=sc.nextInt();
      int arr[]=new int[n];
      int mid[]=new int[n];
    int startIndex = 0, lastIndex = arr.length - 1;
    System.out.println("enter the  array elements");
      for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
    int midIndex = startIndex + (lastIndex-startIndex)/2;
    System.out.println("The mid index is "+midIndex+" and the element at mid is "+arr[midIndex]);
   
  }

}
    
    