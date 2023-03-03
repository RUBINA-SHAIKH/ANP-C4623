package corejava;

public class TestingProgram {

	public static void main(String[] args)
	{
		//creating object
		GraduateStudent gs = new GraduateStudent("Akanksha",21, 4556,"Python","Parents","Crack GATE");
		
		
		
		//printing all properties
		System.out.println("Name:"+gs.getName()+"\nAge:"+gs.getAge()+"\nStudentID:"+gs.getStudentId()+"\nmajor:"+gs.getMajor()+"\nadvisor:"+gs.getAdvisor()+"\nthesistopic:"+gs.getThesistopic());
		
		

	}





}
