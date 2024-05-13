package constuctorprgms;

public class Basicconstuctors {
	
	int studid,age;
	String studname;
	
	public Basicconstuctors(int studid,String studname,int age)
	{
		this.studid=studid;
		this.studname=studname;
		this.age=age;
	}

	public static void main(String[] args) {
		
		Basicconstuctors ob=new Basicconstuctors(101,"Ann",21);
		System.out.println(ob.studid);
		System.out.println(ob.studname);
		System.out.println(ob.age);
		
		
		

	}

}
