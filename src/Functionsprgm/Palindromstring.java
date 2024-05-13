package Functionsprgm;

import java.util.Scanner;

public class Palindromstring {

	public static void main(String[] args) {
		
		String s= " ", reverse = "";
	      Scanner sc = new Scanner(System.in);
	 
	      System.out.println("Enter a string ");
	      s = sc.nextLine();
	 
	      int length = s.length();
	 
	      for ( int i = length - 1; i >= 0; i-- )
	         reverse = reverse + s.charAt(i);
	      
	      System.out.println("Reverse=" +reverse);
	 
	     

	}
	 
}
