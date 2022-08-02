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
import java.util.*;
class Person {
//declare age
int Age;
//create setters and getters
public void setAge(int a){
     Age=a;
   }
public int getAge(){
    return Age;
  }
}  

class  PersonEncapsulation  {
 
//main method
public static void main(String args[]) {
 
//create Scanner object
Scanner s=new Scanner(System.in);
System.out.println("Enter Age:");
//take input from user
int personage=s.nextInt();
Person obj=new Person();
obj.setAge(personage);
// Try accessing age field of Person directly and check whether it’s accessible
// or not.If not then try accessing it with it’s setter and getter methods.
System.out.println(" Your age:"+obj.getAge());
// Output age  

}  

} 