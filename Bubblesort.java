import java.util.Scanner;

class Bubblesort {
  public static void main(String args[]) 
  {
    int n, temp = 0;
    System.out.println("enter thesize of array");
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("enter the elements");
    for (int i = 0; i < n; i++)
      arr[i] = sc.nextInt();
    System.out.println("before swapping");
    for (int i = 0; i < arr.length; i++) 
    {
      System.out.println(arr[i]);
    }
    for (int i = 0; i < n - 1; i++) 
    {
      for (int j = 0; j < n - 1; j++) 
      {
        if (arr[j] > arr[j + 1]) 
        {
          temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
    System.out.println("after swapping");
    for (int i = 0; i < arr.length; i++) 
    {
      System.out.println(arr[i]);
    }

  }
}