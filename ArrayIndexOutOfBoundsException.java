/* 5. Write a program to find prime numbers from given two arrays and store in 3rd array. 
      Handle ArrayIndexOutOfBoundsException while storing values into 3rd array.
*/
import java.util.Scanner;
public class ArrayIndexOutOfBoundsException {

    public static void main(String args[]) {
      int n,count=0,i,j;
      Scanner sc= new Scanner(System.in);
      System.out.println("enetr the size of array");
        n=sc.nextInt();
      int first[]=new int[n];
      int second[]=new int[n];
      int third[]=new int[n];
      System.out.println("enter first array elements");
      for(i=0;i<n;i++)
        {
          first[i]=sc.nextInt();
        }
       System.out.println("enter second array elements");
      for( i=0;i<n;i++)
        {
          second[i]=sc.nextInt();
        }
       int k=0;
      for (i=0;i<n;i++)
        {
             for( j=1;j<first[i];j++)
             {
              count=0;
             if(first[i]%j==0)
             {
                 count++;
               }

          if(count==0)
          {
            second[k]=first[i];
          }
          k++;
        }
    }
      try
        {
         for( i=0;i<first.length;i++)
         {
           for( j=1;j<second[i];j++)
           {
            count=0;
             if(second[i]%j==0)
             {
                 count++;
               }

             if(count==0)
              {
                 third[k]=first[i];//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 6
   
               }
              k++;
           }
         }
      }
      catch(Exception e)
        {
          System.out.println(e);
        }
}
}
      