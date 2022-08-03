/* JFM1T6_Assignment1:

   Write an Employee class with any 3 properties and create 2 employee objects to store and display the data.
   Prompt the user for the 2 employees to be input from the terminal.

   Sample Input:
   Enter the Empid: 01
   Enter the Name: Sree
   Enter Salary: 1000
   Enter the Empid: 02
   Enter the Name: Balaji
   Enter Salary: 2000

   Expected Output:
   **** Stored data displayed below ****
   Employee id = 01
   Employee name = Sree
   Employee salary = 1000
   Employee id = 02
   Employee name = Balaji
   Employee salary = 2000

*/

import java.util.Scanner;

public class Employee
  {
//Declare the variables
  String name;
  int id;
  long salary;
    Employee()
    {
      
    }
  //Create a method getInput() 

 void  getInput()
  {

//create Scanner object
  Scanner sc=new Scanner(System.in);

//take input from user
  System.out.println("enetr name");
  name=sc.nextLine();
   System.out.println("enetr Empid");
  id=sc.nextInt();
   System.out.println("enetr salary");
  salary=sc.nextLong();

 }

//create display method
public void display()
  {
 
  //Print Employee details
  System.out.println("Employee name="+name);
  System.out.println("Employee id="+id);
  System.out.println("Employee salary="+salary);
 }
}
class Employee1
 {
    public static void main(String args[])
    {
//Create a Employee constructor with the two employees
      Employee e[ ]=new Employee[5]; //creating object
      //check for loop to print two employee details
for(int i=1;i<=3;i++) 
  { 
   e[i]=new Employee();
  e[i].getInput();
  e[i].display();
  }
}
}