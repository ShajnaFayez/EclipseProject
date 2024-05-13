package oopsprgms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptionprgm {
	
	//runtime expn

	public static void main(String[] args) throws FileNotFoundException {
		
		FileInputStream f=new FileInputStream("C://book1.xlsx");
	
		try
		{
			int a=2,b=0;
			double c=a/b;
			System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("Exception Handled");

	}

}
