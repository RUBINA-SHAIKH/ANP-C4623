package corejava;

class StudentEX3 extends Persons
{
	int studentId;
	String major;
	//adding parameterized constructor
	
	public StudentEX3(String name, int age, int studentId, String major)
	{
		super(name, age);
		this.studentId = studentId;
		this.major = major;
	}
	//adding getters and setters method

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
}
	
	