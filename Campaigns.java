
public class Campaigns {

	String campaignName;
	String date;
	float amountOfCampaing;
	
	public Campaigns(String campaignName, String date, float amountOfCampaing) {
		this.campaignName = campaignName;
		this.date = date;
		this.amountOfCampaing = amountOfCampaing;

	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
}
