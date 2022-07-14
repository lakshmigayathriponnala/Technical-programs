import java.io.*;
import java.util.*;
public class max2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a;
		int b;
		System.out.println("enter 1st value");
		a=sc.nextInt();
		System.out.println("enter 2nd value");
		b=sc.nextInt();
		if(a<=b)
		{
			System.out.println("large number is"+b);
		}
		else
    {
			System.out.println("large number is"+a);
		}

}
}
