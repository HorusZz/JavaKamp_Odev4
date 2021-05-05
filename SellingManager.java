
public class SellingManager implements SellingServices {

	@Override
	public void DefaultSelling(Members members, Product product, Selling selling) {
		
		System.out.println(members.userName+" isimli kullanýcý "+product.gameName+
				" isimli ürünü $"+product.gamePrice+"'a satýn aldý.");
	}

	@Override
	public void CampaignSelling(Members members, Product product, Selling selling, Campaigns campaigns) {
		System.out.println("Kampanya miktarýnýz: "+campaigns.amountOfCampaing);
		System.out.println(members.userName+" isimli kullanýcý "+product.gameName+
				" isimli ürünü $"+(product.gamePrice-(product.gamePrice*campaigns.amountOfCampaing/100))+"'a satýn aldý.");		
	}

	@Override
	public void DiscountSelling(Members members, Product product, Selling selling, Discounts discounts) {
		System.out.println("Ýndirim miktarýnýz: "+discounts.amountOfDiscount);
		System.out.println(members.userName+" isimli kullanýcý "+product.gameName+
				" isimli ürünü $"+(product.gamePrice-(product.gamePrice*discounts.amountOfDiscount/100))+"'a satýn aldý.");
		
	}

}