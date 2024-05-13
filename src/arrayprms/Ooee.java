package arrayprms;

import java.util.Scanner;

public class Ooee {

	public static void main(String[] args) {
		
		 int ar[]={1,2,3,4,5,6,7,8,9,10};  
	       System.out.println("Odd Numbers:");  
	        for(int i=0;i<ar.length;i++)
	        {  
	           if(ar[i]%2!=0)
	           {  
	              System.out.println(ar[i]);  
	          }  
	       }  
	             System.out.println("Even Numbers:");  
	              for(int i=0;i<ar.length;i++)
	              {  
	                 if(ar[i]%2==0)
	                 {  
	                     System.out.println(ar[i]);  
	                  }  
	               }
		
	}

}
