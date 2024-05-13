package arrayprms;

import java.util.Scanner;

public class Stringarrayprhm {

	public static void main(String[] args) {
           
		Scanner sc=new Scanner(System.in);
		System.out.println("Size of String");
		int n;
		n=sc.nextInt();
		System.out.println("Enter String");
		String[] arr=new String[n];
		for(int i=0;i<n;i++)
		{
			
		  arr[i]=sc.next();
		}
		System.out.println("Entered Strings =");
		for (String v:arr)
		{
			System.out.println(v);
		}
	}

}

