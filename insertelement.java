import  java.util.Scanner;
public class insertelement
{
    public static void main(String a)
    {
           int size;
        Scanner s=new Scanner(System.in);
     
        System.out.println("Enter the number of elements :");
        size=s.nextInt();    
       
        int arr[]=new int[size+1];    //Array Declaration
        System.out.println("Enter the elements of the array :");
        for(int i=0;i<size;i++)     //Array Initialization
        {
            arr[i]=s.nextInt();
        }
        System.out.println("Enter the postion do you want to insert ");
        int pos = s.nextInt();
        System.out.println("Enter the element you want to insert ");
        int ele = s.nextInt();
   
  for(int i=(size-1);i>=(pos-1);i--)
    {
       arr[i+1] =arr[i] ;
     }
      arr[pos-1]=ele;
      System.out.println("Elements after insertion " );
        // shifting elements
        for(int i = 0; i< size; i++)
       {
             System.out.print(arr[i]+ " ");
       }  
      System.out.print(arr[size]);
    }
}

