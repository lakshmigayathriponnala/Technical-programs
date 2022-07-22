import java.util.*;
class transpose{
  public static void main(String args[]){
    int i,j,row,col;
    Scanner s=new Scanner(System.in);
    System.out.println("enter row elements in matrix");
    row=s.nextInt();
    System.out.println("enter col elements in matrix");
    col=s.nextInt();
    System.out.println("enter matrix");
    int a[][]=new int[row][col];
    for(i=0;i<row;i++){
        for(j=0;j<col;j++){
            a[i][j]=s.nextInt();
        }
    }
    int b[][]=new int[row][col];
   
   for(i=0;i<row;i++){
        for(j=0;j<col;j++){
              b[i][j]=a[j][i];
        }
   }
   /* System.out.println(" printing matrix without transpose");
    for(i=0;i<row;i++){
        for(j=0;j<col;j++){
             System.out.print(a[i][j]+" ");
        }
         System.out.println(" ");
    }*/
    System.out.println("printing martix  transpose matrix   ");
    for(i=0;i<row;i++){
        for(j=0;j<col;j++){
             System.out.print(b[i][j]+" ");
        }
         System.out.println(" ");
    }
  }