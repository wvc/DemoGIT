import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		List<Group> groups = new ArrayList<>();
		
		Group groupAdmin = new Group(0);
		groupAdmin.addMember(new Employee("Wim Vancroonenburg","KU Leuven"));
		
		Group group1 = new Group(1);
		group1.addMember(new Student("Romeo Permentier", "KUL"));
		group1.addMember(new Student("Elke Govaert", "KUL"));
		group1.addMember(new Student("Nick Braeckman","KUL"));
		for(Group group : groups) {
			group.sayHi();
		}
	}

}
