import java.util.Scanner;
class non
{
    public static void main(String args[])
    {
       // String s ="rrambabu";
      String s=new String();
      Scanner sc=new Scanner(System.in);
      System.out.println("enetr the string");
      s=sc.nextLine();
        int c=-1;
        for(char i :s.toCharArray())
        {
            // if current character is the last occurrence in the string
            if (s.indexOf(i) == s.lastIndexOf(i))
            {
                System.out.println("First non-repeating character is: "+ i);
                c=0;
                break;
            }
        }

        if(c==-1)
            System.out.println("There is no non repeating character in input string");
    }
}