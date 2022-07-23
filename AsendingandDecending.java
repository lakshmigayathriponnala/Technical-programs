import java.util.Scanner;
public class AsendingandDecending
{  
  public static void main(String[] args)   
  { 
      int n;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size of array");
      n=sc.nextInt();
      int arr[]=new int[n];
     System.out.println("enter the  array elements");
      for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
     System.out.println("After asending order elements are:");  
 
  for (int i = 0; i < arr.length; i++)   
   {  
    for (int j = i + 1; j < arr.length; j++)   
  {   
     int tmp = 0;  
     if (arr[i] > arr[j])   
    {  
     tmp = arr[i];  
    arr[i] = arr[j];  
    arr[j] = tmp;  
    }  
  }  

   System.out.println(arr[i]);  
     
 }  
   System.out.println("After desending order elements are:");  
 
  for (int i = 0; i < arr.length; i++)   
   {  
    for (int j = i + 1; j < arr.length; j++)   
  {   
     int tmp = 0;  
     if (arr[i] < arr[j])   
    {  
     tmp = arr[i];  
     arr[i] = arr[j];  
     arr[j] = tmp;  
    }  
  }  

   System.out.println(arr[i]);  
}  
}
}