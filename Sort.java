 import java.util.*;  
public class  Sort
{  
public static void main(String[] args)  
{  
//defining an array of integer type  
int n;
Scanner s=new Scanner(System.in);
System.out.println("Enter no of array elements");
n=s.nextInt();
int [] array = new int [n] ;
System.out.println("Enter array elements");
for (int i = 0; i <n ; i++)  
array[i]=s.nextInt();
//invoking sort() method of the Arrays class  
Arrays.sort(array);  
System.out.println("Elements of array sorted in ascending order: ");  
//prints array using the for loop  
for (int i = 0; i <n ; i++)  
{      
System.out.println(array[i]);  
}  
}  
}  