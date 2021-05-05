
public class SellingManager implements SellingServices {

	@Override
	public void DefaultSelling(Members members, Product product, Selling selling) {
		
		System.out.println(members.userName+" isimli kullan�c� "+product.gameName+
				" isimli �r�n� $"+product.gamePrice+"'a sat�n ald�.");
	}

	@Override
	public void CampaignSelling(Members members, Product product, Selling selling, Campaigns campaigns) {
		System.out.println("Kampanya miktar�n�z: "+campaigns.amountOfCampaing);
		System.out.println(members.userName+" isimli kullan�c� "+product.gameName+
				" isimli �r�n� $"+(product.gamePrice-(product.gamePrice*campaigns.amountOfCampaing/100))+"'a sat�n ald�.");		
	}

	@Override
	public void DiscountSelling(Members members, Product product, Selling selling, Discounts discounts) {
		System.out.println("�ndirim miktar�n�z: "+discounts.amountOfDiscount);
		System.out.println(members.userName+" isimli kullan�c� "+product.gameName+
				" isimli �r�n� $"+(product.gamePrice-(product.gamePrice*discounts.amountOfDiscount/100))+"'a sat�n ald�.");
		
	}

}