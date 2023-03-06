package corejava;

class Employee
{
	String name;
	int id;
	double salary;
	
		public Employee(String name, int id, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
    void displayDetails() {
    	System.out.println("Name:"+name);
    	System.out.println("ID:"+id);
    	System.out.println("salary:$"+salary);
    	  
    }
    
}

class Manager extends Employee{
	String department;

	public Manager(String name, int id, double salary, String department) {
		super(name, id, salary);
		this.department = department;
	}
	void displayDetails() {
	
	super.displayDetails();
	System.out.println("Department:"+department);
	}
	}

class clerk extends Employee{
int hoursWorked;


public clerk(String name, int id, double salary, int hoursWorked) {
	super(name, id, salary);
	this.hoursWorked = hoursWorked;
}
void displayDetails() {
	super.displayDetails();
	System.out.println("Hours worked:"+hoursWorked);
	
}


 


	public static void main(String[] args) {
	Manager mg=new Manager("Rubina",4548,70000.0,"sales");
	clerk cl=new clerk("Shaikh",2001,50000.0,70);
	mg.displayDetails();
	cl.displayDetails();

	}

}
