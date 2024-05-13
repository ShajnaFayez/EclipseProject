package arrayprms;

import java.util.Scanner;

public class Singledimensionalarray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 4 Numbers");
		 int[] arr=new int[4];
		 for(int i=0;i<4;i++)
		 {

            arr[i]=sc.nextInt();
		 }
		 System.out.println("Enterd Numbers = ");
		 for(int i=0;i<4;i++)
		 {
			 System.out.println(arr[i]);
		 }
	}

}
