/* JFM1T11_Assignment1:

   Write a program to find a number in an integer array. If found print the number and the array index at which it is found. 
   Prompt the user input from the terminal.
   
   Sample Input: 2,4,6,1,7,8,9
   Enter number to search x= 9

   Expected Output: 9 found at index 6
   
   Enter number to search x= 12
   Expected Output: Sorry! 12 is not found in array.
   
*/

import java.util.Scanner;

public class FindNumberInArray {

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
      System.out.println("eneter number to be searched");
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
      System.out.println("Sorry!"+key+"is not found in array");
      else
     System.out.println(key+ " found at index " +pos);
      }
  }