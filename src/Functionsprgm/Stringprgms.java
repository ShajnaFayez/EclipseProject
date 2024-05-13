package Functionsprgm;

public class Stringprgms {

	public static void main(String[] args) {
		
		
		//concat
		
		String s="Hello welcome here";
		String s1="Welcome";
		String s2="hello";
		System.out.println(s.concat(s1));
		System.out.println(3+2+s+5+6);
		
		//equals
		
		System.out.println(s.equals(s1));
		System.out.println(s.equals(s2));
		System.out.println(s.equalsIgnoreCase(s2));
		
		//contains
		
		System.out.println(s.contains("welcome"));

		//touppercase
		
		System.out.println(s.toUpperCase());
		
		//tolowercase
		
		System.out.println(s.toLowerCase());
		
		//startswith
		
		System.out.println(s.startsWith("Hello"));
		
		//endswith
		
		System.out.println(s.endsWith("here"));
		
		//trim
		
		System.out.println(s2.trim());
		
		//charAt
		
		System.out.println(s.charAt(3));
		
		//length
		
		System.out.println(s.length());
		
		//substring
		
		System.out.println(s1.substring(1,4));
		
		//split
		String[] str=s.split(" ");
		for(String v :str)
		{
			System.out.println(v);
		}
		
		
		//replace
		
		System.out.println(s1.replace("Welcome", "Hai"));
		
		//tochararray
		
		char[] ch=s1.toCharArray();
		for(char v1: ch) 
		{
			System.out.println(v1);
		}
	}

}
