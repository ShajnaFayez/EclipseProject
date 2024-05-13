package oopsprgms;

interface phone
{
	public void space();
	public void apps();
	public void galary();
}

interface laptop
{
	public void brand();
}

class Iphone implements phone,laptop
{

	@Override
	public void space() {
		System.out.println("Iphone Space ");
		
	}

	@Override
	public void apps() {
		System.out.println("Applications in Iphone");
		
	}

	@Override
	public void galary() {
		System.out.println("Photos in Iphone");
		
	}

	@Override
	public void brand() {
		System.out.println("Brand name is DELL");
	}
	
}

class Sumsung implements phone
{

	@Override
	public void space() {
		System.out.println("Sumsung Space");
		
	}

	@Override
	public void apps() {
		System.out.println("Applications Sumsung");
		
	}

	@Override
	public void galary() {
		System.out.println("Sumsung photos");
		
	}
	
}
public class Interfaceprgm {

	public static void main(String[] args) {
		Iphone ob =new Iphone();
		ob.space();
		ob.apps();
		ob.galary();
		ob.brand();
		
		Sumsung ob1=new Sumsung();
		ob1.space();
		ob1.apps();
		ob1.galary();

	}

}
