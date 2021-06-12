
public class Gamer implements Entity{
	private int id;
	private String name;
	private String lastname;
	private String identity›d;
	private String birthYear;
	
	public Gamer() {
		
	}
	
	public Gamer(int id, String name, String lastname, String identity›d, String birthYear) {
		super();
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.identity›d = identity›d;
		this.birthYear = birthYear;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getIdentity›d() {
		return identity›d;
	}

	public void setIdentity›d(String identity›d) {
		this.identity›d = identity›d;
	}

	public String getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(String birthYear) {
		this.birthYear = birthYear;
	}

	
	

}
