
public class GamerManager implements GamerService {
	
	
	private GamerCheckService gamerCheckService;
	
	public GamerManager (GamerCheckService gamerCheckServices) {
		super();
		this.gamerCheckService = gamerCheckService;
		
	}
	
	@Override
	public void signUp(Gamer gamer) {
		System.out.println("Kay�t ba�ar�yla yap�ld�." + gamer.getName());
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Bilgiler g�ncellendi." + gamer.getName());
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Silindi." + gamer.getName());
		
	}
	

}
