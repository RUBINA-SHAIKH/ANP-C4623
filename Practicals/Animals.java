package corejava;

interface Animals {
	public void sound();//interface method() without body...
}
class Monkey implements Animals
{
	public void sound()//body of interface method sound
	{
		System.out.println("hoop hoop");
	}
	
}
class Main
{
	public static void main(String[] args)
	{
		Monkey m = new Monkey();
		m.sound();//calling method 
		
	}
}
