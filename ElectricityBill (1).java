/* 4. Write a program to Calculate Electricity Bill. Accept last month units and present units in string format from the user. 
      Calculate Electricity Bill for last month units, otherwise throw ArithementicException along with some error message.  
      Handle NumberFormatException while converting units into numerical value. 

  Calculate Electricity Bill based on following charges:

  ==> first 50 units charges are: 0.50 per/unit
  ==> next 100 units charges are: 1.75 per/unit
  ==> next 100 units charges are: 2.50 per/unit
  ==> above 250 units charges are: 2.90 per/unit

  Add 10% surcharge on overall bill.

*/

import java.util.*;
public class ElectricityBill {

    public static void main(String args[]) //throws Exception
    {
      Scanner s=new Scanner(System.in);
      System.out.print("Enter last month units and present units:");
      String lunits=s.next();
      System.out.print("Enter Present  month units and present units:");
      String punits=s.next();
      int lunits1=0;
      int punits1=0;
      double bill=0;
     try
       {
          lunits1=Integer.parseInt(lunits);
          punits1=Integer.parseInt(punits);
         try
          {
            throw new Exception("Invalid units");
          }
         catch(Exception e)
        {
            System.out.println(e);
        }
      }
         catch(Exception e)
       {
           System.out.println(e);
       }
         
         if(lunits1>punits1)
         {
          }
  else
      {
          int units=punits1-lunits1;
          if(units<=50) 
          {
             bill= (0.50*units);
          }
      else if(units<=150) 
      {
             bill=(50*0.50)+(units-50)*1.75;
      }
      else if(units<=250)
      {
          bill=(50*0.50)+(100*1.75)+(units-150)*2.50;
      }
     else
      {
        bill=(50*0.50)+(100*1.75)+(100*2.50)+(units-250)*2.90;
      }
   }
bill=bill+(bill/100)*10;
System.out.println("Bill : "+bill);

 }
}

    

