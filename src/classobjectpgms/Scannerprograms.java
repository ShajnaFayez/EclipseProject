package classobjectpgms;

import java.util.Scanner;

public class Scannerprograms {

	public static void main(String[] args) {
	 
		System.out.println("Enter a Number");
		Scanner objscan=new Scanner(System.in);
		int a= objscan.nextInt();
		System.out.println("Value of a= " +a);
		System.out.println("Enter a name");
		Scanner obj2=new Scanner (System.in);
		String s=obj2.nextLine();
	}

}
