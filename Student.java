import java.util.*;
class Student{
  Scanner s=new Scanner (System.in);
  String name=s.nextLine();
}
class Student1
{
  public static void main(String args[]){
    Student obj=new Student();
    if(obj.name.length()==0)
      System.out.println("Unknown");
    else
      System.out.println(obj.name);
  }
}
