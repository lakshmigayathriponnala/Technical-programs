//JFM1T3_Assignment4:
/*
1.Write a program to store your best friend's mobile number in a variable and print the last 4 digits. Consider the following sample for reference.
  Mobile number should accept only 10 digits. Not less than 10 digits or greater than 10 digits. 
  Allow user to input the phone number from the terminal

  Sample Input:
        mobileNum=9393927890

  Expected Output:
        Your friend's mobile number ends with ******7890

*/

import java.util.Scanner;
public class MobileNumber {
 public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter mobile number =");
    String num=sc.nextLine();
    String lastfour="";
    if(num.length()>4)
    {
      lastfour=num.substring(num.length()-4);
    }
    else{
      lastfour=num;
    }
    System.out.println("last 4 digits of your number **"+lastfour);
  }
}
