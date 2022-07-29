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
import java.util.Scanner;
class BankAccount { 
//declare account_number , account_balance
  private long BankAccountNumber;
  private float CurrentBalance;

//create getters and setters
  public void setBankAccountNumber(long b)
  {
    BankAccountNumber=b;
  }
  public void setCurrentBalance(float bal)
  {
    CurrentBalance=bal;
  }
  public long getBankAccountNumber()
  {
    return BankAccountNumber;
  }
  
   public float getCurrentBalance()
  {
    return CurrentBalance;
  }
}  

class ExpertHacker { 

public static void main(String args[]) { 

//main method
  //create Scanner object
  Scanner sc=new Scanner(System.in);
  //Take input from user
  System.out.println("enter the banck account number");
  long b1=sc.nextLong();
   System.out.println("enter the current balance");
  float bal1=sc.nextFloat();
  //Create an object of BankAccount class and set account_number and the account_balance
  BankAccount a=new BankAccount();

// Try accessing fields of BankAcccount class and check whether it's accessible 
a.setBankAccount(b1);
// or not. If not then try accessing it with it’s setter and getter methods. 
a.setCurrentBalance(bal1);
// Print account_number and account_balance 
  System.out.println("Bank account number:"+a.getBankAccountNumber());
   System.out.println("current balance:"+a.getCurrentBalance());
}   

} 