import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		List<Group> groups = new ArrayList<>();
		
		Group groupAdmin = new Group(0);
		groupAdmin.addMember(new Employee("Wim Vancroonenburg","KU Leuven"));
		
		for(Group group : groups) {
			group.sayHi();
		}
	}

}
