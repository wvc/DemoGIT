
public class Student extends Person {

	private String school;
	
	public Student(String name, String school) {
		super(name);
		this.school = school;
		// TODO Auto-generated constructor stub
	}
	
	public String getSchool() {
		return school;
	}
	
	@Override
	public void sayHi() {
		// TODO Auto-generated method stub
		super.sayHi();
		System.out.println("I study at "+school+".");
	}

}
