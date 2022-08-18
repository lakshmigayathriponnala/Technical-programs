/* 2. Write a program to perform ATM operations such as deposit, withdraw and balance enquiry. Display list of options for user selection. 
   Accept option from the user and execute specified method. throw Exception when user trying to withdraw amount more than 3 times.
*/

import java.util.Scanner;
class ATMOperations1
{
   int wcount=1;
   double bal=10000;
  Scanner s=new Scanner(System.in);
  public void deposit() 
  {
     int amt=0;
     System.out.println("Enter deposit amount");
    amt=s.nextInt();
   bal=bal+amt;
   System.out.println("Available bal : "+bal);
 }

  public void withdraw()
  {
     int amt=0;
     System.out.println("Enter withdraw amount");
     amt=s.nextInt();
     bal=bal-amt;
     wcount++;
     System.out.println("Available bal : "+bal);
  }
public void balenquiry() 
  {
     System.out.println("Available bal : "+bal);
  }
public void viewoptions()
  {
   int option;
   System.out.println("\n1. Deposit");
   System.out.println("2. withdraw");
   System.out.println("3. balance enquiry");
   System.out.println("0. Exit");
   System.out.println("Enter your option");
   option=s.nextInt();
   switch(option)
   {
     case 1:
       {
          deposit();
          viewoptions();
          break;
       }
     case 2:
       {
          if(wcount<=3)
          {
          withdraw();
          viewoptions();
         }
         else
          {
            try
              {
               throw new Exception("Your Withdraw limit is over");
              }
            catch(Exception e)
              {
                System.out.println(e);
              }
          
          }
           break;
       }

    case 3:
         {
           balenquiry();
           viewoptions();
           break;
         }
   case 4: 
       {
         System.out.println("Thank you visit again");
         break;
       }
  default:
       {
          System.out.println("Invalid option");
       }
    }
  }
}
class  ATMOperations
{
       public static void main(String args[])throws Exception
  {
    ATMOperations1 obj=new ATMOperations1();
    obj.viewoptions();
  }
}