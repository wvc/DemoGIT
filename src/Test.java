import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		List<Group> groups = new ArrayList<>();
		Group groep3 = new Group(3);
		groep3.addMember(new Student("Siebe Roets","KU Leuven"));
		groep3.addMember(new Student("Glenn Groothuis","KU Leuven"));
		for(Group group : groups) {
			group.sayHi();
		}
	}

}
