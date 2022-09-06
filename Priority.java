/* JFM1T13_Assignment1

     Write a program to create a priority queue, add some colors (string) and print out the elements of the priority queue. 
     Prompt the user input from the terminal.
     
     Sample Input: 
     Enter how many colors you want: 
     5
     Enter Colors: 
     red
     white
     green
     orange
     black
     
     Expected Output:
     Elements of the Priority Queue:  black, green, orange, red, white 
*/

import java.util.*;
import java.util.Scanner;

public class Priority {

//maiin method
public static void main(String args[])
{
//creat Scanner object
Scanner sc=new Scanner(System.in);
//initialize priority queue object
PriorityQueue<String> pq=new PriorityQueue<String>();
//take input from user and add that values to the priority queue object
System.out.println("Enter how many colors you want: ");
int n=sc.nextInt();
System.out.println("Enter colors: ");
for(int i=0;i<n;i++)
{
     pq.add(sc.next());
}
//print result using poll method
System.out.println("Elements of the priority queue:");
String sep=" ";
for(int i=0;i<n;i++){
     System.out.print(sep+pq.poll());
     sep=",";
        }
 }
}