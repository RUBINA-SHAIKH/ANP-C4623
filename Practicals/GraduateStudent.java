package corejava;

public class GraduateStudent extends StudentEX3
{
	String advisor;
	String thesistopic;
	//adding parameterized constructor
	public GraduateStudent(String name, int age, int studentId, String major, String advisor, String thesistopic)
	{
		super(name, age, studentId, major);
		this.advisor = advisor;
		this.thesistopic = thesistopic;
	}
	
	//adding getters and setters method
	
	public String getAdvisor() {
		return advisor;
	}

	public void setAdvisor(String advisor) {
		this.advisor = advisor;
	}

	public String getThesistopic() {
		return thesistopic;
	}
	public void setThesistopic(String thesistopic) {
		this.thesistopic = thesistopic;
	}
    


}
