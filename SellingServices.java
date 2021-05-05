
public interface SellingServices {

	void DefaultSelling(Members members, Product product, Selling selling);
	
	void CampaignSelling(Members members, Product product, Selling selling, Campaigns campaigns);
	
	void DiscountSelling(Members members, Product product, Selling selling, Discounts discounts);
}
