public class CampaignManager implements CampaignServices {

	@Override
	public void startCampaign(Members members, Product product, Campaigns campaigns) {
		
		System.out.println(campaigns.date+" tarihleri aras�nda ge�erli olacak "+campaigns.campaignName+" ba�lam��t�r.");
	}

	@Override
	public void endCampaign(Members members, Product product, Campaigns campaigns) {

		System.out.println(campaigns.date+" tarihleri aras�nda ge�erli olan "+campaigns.campaignName+" sona ermi�tir.");
	}

	
		
}
