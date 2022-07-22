
 import java.util.*;
class sub{
  public static void main(String args[]){
    int i,j,row1,row2,col1,col2;
    Scanner s=new Scanner(System.in);
    System.out.println("enter first row ele in matrix:");
    row1=s.nextInt();
    System.out.println("enter first col ele in matrix:");
    col1=s.nextInt();
     System.out.println("enter second row ele in matrix:");
    row2=s.nextInt();
    System.out.println("enter second col ele in matrix:");
    col2=s.nextInt();
   int a[][]=new int[row1][col1]; //allocating memory in matrix
    System.out.println("enter first matrix in element");
    for(i=0;i<row1;i++){
      for(j=0;j<col1;j++){
        a[i][j]=s.nextInt();  
      }
    }
    int b[][]=new int[row2][col2]; //allocating memory in matrix
    System.out.println("enter second matrix in element");
    for(i=0;i<row2;i++){
      for(j=0;j<col2;j++){
        b[i][j]=s.nextInt();  
      }
    }
    int c[][]=new int[row1][col1];
       
    for(i=0;i<row1;i++){
      for(j=0;j<col1;j++){
        c[i][j]=a[i][j]-b[i][j];
    }
    }
    System.out.println("Matrix after addition:");
    for(i=0;i<row1;i++){
      for(j=0;j<col1;j++){
        System.out.print(c[i][j]+" ");
      }
        System.out.println(" ");
    }
  }
}