import java.util.Scanner;
public class gross{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    System.out.println("enter basic salary");
	    int basic=sc.nextInt();
	    if(basic<=10000)
	    {
	    	int HRA=(basic*20)/100; 
	        int DA=(basic*80)/100;
	 	    int gross=basic+HRA+DA;
	 	    System.out.println("HRA: "+HRA);
		    System.out.println("DA: "+DA);
		    System.out.println("Gross Salary: "+gross);
	    }
	    else if(basic<=20000)
	    {
	    	int HRA=(basic*25)/100; 
	        int DA=(basic*90)/100;
	 	    int gross=basic+HRA+DA;
	 	    System.out.println("HRA: "+HRA);
		    System.out.println("DA: "+DA);
		    System.out.println("Gross Salary: "+gross);
	    }
	    else if(basic>20000)
	    {
	    	int HRA=(basic*30)/100; 
	        int DA=(basic*95)/100;
	 	    int gross=basic+HRA+DA;
	 	    System.out.println("HRA: "+HRA);
		    System.out.println("DA: "+DA);
		    System.out.println("Gross Salary: "+gross);
	    }
	    
	}

}