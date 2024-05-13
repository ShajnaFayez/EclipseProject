package oopsprgms;

import java.util.Scanner;

interface Pet
{
	public void breed();
	public void color();
	public void gender();
	public void price();
}


class Dog implements Pet
{
	
	Scanner sc=new Scanner(System.in);
	@Override
	public void breed() {
		System.out.println("Category of pet = Dog");
		String[] breed= {"German shepherd","Bulldog","Husky"};
		System.out.println("Dog Breed= "+breed);
		
		
	}

	@Override
	public void color() {
		String[] color= {"White","Black","Cream"};
		System.out.println("Color =" +color);
		
		
	}

	@Override
	public void gender() {
		String gender;
		gender=sc.next();
		if(gender=="Male")
		{
			System.out.println("Male Dog" +gender);
					
		}
		else
		{
			System.out.println("Female Dog" +gender);
		}
		
	}

	@Override
	public void price() {
		int price;
		System.out.println("Price =");
		price=sc.nextInt();
		System.out.println(price);
		
	}
	
}

public class PetShop {

	public static void main(String[] args) {
		Dog ob=new Dog();
		ob.breed();
		ob.color();
		ob.gender();
		ob.price();

	}

}
