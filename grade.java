import java.util.Scanner
  class grade{

  public static void main(String args[]){

 Scanner s=new Scanner(System.in);
    System.out.println("Enter marks ");

    int marks=s.nextInt();

    if(marks>=50){
      System.out.println("Pass");
    }
    else{
      System.out.println("Fail");
    }
    
  }
}