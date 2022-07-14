public class DiamondPattern {
		
		public static void main(String[] args) {	
			
			int i,j,k,alphabet=97;
			for (i = 1; i <=5; i++ ) 
			{
         System.out.print(" ");
        
				for (j = 1; j<=5; j++ ) 
				{
           System.out.print("");
           System.out.print(" ");
          if((i==1||i==5)&&j==3)
          { 
            System.out.print(" ");
            System.out.print((char)(alphabet) );
           
          }
          
				  if(i==2||i==4)
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
            /*else
            {
              System.out.print("");
            }*/
         } 
          
        if(i==3)
        {
          if(j==1||j==5)
          { 
              System.out.print("");
             System.out.print("");
             System.out.print((char)(alphabet));	  
          }
         /*else
          {
            System.out.print("");
          }*/
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
           /*else
            {
              System.out.print("");
            }*/
      
      }
        System.out.println();
    }
  }
}
      
          
			
			