
public class DiscountManager implements DiscountServices {

	@Override
	public void successfulDiscount(Members members, Product product, Discounts discounts) {
		
		System.out.println(discounts.discountName+" isimli, "+discounts.discountCode+
				" indirim kodu ba�ar�yla uygulanm��t�r.");			
	}

	@Override
	public void unsuccessfulDiscount(Members members, Product product, Discounts discounts) {
		
		System.out.println(discounts.discountName+" isimli, "+discounts.discountCode+
				" indirim kodu uygulanamad�.");			
	}		
}
