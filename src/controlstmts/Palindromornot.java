package controlstmts;

public class Palindromornot {

	public static void main(String[] args) {
		
		int num=2332,temp ,rev=0,r;
		temp=num;
		while(num>0)
		{
			r=num%10;
			rev=rev*10+r;
			num=num/10;
			
		}
	
	if(temp==rev)
	{
		System.out.println("Palindrome number");
	
	}
	else
	{
		System.out.println("Not a Palindrom number");
	}
	}

}
