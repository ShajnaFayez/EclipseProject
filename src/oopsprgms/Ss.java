package oopsprgms;

import java.util.Scanner;

public class Ss {

	public static void main(String[] args) {
		

		 String s="  ";
         int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        s=sc.next();

	 for(int i = 0; i < s.length(); i++) 
         {    
	            if(s.charAt(i) != ' ')    
	                count++;    
	   }    
	            
	       
	        System.out.println("Total number of characters in a string: " + count); 

	}

}
