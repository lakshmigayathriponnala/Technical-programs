/*  JFM1T7_Assignment4:

    Write a program to declare a static variable roll_number inside student class. Create 3 student objects and print their names and roll numbers.
    Hint: Use increment operator to get different value of roll_number for 3 students.

   
    Expected Output:
    Roll no:1  Name: Shree 
    Roll no:2  Name: Balaji
    Roll no:3  Name: Ajay
*/
class Student
  {
    static int rollno=1;
    String name;
    public void setName(String s)
    {
      name=s;
    }
    public String getName()
    {
      return name;
    }
    public static void setRollno(int rollno)
    {
			Student.rollno = rollno;
		}
     public static int getRollno() 
    {
			return rollno;
		}
		
  }
public class StaticVariable {

//main method
  public static void main(String args[])
  {
    
  //initializing Student class constructor by 3 times and passing 3 student names
    Student s1=new Student();
    s1.setName("Lakshmi");
		Student s2 = new Student();
		s2.setName("somansh");
		Student s3 = new Student();
		s3.setName("rambabu");

//displaying student name and roll number
      System.out.println("Roll No : "+(s1.rollno++)+"  Name : "+s1.getName());
    	System.out.println("Roll No : "+(s2.rollno++)+"  Name : "+s2.getName());
    	System.out.println("Roll No : "+(s3.rollno++)+"  Name : "+s3.getName());
 }
}

