package classobjectpgms;

import java.util.Scanner;

public class Calculatorprgm {

	public static void main(String[] args) {
		
		System.out.println("Enter 1st Number =");
		Scanner obj=new Scanner(System.in);
		int a=obj.nextInt();
		System.out.println("Enter 2nd Number =");
		int b=obj.nextInt();
		
		System.out.println("Enter ur Choice 1. Addition, 2. Substraction, 3. Multiplication, 4. Division");
		int c= obj.nextInt();
		
		switch(c)
		{
			case 1:
				int r=a+b;
				System.out.println("Result = "+r);
				break;
			case 2:
				 r=a-b;
				System.out.println("Result = "+r);
				break;
			case 3:
				 r=a*b;
				System.out.println("Result = "+r);
				break;
			case 4:
				 r=a/b;
				System.out.println("Result = "+r);
				break;
				
			 default:
			        System.out.println("Invalid operator!");
			        break;
		}

	}

}
