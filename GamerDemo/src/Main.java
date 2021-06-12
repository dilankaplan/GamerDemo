
public class Main {

	public static void main(String[] args) {
		GamerManager gamerManager = new GamerManager(new MernisServiceAdapter());
		gamerManager.signUp(new Gamer(1, "DÝLAN", "KAPLAN", "11964095162", 1998));
		
		GameManager gameManager = new GameManager();
		gameManager.add(1,"Call Of Duty",500);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add("BlackFriday");

		SaleManager saleManager = new SaleManager();
		saleManager.buy("Dilan", "Call Of Duty", "BlackFriday");
	}

}
