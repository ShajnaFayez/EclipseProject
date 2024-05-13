package praticequestions;

class Animal
{
	public void makeasound()
	{
		System.out.println("Bark");
	}
}

class Cat extends Animal
{
	
}

public class Inheritance {

	public static void main(String[] args) {
		Cat c=new Cat();
		c.makeasound();

	}

}
