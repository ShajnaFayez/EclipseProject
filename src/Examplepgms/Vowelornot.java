package Examplepgms;

import java.util.Scanner;

public class Vowelornot {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s=sc.next();
		s=s.toLowerCase();
		int count=vowel(s);
		
		System.out.println("Vowel count= "+count);
		
		
		
		

	}
	
	public static int vowel(String s)
	{ 
	   int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'|| s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
			{
				count++;
			}
		}
		return count;
		}
	 
		
	

} 
