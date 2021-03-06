import java.util.ArrayList;
import java.util.Arrays;
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
		
		Group group2 = new Group(2);
		group2.addMember(new Student("Pieter Carlu", "KU Leuven"));
		group2.addMember(new Student("Victor Goeman", "KU Leuven"));
		group2.addMember(new Student("Tim Ameye", "KU Leuven"));
		
		Group groep3 = new Group(3);
		groep3.addMember(new Student("Siebe Roets","KU Leuven"));
		groep3.addMember(new Student("Bente Van Eeckhoudt","KU Leuven"));
		groep3.addMember(new Student("Glenn Groothuis","KU Leuven"));
		
		Group groep4 = new Group(4);
		groep4.addMember(new Student("Dairo de Ruck", "KU Leuven"));
		groep4.addMember(new Student("Sam Dobbelaere", "KU Leuven"));
		groep4.addMember(new Student("Willem Juwet", "KU Leuven"));

		
		Group groep5 = new Group(5);
		groep5.addMember(new Student("Jonas Welvaert","KU Leuven"));
		groep5.addMember(new Student("Christophe De Backer", "KU Leuven"));
		groep5.addMember(new Student("Brecht Willems", "Val-Thorens snooze Academy"));
		
		groups.addAll(Arrays.asList(groupAdmin,group1,group2,groep3,groep4,groep5));
		for(Group group : groups) {
			group.sayHi();
		}
	}

}
