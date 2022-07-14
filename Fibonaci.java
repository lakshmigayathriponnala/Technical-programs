import java.util.Scanner;
public class Fibonaci 
{
    public static void main(String[] args) 
    {
        int n, a = 0, b = 0, c = 1;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter value of n:");
        n = s.nextInt();
        System.out.print("Fibonacci Series:");
        for(int i = 1; c<n-2; i++)
        {
            a = b;
            b = c;
            c = a + b;
            System.out.print(c+" ");
        }
    }
}