package pkg;

public class Swapnumbers {

	public static void main(String[] args) {
		
		int a=10,b=20;
		int swap;
		System.out.println("Before Swapping a="  +a);
		System.out.println("Before Swapping b="  +b);
		swap=a;
		a=b;
		b=swap;
		System.out.println("After Swapping a=  "+a);
		System.out.println("After Swapping b=  "+b);
		
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping a=  "+a);
		System.out.println("After Swapping b=  "+b);
		
		// get second digit %10
		
		int c=4598;
		System.out.println(c%10);
		
	

	}

}
