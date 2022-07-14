/*  JFM1T2_Assignment5:

    Write a program to print the sum of two numbers without using + operator.
    Prompt the user input from the terminal.
    
    Sample Input:
    Enter first number: 
    22
    Enter second number: 
    50
    
    Expected Output:
    The sum of two numbers is: 72
*/

//import statements for java program to read inputs using Scanner class
import java.util.Scanner;

public class SumWithoutPlus {

public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter first number: ");
  int a=sc.nextInt();
 System.out.println("Enter second number: ");
  int b=sc.nextInt();
   if (b > 0) 
   {
            while (b > 0) 
            {
                a++;
                b--;
            }
   }
 if (b < 0) {
            while (b < 0) {
                a--;
                b++;
  }
 }
  System.out.println("The sum of two numbers is:"+a);
  

}
   }