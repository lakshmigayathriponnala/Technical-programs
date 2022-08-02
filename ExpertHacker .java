/*JFM1T9_Assignment2:
    Write a BankAccount class with members account_number and account_balance  and prevent other class objects 
    (assuming them as hackers who can steal your confidential information) to access BankAccount details.
    Steps to Follow:
    Step1: Create account_number and account_balance as member variables for BankAccount class
    Step 2: Add setter and getter methods for the above member variables 
    Prompt the user for the  values to be input from the terminal.

    Sample Input:
    Enter BankAccount Number : 6789023
    Enter Current Balance    : 67,000.89

    Expected Output:
    BankAccount Number : 6789023
    Current Balance    : 67000.89
    
*/
import java.util.*;
 class BankAccount 
 {
//declare account_number , account_balance
 private long BankAccount_Number ;
 private float Current_Balance;
//create getters and setters
public void setBankAccount_Number(long acc) 
   {
     BankAccount_Number=acc;
   }
public void setCurrent_Balance(float bal)  
   {
     Current_Balance=bal;
   }
public long getBankAccount_Number()
   {
   return BankAccount_Number ;
   }
public float getCurrent_Balance()
   {
   return Current_Balance;
   }  
}
class ExpertHacker
  {
 
//main method
public static void main(String args[]) 
    {

//create Scanner object
Scanner s=new Scanner(System.in);
System.out.println("enter BankAccount_Number: ");
long  account_number=s.nextLong();
//Take input from user
System.out.println("enter Current_Balance:");
 float account_balance =s.nextFloat();
 
//Create an object of BankAccount class and set account_number and the account_balance
BankAccount obj=new BankAccount();
// Try accessing fields of BankAcccount class and check whether it's accessible
  obj. setBankAccount_Number(account_number);
  obj. setCurrent_Balance( account_balance);
// or not. If not then try accessing it with it’s setter and getter methods.
System.out.println("Bank account number:"+obj.getBankAccount_Number());
 System.out.println(" Current balance:"+obj.getCurrent_Balance());
// Print account_number and account_balance
  }  
} 
