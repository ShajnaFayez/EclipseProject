package Functionsprgm;

public class Areaofshapes {

	public static void main(String[] args) {
		
		Areaofshapes ob=new Areaofshapes();
		ob.circle();
		ob.triangle(20, 10);
		int sq=ob.square();
		System.out.println("Area of Square= "+sq);
		int rec=ob.rectangle(20, 40);
		System.out.println("Area of Rectangle= "+rec);
		

	}
	
	public void circle()
	{
		int r=20;
		double c=3.14*r*r;
		System.out.println("Area of Circle= "+c);
	}
	
	public void triangle(int b,int h)
	{
		double t=0.5*b*h;
		System.out.println("Area of Triangle= "+t);
	}
	
	public int square()
	{
		int a=20;
		int s=a*a;
		return s;
	}
	public int rectangle(int l,int b)
	{
		int r=l*b;
		return r;
	}
}
