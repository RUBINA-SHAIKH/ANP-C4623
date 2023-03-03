package corejava;

class CatSubClass extends AbstractionAnimalEx 
{

	public CatSubClass(int age) {
		super(age);
	}

	@Override
	public String toString() {
		return "CatSubClass [Age=" + Age + ", getAge()=" + getAge() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

}
