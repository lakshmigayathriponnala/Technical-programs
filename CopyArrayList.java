/*   JFM1T12_Assignment3:

     Write a program to copy one arraylist into another.
     Prompt the user input from the terminal.
     
     Sample Input:
     Enter how many numbers you want: 
     5
     Enter Number 0
     5
     Enter Number 1
     4
     Enter Number 2
     3
     Enter Number 3
     2
     Enter Number 4
    
    Expected Output:
    -----Iterating over the second ArrayList----
     5
     4
     3
     2
     1

*/

import java.util.*; 
import java.util.ArrayList; 

class CopyArrayList  { 

//main method
public static void main(String args[])
{
//declare variables
int n;
//create Scanner object
Scanner sc=new Scanner(System.in);
//take input from user
ArrayList<Integer> list=new ArrayList<Integer>();
System.out.println("Enter how many numbers: ");
n=sc.nextInt();
for(int i=0;i<n;i++)
{
     System.out.print("Enter the number " +i+ ":");
     list.add(sc.nextInt());
}
// Assign the first reference to second
ArrayList<Integer> list2=new ArrayList(list);
// Iterat over second ArrayList and print
System.out.println("---------Iterating over the Second arraylist----------");
for(Integer v:list2){
     System.out.println(v);
}
}
}