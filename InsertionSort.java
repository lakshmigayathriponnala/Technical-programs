/* JFM1T11_Assignment3:

   Have you ever arranged the deck of cards, or maybe shirts in your cupboard? What is common between those two things? 
   Well, you put the next card or shirt into their proper position, or we can say you insert the next element in its 
   proper position. Write a program to sort an unsorted array of numbers in the same manner.
   Prompt the user input from the terminal.

   SampleInput: 6,5,4,3,2,1
   
   Expected Output: 1,2,3,4,5,6

*/

import java.util.Scanner;

public class InsertionSort {

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