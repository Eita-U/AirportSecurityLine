import java.util.LinkedList;
import java.util.Queue;

public class AirportSecurityLine {
	private Queue<Person> economy;
	private Queue<Person> special;
	
	public AirportSecurityLine() {
		economy = new LinkedList<Person>();
		special = new LinkedList<Person>();
	}
	
	public void addPerson(Person p) {
		if(p.getType() == Type.STAFF || p.getType() == Type.VIP) {
			special.add(p);
		}else {
			economy.add(p);
		}
	}
	
	public Person getNextPerson() {
		if(!special.isEmpty()) {
			return special.poll();
		}else {
			return economy.poll();
		}
	}
	
	public boolean isLineEmpty() {
		return (economy.isEmpty() && special.isEmpty());
	}
}
