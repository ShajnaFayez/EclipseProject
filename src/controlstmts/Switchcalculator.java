package controlstmts;

public class Switchcalculator {

	public static void main(String[] args) {
		
		int cal=3;
		int a=20,b=10,c;
		switch(cal)
		{
		case 1:
			System.out.println("Addition");
			c=a+b;
			System.out.println(+c);
			break;
		case 2:
			System.out.println("Substraction");
			c=a-b;
			System.out.println(+c);
			break;
		case 3:
			System.out.println("Multiplication");
			c=a*b;
			System.out.println(+c);
			break;
		case 4:
			System.out.println("Division");
			c=a+b;
			System.out.println(+c);
			break;
		case 5:
			System.out.println("Moduless");
			c=a%b;
			System.out.println(+c);
			break;
			
		default:
			System.out.println("Invalid Choice");
		}

	}

}
