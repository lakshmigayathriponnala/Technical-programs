class Traingle
  {
    int a,b,c;
    Traingle()
    {
      a=3;b=4;c=5;
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
    class Traingle1
      {
       public static void main(String args[])
        {
          Traingle t=new  Traingle();
          System.out.println(t.getArea());
          System.out.println(t.getPerimeter());
        }
      }
      
    