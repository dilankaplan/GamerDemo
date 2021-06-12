
public class GameManager implements GameService {

	@Override
	public void add() {
		System.out.println("Oyun eklendi.");
		
	}

	@Override
	public void update() {
		System.out.println("Oyun güncellendi.");
		
	}

	@Override
	public void delete() {
		System.out.println("Oyun silindi.");
		
	}
	

}
