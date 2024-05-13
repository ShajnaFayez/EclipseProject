package oopsprgms;


	
	class X
	{
		public void method1()
		{
			System.out.println("method 1");
		}
	}
	class Y extends X
	{
		public void method2()
		{
			System.out.println("method 2");
		}
	}
	
	class Z extends Y
	{
		public void method3()
		{
			System.out.println("method 3");
		}
	}
	
		public class Mutilevelinheritance {
	
	public static void main(String[] args) {

            Z ob=new Z();
            ob.method1();
            ob.method2();
            ob.method3();
            
	
	
	}
	

}

