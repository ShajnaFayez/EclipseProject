package arrayprms;

import java.util.Scanner;

public class Sumofarray {

	public static void main(String[] args) {
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numbers");
		int[] arr=new int[4];
		for(int i=0;i<4;i++)
		{
			 
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		}
		
		System.out.print("Sum = ");
		System.out.println(sum);
		

	}

}
