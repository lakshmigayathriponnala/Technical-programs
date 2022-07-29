./* Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating a class named Triangle with constructor having the three sides as its parameters.*/
class Area4
{
    int s1=3;
    int s2=4;
    int s3=5;
    public static void main(String[] args)
      {
             Area4 t1=new Area4();
             int perimeter=(t1.s1+t1.s2+t1.s3);
             System.out.println("perimeter is:"+perimeter);
             int p=(perimeter/2);
             int q=((((p*(p-t1.s1))*(p-t1.s2))*(p-t1.s3)));       
             int area=(int)Math.sqrt(q);   
             System.out.println("Area is:"+area);
      }
}
