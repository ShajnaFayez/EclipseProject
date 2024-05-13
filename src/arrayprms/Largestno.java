package arrayprms;

import java.util.Scanner;

public class Largestno {

	public static void main(String[] args) {
		
		int num;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the Size of an Array ");
		num=sc.nextInt();
		System.out.println("Enter the Numbers ");
		int[] ar=new int[num];
		int max=ar[0];
		
		
		for(int i=0;i<num;i++)
		{
			
			ar[i]=sc.nextInt();
		}
		
		for(int i=0;i<ar.length;i++)
		{
			if(max<ar[i])
			{
				max=ar[i];
			}
			
		}
		System.out.println("Largest Number= "+max);
		 
	}

}
