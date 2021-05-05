public class CampaignManager implements CampaignServices {

	@Override
	public void startCampaign(Members members, Product product, Campaigns campaigns) {
		
		System.out.println(campaigns.date+" tarihleri arasýnda geçerli olacak "+campaigns.campaignName+" baþlamýþtýr.");
	}

	@Override
	public void endCampaign(Members members, Product product, Campaigns campaigns) {

		System.out.println(campaigns.date+" tarihleri arasýnda geçerli olan "+campaigns.campaignName+" sona ermiþtir.");
	}

	
		
}
