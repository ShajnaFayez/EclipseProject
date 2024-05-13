package arrayprms;

import java.util.Scanner;
public class Fibnocii {

	public static void main(String[] args) {
        
		int n , n1 = 0, n2 = 1,fib=0;
        Scanner sc=new Scanner(System.in);
	    System.out.println("Fibonacci Series = ");
        n=sc.nextInt();
	    
	   for(int i=0;i<n;i++)
	    {
	      

	      System.out.print(n1 + ", ");
	      
	      fib = n1 + n2; //0=0+1 fib=1
	      n1 = n2; // 0=1   n1=1
	      n2 = fib; // 1=1   n2=1
	      
	     


	}

}
}
