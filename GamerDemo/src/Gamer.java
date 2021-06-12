
public class Gamer implements Entity{
	private int id;
	private String name;
	private String lastname;
	private String identityİd;
	private String birthYear;
	
	public Gamer() {
		
	}
	
	public Gamer(int id, String name, String lastname, String identityİd, String birthYear) {
		super();
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.identityİd = identityİd;
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

	public String getIdentityİd() {
		return identityİd;
	}

	public void setIdentityİd(String identityİd) {
		this.identityİd = identityİd;
	}

	public String getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(String birthYear) {
		this.birthYear = birthYear;
	}

	
	

}
