/*Java Program to delete an element from an Array*/
import java.util.Scanner;
public class Deleteelement
{
    public static void main(String[] args)
    {
           int size;
        Scanner s=new Scanner(System.in);
     
        System.out.println("Enter the number of elements :");
        size=s.nextInt();    
       
        int arr[]=new int[size];    //Array Declaration
        System.out.println("Enter the elements of the array :");
        for(int i=0;i<size;i++)     //Array Initialization
        {
            arr[i]=s.nextInt();
        }
        System.out.println("Enter the element you want to remove ");
        int ele = s.nextInt();
   
  for(int i=ele;i<size-1;i++)
    {
      if(arr[i] == ele)   //If element found
      {
        // shifting elements
        for(int j = i; j < size- 1; j++)
        {
            arr[j] = arr[j+1];
        }
        break;
      }
    }
     
       System.out.println("Elements after deletion " );
       for(int i = 0; i < size-1; i++)
       {
             System.out.print(arr[i]+ " ");
       }  
    }
}