public class Main {
	public static void main(String[] args) {
		AirportSecurityLine sec = new AirportSecurityLine();
		String economy = "Economy Passenger";
		String vip = "VIP Passenger";
		String staff = "Flight Staff";
		
		for(int i = 0; i < 3; i++) {
			sec.addPerson(new Person(economy, Type.ECONOMY));
		}
		
		sec.addPerson(new Person(vip, Type.VIP));
		sec.addPerson(new Person(staff, Type.STAFF));
		
		for(int i = 0; i < 3; i++) {
			sec.addPerson(new Person(economy, Type.ECONOMY));
		}
		
		sec.addPerson(new Person(vip, Type.VIP));
		
		while(!sec.isLineEmpty()) {
			System.out.println(sec.getNextPerson().getName());
		}
	}

}
