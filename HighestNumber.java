/* JFM1T4_Assignment1:
   Write a program to find the highest among the given 3 numbers.
   Prompt the user for the 3 numbers to be input from the terminal.

   SampleInput: 
   Enter the first number: 11
   Enter the second number: 22
   Enter the third number: 1

   Expected Output:
   22 is highest number
 	
*/

//import statements for java program to read inputs using Scanner class 
import java.util.Scanner;

public class HighestNumber {
     
public static void main(String args[]){
  int number1,number2,number3,largest,temp;
    Scanner s= new Scanner(System.in);
 System.out.println("Enter the first number");
 number1=s.nextInt();
  System.out.println("Enter the second number");
 number2=s.nextInt();
  System.out.println("Enter the third number");
 number3=s.nextInt();
 temp=number1>number2?number1:number2;
  largest=number3>temp?number3:temp;
  System.out.println("the largest number is"+largest);
  }

}