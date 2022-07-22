import java.util.Scanner;
class diagonal1
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
       int row,col;
      System.out.println("eneter row elements in matrix");
      row=in.nextInt();
      System.out.println("eneter col elements in matrix");
      col=in.nextInt();
        
        int a[][] = new int[row][col];
        //Input the 2-D Array
        System.out.println("Enter all the elements of matrix:");
        for (int i = 0; i < row; i++) 
        {
            for (int j = 0; j < col; j++) 
            {
                a[i][j] = in.nextInt();
            }
        }
        
        //Print the Original 2D Array
        System.out.println("Original Matrix:");
        for (int i = 0; i < row; i++) 
        {
            for (int j = 0; j < col; j++) 
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
        
        //Print the Top element of left Diagnonal 
        System.out.println("Top Element of left Diagonal :" + a[row-1][col-1]);
        
        //Print the left Diagnonal elements
        System.out.println("Left Diagnonal elements:");
        for (int i = 0; i < row; i++) 
        {
            for (int j = 0; j < col; j++) 
            {
                if(i==j) // condition for right diagonal
                    System.out.println(a[i][j] + " ");
            }
        }
      //Print the Top element of Right Diagnonal 
        System.out.println("Top Element of Right Diagonal :" + a[0][row-1]);
        
        //Print the Right Diagnonal elements
        System.out.println("Right Diagnonal elements:");
        for (int i = 0; i < row; i++) 
        {
            for (int j = 0; j < col; j++) 
            {
                if(i+j == row-1) // condition for right diagonal
                    System.out.println(a[i][j] + " ");
            }
        }
    }
}