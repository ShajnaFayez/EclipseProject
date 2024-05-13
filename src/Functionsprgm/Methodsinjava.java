package Functionsprgm;

public class Methodsinjava {

	public static void main(String[] args) {
		
		Methodsinjava ob=new Methodsinjava();
		ob.add();
		int s=ob.sub(20,10);
		System.out.println("Substraction="+s);
		int m=ob.mul();
		System.out.println("Multiplication="+m);
		ob.div(40,2);
		

	}
	
	//methods without parameter and without returntype
	
	public void add()
	{
		int a=10,b=5;
		int c=a+b;
		System.out.println("Add="+c);
	}
	
	//Methods with parameter and with return type
	
	public int sub(int a,int b)
	{
		int c=a-b;
		return c;
	}
	
	//Methods without parameter and with returntype
	
	public int mul()
	{
		int a=20,b=10;
		int c=a*b;
		
		return c;
	}

	////Methods with parameter and without returntype
	
	public void div(double a,double b)
	{
		double c= a/b;
		System.out.println("Division="+c);
	}
}
