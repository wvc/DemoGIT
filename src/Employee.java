
public class Employee extends Person {

	private String company;
	
	public Employee(String name, String company) {
		super(name);
		this.company = company;
		// TODO Auto-generated constructor stub
	}
	
	public String getCompany() {
		return company;
	}
	
	@Override
	public void sayHi() {
		// TODO Auto-generated method stub
		super.sayHi();
		System.out.println("I work at "+company+".");
	}

}
