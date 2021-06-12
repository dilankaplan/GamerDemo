
public class Game  implements Entity{
	private int gameId;
	private String gameName;
	private int price;
	
	public Game() {
		
	}
	
	public Game(int gameId, String gameName, int price) {
		super();
		this.gameId = gameId;
		this.gameName = gameName;
		this.price = price;
	}


	public int getGameId() {
		return gameId;
	}


	public void setGameId(int gameId) {
		this.gameId = gameId;
	}


	public String getGameName() {
		return gameName;
	}


	public void setGameName(String gameName) {
		this.gameName = gameName;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	
  } 
}
 
	
	
	