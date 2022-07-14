//JFM1T3_Assignment2:
/*
1.Write a program to calculate your percentage assuming total marks given. Print the percentage after rounding it off. 
  Allow user to input the marks from the terminal. 

  Sample Input:
        maximum_marks=500 
        total_marks=348

  Expected Output:
        percentage= 70%
       

*/

//import statements for java program to read inputs using Scanner class 
import java.util.Scanner;

public class Percentage  {

//Define the main method
public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
    System.out.println("enter total marks");
    double t=sc.nextDouble();
    System.out.println("enter maximum marks possible:");
    double m=sc.nextDouble();
    double p=(m/t)*100;
     System.out.println("your percentage is:"+(float)p);
}
}
