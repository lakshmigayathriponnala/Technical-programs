/* JFM1T5_Assignment3:

   Write a program to store the temperature of your city for last 7 days and print the lowest temperature of the week.
   Prompt the user input from the terminal.
   
   Sample Input:
   Enter number of days 
   3
   Enter the temperature of Day :1
   88
   Enter the temperature of Day :2
   34
   Enter the temperature of Day :3
   0 
   
   Expected Output:
   The lowest temperature of the week 3 is 0.0 celsius

*/


import java.util.Scanner;
import java.util.*;

public class Temperature
  {
  
  public static void main(String args[]){
int n;
int[] arr = new int[10];
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter Days of the Week");
    n=sc.nextInt();

  for(int j=1;j<n;j++){
   for(int i=0; i<n; i++)  
     {  
       System.out.println("Enter Temparature of day: "+j++);
       arr[i]=sc.nextInt();  
     }  
  }
  
int min = arr[0];  
   for (int i = 0; i < arr.length; i++) 
   {  
              if(arr[i] <min)  
               min = arr[i];    
   }
   System.out.println("-----------Output-----------");
    System.out.println(" The lowest temperature of the week"+" "+n+"is"+ " "+(float)min+" " +"celsius"); 
  }
  }
