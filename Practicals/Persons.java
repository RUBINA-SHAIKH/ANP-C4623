package corejava;

public class Persons 
{
	String name;
	int age;
	//adding parameterized constructor
	public Persons(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	//adding getter and setter
	
     public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
