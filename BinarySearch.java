import java.util.Scanner;

public class BinarySearch 
{
  public static void main(String[] args)
  {
    int n,pos = -1,key;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the size of array");
    n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("enter the  array elements");
    for (int i = 0; i < n; i++)
      arr[i] = sc.nextInt();
    System.out.println("After asending order elements are:");

    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        int tmp = 0;
        if (arr[i] > arr[j])
        {
          tmp = arr[i];
          arr[i] = arr[j];
          arr[j] = tmp;
        }
      }

      System.out.println(arr[i]);

    }
    System.out.println("enter the  elements to be searched");
    key=sc.nextInt();
    
    int low = 0;
    int high =n-1;
    while (low <= high) 
    {
      int mid = (low + high) / 2;
      if (key== arr[mid]) 
      {
        pos = mid;
        break;
      } 
      else if (key< arr[mid]) 
      {
        high = mid - 1;
      } 
      else 
      {
        low = mid + 1;
      }
    }

    if (pos == -1)
      System.out.println("Search value is not available in the list");
    else
      System.out.println("Search value is" + key+ " available at" + pos + "position");
  }
}
