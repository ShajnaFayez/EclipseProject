package arrayprms;

import java.util.Scanner;

public class Positivenegativezeros {

	public static void main(String[] args) {
		
		int positive= 0,negative=0,zero=0,num;
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Size of an array=");
		num=sc.nextInt();
		int[] ar=new int[num];
		
		System.out.println("Enter Numbers=");
		
		for(int i=0;i<num;i++)
		{
			ar[i]=sc.nextInt();
		}
		for(int i=0;i<num;i++)
		{
			if(ar[i]<0)
			{
				negative++;
			}
			else if(ar[i]==0)
			{
				zero++;
			}
			else
			{
				positive++;
			}
			
			
		}
		System.out.println("Positive Numbers= " +positive );
		System.out.println("Negative Numbers ="+negative);
		System.out.println("Zero's= "+zero);

	}

}
