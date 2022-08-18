
/* 3. Write a program to accept firstName, lastName and mobileNumber in string format. 
   Print number of characters in firstName and lastName, and print sum of digits of a mobileNumber. 
   Handle NumberFormatException while converting mobileNumber to long.
*/
import java.util.*;

public class NumberFormatException
  {
  public static void main(String args[])
  {

    long digit,sum = 0;

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter first Name:");
    String fname = sc.next();
    System.out.print("Enter last Name:");
    String lname = sc.next();

    System.out.print("Enter Mobile Number:");
    String mobilenum = sc.next();
    try {
          long num = Long.parseLong(mobilenum);
        

    System.out.println("--------------------------");
    System.out.println("length of firstNameis:" + fname.length());
    System.out.println("length of lastNameis:" + lname.length());
    System.out.println("Mobile number:" + mobilenum);
    while(num>0)
    {
        digit =num%10;  
        sum = sum + digit;  
        num = num/10;  
        
    }  
    System.out.println("Sum of Digits: "+sum);
    }    
    catch (Exception e) 
      {
         System.out.println(e);
      }  
  }
}
