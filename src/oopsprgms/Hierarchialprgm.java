package oopsprgms;

class Member
{
	String name;
	int age;
	long phoneno;
	int salary;
	String address;
	
	public void printdetails()
	{
		System.out.println("Name= "+name);
		System.out.println("Age= "+age);
		System.out.println("Adress= "+address);
		System.out.println("phoneno "+phoneno);
		System.out.println("Salary= "+salary);
		
	}
}

class Employee2 extends Member
{
	String specialzation;
}

class Manager extends Member
{
	String department;
}

public class Hierarchialprgm {

	public static void main(String[] args) {
	 
		Employee2 ob1=new Employee2();
		ob1.name="Ann";
		ob1.age=20;
		ob1.address="abc";
		ob1.phoneno=2345678;
		ob1.salary=45000;
		ob1.printdetails();
		System.out.println(ob1.specialzation="Testing");
		
		Manager ob2=new Manager();
		ob2.name="Anu";
		ob2.age=22;
		ob2.address="hgj";
		ob2.phoneno=345678;
		ob2.salary=60000;
		ob2.printdetails();
		System.out.println(ob2.department="IT");
				

	}

}























































































































































































