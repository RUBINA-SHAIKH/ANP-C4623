package corejava;

interface Myinterface
{
	public void doSomething();//interface method() without body
}

class MyClass implements Myinterface //creating class MyClass
{
	public void doSomething()//body of interface method sound
	{
		System.out.println("Doing Something...");
	}
}
class MyMain // creating class with mymain method()
{
	public static void main(String[] args)
	{
		MyClass mc = new MyClass();//creating obj of class myclass 
		mc.doSomething();//calling method() of interface
	}
}
