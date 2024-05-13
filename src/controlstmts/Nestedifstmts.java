package controlstmts;

public class Nestedifstmts {

	public static void main(String[] args) {
		
		int age=20,weight=57;
		if(age>=18)
		{
			if(weight>50) {
				System.out.println("can Donate blood");
			}
			else
			{
				System.out.println("Under weight");
			}
		}
		else
		{
			System.out.println("Can not donate blood");
		}

	}

}
