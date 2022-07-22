import java.util.Scanner;

class LowerTriangle {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int row, col;
    System.out.println("eneter row elements in matrix");
    row = in.nextInt();
    System.out.println("eneter col elements in matrix");
    col = in.nextInt();

    int a[][] = new int[row][col];
    // Input the 2-D Array
    System.out.println("Enter all the elements of matrix:");
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        a[i][j] = in.nextInt();
      }
    }

    // Print the Original 2D Array
    System.out.println("Original Matrix:");
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        System.out.print(a[i][j] + " ");
      }
      System.out.println("");
    }
    System.out.println("The Lower Triangular Matrix is:");
    for (int i = 0; i < row; i++) 
    {
      for (int j = 0; j < col; j++) 
      {
        if (i > j)
        {
          System.out.print(a[i][j] + " ");
        } 
        else 
        {
          System.out.print("0" + " ");
        }
      }
      System.out.println("");
    }
  }
}