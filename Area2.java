import java.util.Scanner;

class area{
    int length;
    int breadth;
    area(int a, int b)
    {
         length = a;
         breadth = b;
    }
     int areareturn()
    {
        return length * breadth;
    }
}

public class Area2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a,b;
        System.out.println("Enter the lenght of Recatangle");
         a = s.nextInt();
        s.nextLine();
        System.out.println("Enter the breadth of Recatangle");
        b = s.nextInt();
        area ob1 = new area(a,b);
        System.out.println("Area = "+ ob1.areareturn());
    }
}
