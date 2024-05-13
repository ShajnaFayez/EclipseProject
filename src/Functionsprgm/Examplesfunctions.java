package Functionsprgm;

public class Examplesfunctions {

	public static void main(String[] args) {
		
		//concat 
		
		String s="Hello welcome to Luminar ";
		String s1="Welcome";
		String s2="    Hello   ";
		System.out.println(s.concat(s1));//HelloWElcome
		System.out.println(3+2+5+6); //5hello56
		
		//equals
		
		System.out.println(s.equals(s1));
		System.out.println(s.equals(s2));
		System.out.println(s.equalsIgnoreCase(s2));
		
		//contains
		System.out.println(s.contains("Luminar"));
		
		//tolowercase and touppercase
		
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
		//startswith and ends with
		
		System.out.println(s.startsWith("Hello"));
		System.out.println(s.endsWith("Luminar"));
		
		//trim
		
		System.out.println(s2.trim());
		
		//charAt
		
		System.out.println(s.charAt(3));
		
		//length()
		
		System.out.println(s1.length());
		
		//substring
		
		System.out.println(s1.substring(1,4));
		
		//replace
		
		System.out.println(s.replace("hello", "hai"));
		
		//split
		
		String[] str=s.split(" ");
		for(String v:str)
		{
			System.out.println(v);
		}
		
		//tochaarray
		
		char[] ch=s1.toCharArray();
		for(char c:ch)
		{
			System.out.println(c);
		}
		
		

	}

}
