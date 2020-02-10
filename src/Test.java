import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		List<Group> groups = new ArrayList<>();
		Group groep4 = new Group(4);
		groep4.addMember(new Student("Dairo de Ruck", "KU Leuven"));
		for(Group group : groups) {
			group.sayHi();
		}
	}

}
