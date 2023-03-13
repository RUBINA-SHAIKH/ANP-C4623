package corejava;

interface Myinterface
{
	public void doSomething();
}

class MyClass implements Myinterface
{
	public void doSomething()
	{
		System.out.println("Doing Something...");
	}
}
class MyMain
{
	public static void main(String[] args)
	{
		MyClass mc = new MyClass();
		mc.doSomething();
	}
}
