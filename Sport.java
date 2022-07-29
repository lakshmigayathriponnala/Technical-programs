/* JFM1T9_Assignment5:
	Create an object named obj of the class Main and print the reference to the object using this keyword.
        
        Sample Output:
        Sport name: Football
*/ 
      
import java.util.Scanner;
public class Sport
  {
    private String Sportname;
    public Sport(String s)
    {
      this.Sportname=s;
    }
    public void setsportname(String s1)
    {
      Sportname=s1;
    }
    public String getSportname()
    {
      return Sportname;
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("sportname");
      String s=sc.nextLine();
      Sport ob=new Sport(s);
      System.out.println("sportname="+ob.getSportname());
      
    }
  }
      
    
      
      
      

  
