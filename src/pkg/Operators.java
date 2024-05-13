package pkg;

public class Operators {

	public static void main(String[] args) {
		 
		//Arithematic operators
		
		int a=40,b=20;
		
		System.out.println("a+b="+ (a+b));
		System.out.println("a-b="+(a-b));
		System.out.println("a*b="+(a*b));
		System.out.println("a/b="+(a/b));
		System.out.println("a%b="+(a%b));
		
		System.out.println("-----Assignment operators");
		 
		System.out.println(a=b);
		System.out.println(a+=b);
		
		
		System.out.println("-----Relational operators------");
		
		int a1=10,a2=20;
		 
		System.out.println(a1<a2);
		System.out.println(a1==a2);
		
		System.out.println("------Logical operators-----");
		
		// A       B       A&&B    A||B    !A      !B
		// 0       0        0        0      1       1
		// 0       1        0        1      1       0
		// 1       0        0        1      0       1
		// 1       1        1        1      0       0
		
		
		String username="abc";
		String password="abc123";
		 
		System.out.println(username=="abc" && password=="abc123");
		System.out.println(username=="abc" || password=="abc123");
		System.out.println(!(username=="abc"));
		
		System.out.println("-----uniary operators-----");
		
		int s=10;
		System.out.println(s++);
		System.out.println(s);
		System.out.println(++s);
		
		
		System.out.println("-------Ternary operators----");
		
		String str=a1>a2?"a1 is greater":"a2 is greater";
		System.out.println(str);
		
		
	}

}
