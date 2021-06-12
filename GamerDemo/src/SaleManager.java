
public class SaleManager implements SaleService {
	
	@Override
	public void buy(Gamer gamer, Game game, Campaign campaign) {
		System.out.println("Sevgili" + gamer.getName() + campaign.getCampaignName() + "kampanyasý ile " + game.getGameName() + "adlý oyunu satýn alma iþleminiz baþarýyla gerçekleþmiþtir.Ýyi eðlenceler." );
	}

	@Override
	public void toReturn(Gamer gamer, Game game, Campaign campaign) {
		System.out.println("Ýade iþleminiz gerçekleþtirildi.Ýyi günler");
		
	}
	  
	

}
