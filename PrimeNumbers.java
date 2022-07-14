/* JFM1T4_Assignment3:
   Write a program to print all the prime numbers between 2 numbers.
   Prompt the user to enter the 2 numbers.
   
   Sample Input:
   Enter starting Number: 20
   Enter ending Number: 30

   Expected Output:
   Prime numbers between 20 and 30 are : 
   23
   29

*/

//import statements for java program to read inputs using Scanner class 
import java.util.Scanner;

public class PrimeNumbers {

//Add main method here
  public static void main(String args[]){
   
//Declare variables num1, num2, i, count and initialize count as zero
Scanner s= new Scanner(System.in);

System.out.println("Enter Starting Number : ");
int num1 = s.nextInt();
    System.out.println("Enter ending Number : ");
int num2 = s.nextInt();
    while (num1 < num2) {
            boolean flag = false;

            for(int i = 2; i <= num2/2; ++i) {
                // condition for nonprime number
                if(num1 % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag && num1 != 0 && num1 != 1)
                System.out.print(num1 + " ");

            ++num1;
      }
    }


//Take end value as an input and read using scanner object

//check for all the integer numbers which is between the two numbers given, using for loop

/*Inside the loop, check if the number can be divided by other numbers. You will need another loop for this.
  If it is divisble by other numbers (except 1 and itself), then move on to check the next number
  Else, print the prime number and then move on to the next number
*/
 
     
}