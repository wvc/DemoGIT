import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		List<Person> persons = new ArrayList<>();
		
		persons.add(new Employee("Wim Vancroonenburg", "KU Leuven"));
		persons.add(new Student("Bente Van Eeckhoudt", "KU Leuven"));
		persons.add(new Student("Siebe Roets","KU Leuven"));
		persons.add(new Student("Glenn Groothuis","KU Leuven"));
		persons.add(new Employee("Pieter Smets", "KU Leuven"));
		persons.add(new Student("Nick Braeckman", "KU Leuven"));
		persons.add(new Student("Romeo Permentier", "KU Leuven"));
		persons.add(new Student("Elke Govaert", "KU Leuven"));
		
		for(Person person : persons) {
			person.sayHi();
		}
	}

}
