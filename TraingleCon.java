class Traingle2
  {
    int a,b,c;
    Traingle2(int a1,int b1,int c1)
    {
      a=a1;
      b=b1;
      c=c1;
    }
    public double getArea()
    {
      double s=(a+b+c)/2.0;
      return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
    public double getPerimeter()
    {
      return (a+b+c);
      
    }
  }
    class TraingleCon
      {
       public static void main(String args[])
        {
          Traingle2 t=new  Traingle2(3,4,5);
          System.out.println(t.getArea());
          System.out.println(t.getPerimeter());
        }
      }
      
    