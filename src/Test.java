import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		List<Person> persons = new ArrayList<>();
		
		persons.add(new Employee("Wim Vancroonenburg", "KU Leuven"));
		persons.add(new Student("Jonas Welvaert", "KU Leuven"));
		
		for(Person person : persons) {
			person.sayHi();
		}
	}

}
