/* 
   JFM1T5_Assignment 5:
   Write a program to find and print the maximum element in a two-dimensional array with its index position.
   Prompt the user input from the terminal.
   
   Sample Input:
   Enter number of row and column: 
   2
   3
   Enter arr [ 0 ] [ 0] : 1
   Enter arr [ 0 ] [ 1] : 2
   Enter arr [ 0 ] [ 2] : 3

   Enter arr [ 1 ] [ 0] : 4
   Enter arr [ 1 ] [ 1] : 5
   Enter arr [ 1 ] [ 2] : 6
   
   Expected Output:
   Largest element in array is 6 and its index position is arr [ 1 ] [ 2 ]  

*/

import java.util.Scanner;

public class TwoDimentionalArray {
  public static void main(String[] args)
  {
    Scanner sc= new Scanner(System.in);
     int row;
     int col;
     
     System.out.println("Enter number of row and column:");
      row=sc.nextInt();
      col=sc.nextInt();
     int array[][]= new int[row][col];
      for(int i=0; i<row; i++)
      {
        for(int j=0; j<col;j++)
        {
          System.out.println("Enter arr["+i+"] ["+j+"]");
          array[i][j]= sc.nextInt();
         }
       }
      int max = Integer.MIN_VALUE;
      int temp1=0,temp2=0;
      for(int i=0; i<row; i++)
      {
         for(int j =0; j<col; j++)
         {
            if(max<array[i][j])
            {
              max = array[i][j];
               temp1=i;
               temp2=j;
             }
          }
      } 
    System.out.println("Maximum number in the array is "+ max+" with index value[" +temp1+"]["+temp2+"]");
    System.out.println();
      }              

  }

