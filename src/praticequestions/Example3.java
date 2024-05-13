package praticequestions;

class Shape
{
	public void getArea()
	{
		int l=20,w=10,Area;
		Area=l*w;
		System.out.println("Area of Rectangle =" +Area);
		
	}
}

class Rectangle extends Shape
{
	

	
}
public class Example3 {

	public static void main(String[] args) {
		
		Rectangle ob=new Rectangle();
		ob.getArea();

	}

}
