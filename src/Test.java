import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		List<Group> groups = new ArrayList<>();
		
		Group groep5 = new Group(5);
		groep5.addMember(new Student("Jonas Welvaert","KU Leuven"));
		groep5.addMember(new Student("Christophe De Backer", "KU Leuven"));
		groep5.addMember(new Student("Brecht Willems", "Val-Thorens snooze Academy"));
		
		groups.add(groep5);
		for(Group group : groups) {
			group.sayHi();
		}
	}

}
