import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		List<Group> groups = new ArrayList<>();
		
		Group groep5 = new Group(5);
		groep5.addMember(new Student("Jonas Welvaert","KU Leuven"));
		
		for(Group group : groups) {
			group.sayHi();
		}
	}

}
