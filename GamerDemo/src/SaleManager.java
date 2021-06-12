
public class SaleManager implements SaleService {
	
	@Override
	public void buy(Gamer gamer, Game game, Campaign campaign) {
		System.out.println("Sevgili" + gamer.getName() + campaign.getCampaignName() + "kampanyas� ile " + game.getGameName() + "adl� oyunu sat�n alma i�leminiz ba�ar�yla ger�ekle�mi�tir.�yi e�lenceler." );
	}

	@Override
	public void toReturn(Gamer gamer, Game game, Campaign campaign) {
		System.out.println("�ade i�leminiz ger�ekle�tirildi.�yi g�nler");
		
	}
	  
	

}
