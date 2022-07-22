import java.util.Scanner;
class diagonal
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int n;
      System.out.println("eneter the size of array");
      n=in.nextInt();
        
        int a[][] = new int[n][n];
        //Input the 2-D Array
        System.out.println("Enter all the elements of matrix:");
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                a[i][j] = in.nextInt();
            }
        }
        
        //Print the Original 2D Array
        System.out.println("Original Matrix:");
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
        
        //Print the Top element of Right Diagnonal 
        //System.out.println("Top Element of Right Diagonal :" + a[0][n-1]);
        
        //Print the Right Diagnonal elements
        System.out.println("Right Diagnonal elements:");
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                if(i+j == n-1) // condition for right diagonal
                    System.out.println(a[i][j] + " ");
            }
        }
      // System.out.println("Top Element of left Diagonal :" + a[n-1][n-1]);
        
        
        System.out.println("Left Diagnonal elements:");
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                if(i==j) // condition for left diagonal
                    System.out.println(a[i][j] + " ");
            }
        }
    }
  
      
}