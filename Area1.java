import java.util.*;
class Area{
  int length,breadth,area;
  void setDim(int l,int b)
  {
    length=l;
    breadth=b;
  }
int getArea(){
  area=length*breadth;
  return area;
}
}
class Area1{
  public static void main(String args[])
  {
    Scanner s= new Scanner(System.in);
     System.out.println("enter length");
    int l=s.nextInt();
     System.out.println("enter breadth");
     int b=s.nextInt();
    Area a=new Area();
     a.setDim(l,b);
    System.out.println(a.getArea());
  }
}
