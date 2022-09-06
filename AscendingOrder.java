/* JFM1T11_Assignment4 :

   Write a program to sort an array of numbers in ascending order by comparing each number with every other number in 
   an array so that after each pass/iteration the smallest element reaches at it’s correct position. 

   Prompt the user input from the terminal.
   
   Sample Input: 4,6,3,9,10
   
   Expected Output: 10,9,6,4,3

 */

import java.util.Scanner;

public class AscendingOrder 
{
  
  public static void main(String[] args)
  {
    int n;
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
        if (arr[i] <arr[j])
        {
          tmp = arr[i];
          arr[i] = arr[j];
          arr[j] = tmp;
        }
      }

      System.out.println(arr[i]);

    }
  }
}
