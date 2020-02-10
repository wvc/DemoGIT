
public class Person {

	
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void sayHello() {
		System.out.println("Hi, my name is "+name+".");
	}
}
