class Area1 {
    int lenght;
    int breath;

    Area1(int l, int b) {
        this.lenght = l;
        this.breath = b;
    }

    public int area()
    {
        return lenght * breath;
    }
}
 public class Area3{
    public static void main(String[] args) {
        Area1 obj = new Area1(4,5);
        Area1 obj1 = new Area1(5,8);

        System.out.println(obj.area());
        System.out.println(obj1.area());





    }


}