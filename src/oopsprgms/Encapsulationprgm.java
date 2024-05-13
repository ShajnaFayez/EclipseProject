package oopsprgms;

class Encap
{
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	private String name;
	private String details;
	
}
public class Encapsulationprgm {

	public static void main(String[] args) {
		Encap ob= new Encap();
		ob.setId(111);
		ob.setName("Ann");
		ob.setDetails("Full Details");
		System.out.println(ob.getId());
		System.out.println(ob.getName());
		System.out.println(ob.getDetails());

	}

}
