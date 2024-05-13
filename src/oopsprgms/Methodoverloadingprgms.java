package oopsprgms;


public class Methodoverloadingprgms {

	public static void main(String[] args) {
		Methodoverloadingprgms ob=new Methodoverloadingprgms();
		ob.details(22, 2345678908l);
		ob.details(2345678908l, 21);
		ob.details(2345677889l, 23);
		

	}
	
	public void details(long phoneno,int age)
	{
		System.out.println("Phoneno = "+phoneno);
		System.out.println("Age= = "+age);
	}
	
	public void details(long phoneno,long age)
	{
		System.out.println("Phoneno = "+phoneno);
		System.out.println("Age= = "+age);
	}
	
	public void details(int age,long phoneno)
	{
		System.out.println("Phoneno = "+phoneno);
		System.out.println("Age= = "+age);
	}

}
