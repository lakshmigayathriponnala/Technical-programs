/* JFM1T4_Assignment5:
   Write a program to print the following pattern:
       a
     a b a
   a b c b a
     a b a
       a
*/

/*public class DiamondPattern {

//Add main method here

//Declare variables i,j,k,m and initialize ch=97(because we are printing alphabet a)

//use for loop and if condition to print a,b,c 
     
}*/
public class DiamondPattern {
		
		public static void main(String[] args) {	
			
			int i,j,k,alphabet=97;
			for (i = 1; i <=5; i++ ) 
			{
         System.out.print(" ");        
				for (j = 1; j<=5; j++ ) 
				{
           
          if((i==1||i==5)&&j==3)
          { 
            System.out.print(" ");
            System.out.print((char)(alphabet) );
           
          }
          
				 else if(i==2||i==4)
				  {
            if(j%2==0)
            {
              System.out.print("");
               System.out.print((char)(alphabet));	
            }
          
            if(j==3)
            {
               System.out.print("");
              System.out.print((char)(alphabet+1));	
            } 
            
         } 
          
       else if(i==3)
        {
          if(j==1||j==5)
          { 
              //System.out.print("");
             
             System.out.print((char)(alphabet));	  
          }
         
          if(j%2==0)
          {
            System.out.print("");
             System.out.print("");
           System.out.print((char)(alphabet+1));	 
          }
          else
          {
            System.out.print("");
          }
				  if(j==3)
          {
             System.out.print("");
             System.out.print("");
             System.out.print((char)(alphabet+2));
          }
         
   			}
           
      
      }
        System.out.println();
    }
  }
}
      





