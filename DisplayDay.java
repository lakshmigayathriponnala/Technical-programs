/*
  JFM1T4_Assignment2:
  Write a program to display the name of the day, based on the number, using the switch statement.
  Prompt the user to input a number between 1 and 7. 
  
  Sample Input: 1
  
  Expected Output: Monday
  
*/

//import statements for java program to read inputs using Scanner class 
import java.util.Scanner;

public class DisplayDay {
public static void main(String args[]){
//declare number variable
   int number;
Scanner s= new Scanner(System.in);
System.out.println("Enter value for displaying day:");
number=s.nextInt();
switch(number)
  {
    case 1:
      System.out.println("Monday");
      break;
      case 2:
      System.out.println("tueday");
      break;
      case 3:
      System.out.println("wednessday");
      break;
      case 4:
      System.out.println("thursday");
      break;
      case 5:
      System.out.println("friday");
      break;
      case 6:
      System.out.println("saturday");
      break;
      case 7:
      System.out.println("sunday");
      break;
    default:
         System.out.println("Invalid selection");
        
      
  }
  }
}