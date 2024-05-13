package oopsprgms;

import java.util.Scanner;

public class RepetedChar {

	public static void main(String[] args) {
		
		
		String s=" ";
		int count;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		s=sc.next();
		 char string[] = s.toCharArray();  
		 
		 
		 
		 for(int i=0;i<string.length;i++)
		 {
			 count=1;
			 for(int j=i+1;j<string.length;j++)
			 {
				   if(string[i] == string[j])
				 {
					 count++;
					 string[j]='0';
				 }
			 }
		 
		 
		 if(count > 1 && string[i] != '0') 
		 {
			 System.out.print("Repeated String= " +string[i]);
             System.out.println(" , Count = "+ count); 
		 }
		 
		 }
		

	}

}
