/*  JFM1T12_Assignment1:

    Write a program to search an element in an arraylist.  
    Prompt the user input from the terminal.
    
    Sample Input 1:
    Enter how many Elements you want: 
    5
    Enter Elements: 
    Red
    Green
    Orange
    White
    Black
    
    Enter Search Element: 
    Red
    
    Expected Output:
    Red Element is present

    Sample Input 2: 
    Enter Search Element: 
    yellow
    
    Expected Output:
    yellow Element is not present

*/

import java.util.Scanner;
import java.util.ArrayList; 
import java.util.LinkedHashSet;
class SearchingElement {

//main method
public static void main(String args[])
{
//declare variables
int size;
String key;
//create scanner object
Scanner sc=new Scanner(System.in);
ArrayList<String> input=new ArrayList<String>();
//take input from user
System.out.println("Enter how many numbers you want :");
size=sc.nextInt();
for(int i=0;i<size;i++)
{
    System.out.print("Enter the element "+i+ " : ");
    input.add(sc.next());
}
System.out.print("Enter search elements ");
key=sc.next();
//creat an object of LinkedHashSet class 
//check if the search element is present on the list using contains method
if(input.contains(key))
{
    System.out.println(key  + " Element is present");
     
}
//If element found then print element is present else then print element not present
else
{
    System.out.println(key + " Element is not present");
}
}
}