/* JFM1T9_Assignment5:
	Create an object named obj of the class Main and print the reference to the object using this keyword.
        
        Sample Output:
        Sport name: Football
*/ 
      

import java.util.*;
class  Sport {

// Create a member variable for Sport name
String Sport_name;
public Sport(String Sport_name)
  {
    this.Sport_name=Sport_name;
  }
// Set member variable for Sport name
public void setSport_name(String sport)
  {
    Sport_name=sport;
  }
public String getSport_name(){
    return  Sport_name;
  }
public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
System.out.println("sport name:");
String s=sc.nextLine();
// Create object for Sport class
 Sport obj=new Sport(s);
// Print the value of Sport name using "this" reference
System.out.println("sport name:"+obj.getSport_name());
}

}
