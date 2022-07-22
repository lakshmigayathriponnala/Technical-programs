import java.util.*;
class twod{
  public static void main(String args[]){
     int i,j,row,col;
    Scanner s= new Scanner(System.in);
    System.out.println("enter no of row in matrix");
    row=s.nextInt(); //to read the row elements in an matrix
    System.out.println("enter no of col in matrix");
    col=s.nextInt();
    int a[][]=new int[row][col]; //allocating memory in matrix
    System.out.println("enter matrix in element");
    for(i=0;i<row;i++){
      for(j=0;j<col;j++){
        a[i][j]=s.nextInt();  
      }
    }
       for(i=0;i<row;i++){
         
      for(j=0;j<col;j++){
        System.out.println(a[i][j]);
        }
      }
  }
} 