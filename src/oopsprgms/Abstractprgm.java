package oopsprgms;

abstract class Teacher
{
	abstract public void school();
	public void classdetails()
	{
		System.out.println("No. of Students");
	}
}

class Student extends Teacher
{

	@Override
	public void school() {
		System.out.println("School Details");
		
	}
	
}

public class Abstractprgm {

	public static void main(String[] args) {
		Student ob=new Student();
		ob.school();
		ob.classdetails();
	}

}
