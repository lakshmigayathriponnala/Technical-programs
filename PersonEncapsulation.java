/*JFM1T9_Assignment1:
    Write a program applying Encapsulation to age field in Person class that cannot be accessed directly from outside class
    but can be accessed using setter and getter methods. 
    Steps to follow:
    Step1: Add age attribute to the Person class 
    Step 2: Add setter and getter methods for the age attribute  
    Prompt the user for the  values to be input from the terminal.

    Sample Input:
    Enter age: 32

    Expected Output:
    Your age: 32
    
     
*/
import java.util.Scanner;
class Person { 
//declare age 
  private int age;

//create setters and getters
   public void setAge(int b)
  {
    age=b;
  }
  public int getAge()
  {
    return age;
  }
    
}  

class PersonEncapsulation { 

public static void main(String args[]) { 

//main method
  //create Scanner object
  Scanner sc=new Scanner(System.in);

//take input from user
  System.out.println("enter the age:");
  int b1=sc.nextInt();

// Try accessing age field of Person directly and check whether it’s accessible
// or not.If not then try accessing it with it’s setter and getter methods. 
  Person p=new Person();
  p.setAge(b1);
  System.out.println("your age:"+p.getAge());
// Output age  

}   

} 