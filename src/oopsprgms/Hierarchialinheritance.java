package oopsprgms;



	
	class Animal
	{
		public void animalmethod()
		{
			System.out.println("Animal Details");
		}
	}
	class Tiger extends Animal
	{
		public void tigermethod()
		{
			System.out.println("Tiger Details");
		}
	}
	class Lion extends Animal
	{
		public void lionmethod()
		{
			System.out.println("Lion Details");
		}
	}
	
	public class Hierarchialinheritance {
		
		public static void main(String[] args) {
			
			Tiger ob1=new Tiger();
			ob1.animalmethod();
			ob1.tigermethod();
			Lion ob2=new Lion();
			ob2.animalmethod();
			ob2.lionmethod();
			
			
				
				
			}

	
}
