/* JFM1T5_Assignment 4:

   Write a program to create a square matrix and print its transpose.
   Prompt the user input from the terminal.
   
  Sample Input:
  Enter number of rows: 3
  Enter number of columns: 3
  Elements  [1,1] : 2
  Elements  [1,2] : 3
  Elements  [1,3] : 4
  Elements  [2,1] : 1
  Elements  [2,2] : 2
  Elements  [2,3] : 3
  Elements  [3,1] : 4
  Elements  [3,2] : 5
  Elements  [3,3] : 6
   
  Expected Output:
    
  After Transpose Matrix  
  2       1       4
  3       2       5
  4       3       6
   
*/

import java.util.Scanner;

public class TransposeMatrix {

//Define the main method
  public static void main(String args[])
  {
    
      int i, j;  
    Scanner s = new Scanner(System.in);
    System.out.println("Enter total rows : ");  
      
    int row = s.nextInt(); 
    System.out.println("Enter total  columns: "); 
    int column = s.nextInt();  
    int array[][] = new int[row][column];  
   // System.out.println("Enter matrix:");  
    for(i = 0; i <row; i++)  
    {  
        for(j = 0; j <column; j++)   
            {  
              System.out.println("elements:["+(i+1)+","+(j+1)+"]");
            array[i][j] = s.nextInt();  
            System.out.print(" ");  
            }  
    }  
     System.out.println("The above matrix Transpose is ");  
    for(i = 0; i <column; i++)  
        {  
            for(j = 0; j <row; j++)  
            {  
                System.out.print(array[j][i]+" ");  
            }  
            System.out.println(" ");  
        }  
    }  
}
