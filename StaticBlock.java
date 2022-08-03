/* JFM1T7_Assignment5:

   Write a program to create a static method named dispCollegeName to print the value of a static variable  college_name initialized using static block.
   Access this method from another class and display college_name for 3 students who study in same college.
   Prompt the user for the  values to be input from the terminal

   Sample Input:
   Enter the student name: Sri
   Enter the student Roll no: 1
   Enter the student name: Balaji
   Enter the student Roll no: 2
   Enter the student name: Ram
   Enter the student Roll no: 3
   
   Expected Output:
   Student name: Sri
   Student Roll no: 1
   College Name : IIT
   Student name: Balaji
   Student Roll no: 2
   College Name : IIT
   Student name: Ram
   Student Roll no: 3
   College Name : IIT

*/
import java.util.Scanner;
class Student
  {
   int rollno;
    String name;
    static String college_name="IIT";
  public void setName(String n)
         {
            name = n;
         }
         public String getName()
         {
            return name;
         }
         public void setRollno(int r)   
         {
            rollno = r;        
         }
         public int getRollno()
         {
            return rollno;
         }
         //creating dispCollegename static method 
        public static void dispCollegeName()
        {
              System.out.println("College Name :"+college_name);
        }
}
public class StaticBlock {

//main method
  public static void main(String args[])
  {
    
  //initialize Student class constructor for three times
   Student s1=new Student();
    Student s2=new Student();
    Student s3=new Student();
//Create an array and add the 3 student to it
    Student arr[]={s1,s2,s3};
//take input from user 3 times using for loop 
    Scanner sc=new Scanner(System.in);
      for(int i=0;i<3;i++)
      {
        //creating Student class and declaring variables
        System.out.print("Enter the student name : ");
         String s1_name = sc.next();
           arr[i].setName(s1_name);
         System.out.println("Enter the student Roll no : ");
         int r1 =sc.nextInt();
         arr[i].setRollno(r1);
        }
        
        for(int i=0;i<3;i++)
        {
         System.out.println("Student Roll Number : "+arr[i].getRollno());  
         System.out.println("Student Name : "+ arr[i].getName()); 
         Student.dispCollegeName();
        }
         
   }
}   
    
     


