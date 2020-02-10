import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		List<Group> groups = new ArrayList<>();
		
		Group group2 = new Group(2);
		group2.addMember(new Student("Pieter Carlu", "KU Leuven"));
		for(Group group : groups) {
			group.sayHi();
		}
	}

}
