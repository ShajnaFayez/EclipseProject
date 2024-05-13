package classobjectpgms;

import java.util.Scanner;
public class Read2numbers {

	public static void main(String[] args) {
		
		System.out.println("Enter 1st Number");
		Scanner obj=new Scanner(System.in);
		int a=obj.nextInt();
		
		System.out.println("Enter 2nd Number");
		int b=obj.nextInt();
		
		System.out.println("Enter 1st Number= " +a);
		System.out.println("Enter 2nd Number= " +b);

	}

}
