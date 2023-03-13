package corejava;

interface Animals {
	public void sound();//interface method() without body...
}
class Monkey implements Animals
{
	public void sound()//body of interface method sound
	{
		System.out.println("Monkey sound..");
	}
	
}
class Main //creating class with main method()
{
	public static void main(String[] args)
	{
		Monkey m = new Monkey();//creating obj of class monkey
		m.sound();//calling method() of interface
		
	}
}
