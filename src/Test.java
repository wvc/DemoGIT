import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		List<Group> groups = new ArrayList<>();
		
		
		Group group1 = new Group(1);
		group1.addMember(new Student("Romeo Permentier", "KUL"));
		
		for(Group group : groups) {
			group.sayHi();
		}
	}

}
