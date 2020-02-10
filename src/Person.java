
public class Person {

	
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void sayHi() {
		System.out.println("Hi, my name is "+name+".");
	}
	
	@Override
	public String toString() {
		return getClass().getSimpleName()+"["+name+"]";
	}
}
