
public interface DiscountServices {
	
	void successfulDiscount(Members members, Product product, Discounts discounts);
	
	void unsuccessfulDiscount(Members members, Product product, Discounts discounts);
	
	
}
