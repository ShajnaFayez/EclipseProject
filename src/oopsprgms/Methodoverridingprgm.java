package oopsprgms;

class Father
{
	public void phone()
	{
		System.out.println("Sumsung");
	}
}

class Son extends Father
{

	@Override
	public void phone() 
	{
		System.out.println("iphone"); 
		super.phone();
	}
	
}
public class Methodoverridingprgm {

	public static void main(String[] args) {
		Son ob=new Son();
		ob.phone();

	}

}
