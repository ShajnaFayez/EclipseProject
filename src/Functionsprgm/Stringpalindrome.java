package Functionsprgm;

import java.util.Scanner;

public class Stringpalindrome {

	public static void main(String[] args) {

       String str=" ";
       String reverse=" ";
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the String");
        str=sc.next();
       int strLength = str.length();
       
       for (int i = (strLength - 1); i >0; i--)
       {
    	      reverse = reverse + str.charAt(i);
        }

    	    if (str.equals(reverse)) 
    	    {
    	      System.out.println(str + " is a Palindrome String.");
    	    }
    	    else
    	    {
    	      System.out.println(str + " is not a Palindrome String.");
    	    }
    	 
    	    
    	

    	   


	}

}
