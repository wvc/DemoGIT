import java.util.*;

public class Group {

	private int id;
	private List<Person> members = new ArrayList<>();
	
	public Group(int id) {
		// TODO Auto-generated constructor stub
		this.id = id;
	}
	
	public void addMember(Person person) {
		this.members.add(person);
	}
	
	public void sayHi() {
		System.out.println("We are group "+id+":");
		for(Person p : members) {
			System.out.println("-  "+p.getName());
		}
	}
}
