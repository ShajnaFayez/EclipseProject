package oopsprgms;

interface TVremote
{
	public void onbutton();
	public void offbutton();
	public void volumnup();
	public void volumndown();
	
}

interface SmartTVremote extends TVremote
{
	public void youtubebutton();
	public void amazonprimebutton();
}

class TV implements  SmartTVremote
{

	@Override
	public void youtubebutton() {
		System.out.println("Youtube Details");
		
	}

	@Override
	public void amazonprimebutton() {
		System.out.println("Amazonprime Details");
		
	}

	@Override
	public void onbutton() {
		System.out.println("TV ON");
		
	}

	@Override
	public void offbutton() {
		System.out.println("TV OFF");
		
	}

	@Override
	public void volumnup() {
		System.out.println("Volumne UP");
		
	}

	@Override
	public void volumndown() {
		System.out.println("Volumne Down");
		
	}

}

public class TVProgram {

	public static void main(String[] args) {
		TV ob=new TV();
		ob.onbutton();
		ob.offbutton();
		ob.volumnup();
		ob.volumndown();
		ob.youtubebutton();
		ob.amazonprimebutton();

	}

}
