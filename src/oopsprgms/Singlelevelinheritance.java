package oopsprgms;

class Super
{
	public void superclassmethod()
	{
		System.out.println("Details");
	}
}

class Sub extends Super
{
	public void subclassmethod()
	{
		System.out.println("Child Details");
	}
}

public class Singlelevelinheritance {

	public static void main(String[] args) {
		
         Sub ob=new Sub();
         ob.subclassmethod();
         ob.superclassmethod();
	}

}
