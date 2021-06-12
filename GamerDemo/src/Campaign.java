
public class Campaign implements Entity{
    private int campaignId;
    private String campaignName;
    private int campaignRate;
    
    public int getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public int getCampaignRate() {
		return campaignRate;
	}

	public void setCampaignRate(int campaignRate) {
		this.campaignRate = campaignRate;
	}

	public Campaign() {
    	
    }

	public Campaign(int campaignId, String campaignName, int campaignRate) {
		super();
		this.campaignId = campaignId;
		this.campaignName = campaignName;
		this.campaignRate = campaignRate;
	}


    
}
