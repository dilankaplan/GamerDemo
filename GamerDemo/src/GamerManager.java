
public class GamerManager implements GamerService {
	
	
	private GamerCheckService gamerCheckService;
	
	public GamerManager (GamerCheckService gamerCheckServices) {
		super();
		this.gamerCheckService = gamerCheckService;
		
	}
	
	@Override
	public void signUp(Gamer gamer) {
		System.out.println("Kayýt baþarýyla yapýldý." + gamer.getName());
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Bilgiler güncellendi." + gamer.getName());
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Silindi." + gamer.getName());
		
	}
	

}
